package cl.codewave.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import cl.codewave.model.Cancha;
import cl.codewave.model.Reserva;

@ExtendWith(MockitoExtension.class)
class ReservaServiceTest {

  @Mock
  private ReservaRepository reservaRepository;

  @Mock
  private CanchaRepository canchaRepository;

  @InjectMocks
  private ReservaService reservaService;

  @Captor
  private ArgumentCaptor<Reserva> reservaCaptor;

  private static final LocalDate HOY = LocalDate.now();
  private Cancha cancha;

  @BeforeEach
  void setUp() {
    cancha = new Cancha("Cancha 1", "Fútbol", new HashSet<>(Arrays.asList("10:00", "11:00")));

    reservaService = new ReservaService(reservaRepository, canchaRepository);
  }

  @Test
  void testCrearReservaExitosa() {
    Cancha cancha = new Cancha("Cancha 1", "Fútbol", new HashSet<>(Arrays.asList("10:00", "11:00")));

    when(canchaRepository.findByNombre("Cancha 1")).thenReturn(cancha);

    when(reservaRepository.findByCanchaAndFecha("Cancha 1", HOY)).thenReturn(Collections.emptyList());

    when(reservaRepository.save(any(Reserva.class))).thenAnswer(invocation -> invocation.getArgument(0));

    Reserva reserva = reservaService.crearReserva("1", "Juan", "Cancha 1", HOY, "10:00");

    assertNotNull(reserva);
    assertEquals("Juan", reserva.getNombreCliente());

    verify(reservaRepository).save(reservaCaptor.capture());
    assertEquals("10:00", reservaCaptor.getValue().getHorario());
  }

  @Test
  void testCrearReservaCanchaNoExiste() {
    when(canchaRepository.findByNombre("Cancha 2")).thenReturn(null);

    assertThrows(IllegalArgumentException.class,
        () -> reservaService.crearReserva("1", "Pedro", "Cancha 2", HOY, "10:00"));
    verify(reservaRepository, never()).save(any(Reserva.class));
  }

  @Test
  void testCrearReservaHorarioNoDisponible() {
    Cancha cancha = new Cancha("Cancha 1", "Fútbol", Collections.emptySet());
    when(canchaRepository.findByNombre("Cancha 1")).thenReturn(cancha);

    assertThrows(IllegalArgumentException.class,
        () -> reservaService.crearReserva("1", "Ana", "Cancha 1", HOY, "10:00"));
  }

  @Test
  void testCrearReservaYaReservada() {
    Cancha cancha = new Cancha("Cancha 1", "Fútbol", new HashSet<>(Arrays.asList("10:00", "11:00")));
    when(canchaRepository.findByNombre("Cancha 1")).thenReturn(cancha);
    when(reservaRepository.findByCanchaAndFecha("Cancha 1", HOY))
        .thenReturn(Collections.singletonList(new Reserva("1", "X", "Cancha 1", HOY, "10:00")));

    assertThrows(IllegalArgumentException.class,
        () -> reservaService.crearReserva("2", "B", "Cancha 1", HOY, "10:00"));
  }

  @Test
  void testContarReservasPorDia() {
    when(reservaRepository.findByFecha(HOY)).thenReturn(Arrays.asList(
        new Reserva("1", "A", "C1", HOY, "10:00"),
        new Reserva("2", "B", "C2", HOY, "11:00")));

    int count = reservaService.contarReservasPorDia(HOY);

    assertEquals(2, count);
  }

  @Test
  void testCancelarReserva_Exitoso() {
    Reserva reserva = new Reserva("1", "Juan", "Cancha 1", LocalDate.now(), "10:00");
    Cancha cancha = mock(Cancha.class);

    when(reservaRepository.findById("1")).thenReturn(reserva);
    when(canchaRepository.findByNombre("Cancha 1")).thenReturn(cancha);

    reservaService.cancelarReserva("1");

    verify(reservaRepository).findById("1");
    verify(canchaRepository).findByNombre("Cancha 1");
    verify(cancha).agregarHorario("10:00");
    verify(reservaRepository).deleteById("1");
  }

  @Test
  void testCancelarReserva_CanchaNoExiste() {
    Reserva reserva = new Reserva("1", "Juan", "CanchaX", LocalDate.now(), "10:00");
    when(reservaRepository.findById("1")).thenReturn(reserva);
    when(canchaRepository.findByNombre("CanchaX")).thenReturn(null);

    assertThrows(IllegalArgumentException.class, () -> reservaService.cancelarReserva("1"));

    verify(reservaRepository).findById("1");
    verify(canchaRepository).findByNombre("CanchaX");
    verify(reservaRepository, never()).deleteById("1");
  }

  @Test
  void testCancelarReserva_ReservaNoExiste() {
    when(reservaRepository.findById("999")).thenReturn(null);

    assertThrows(IllegalArgumentException.class, () -> reservaService.cancelarReserva("999"));

    verify(reservaRepository).findById("999");
    verify(canchaRepository, never()).findByNombre(anyString());
  }
}
