# Historia redactada

Como usuario de la aplicación de reservas de canchas,
Quiero poder crear una reserva para una cancha en un horario disponible,
Para asegurarme de que el horario que deseo esté reservado y no pueda ser usado por otra persona.

# Criterios de aceptación (claros y medibles)

El sistema debe permitir crear una reserva si la cancha y el horario están disponibles.
El sistema debe lanzar un error si la cancha no existe.
El sistema debe lanzar un error si el horario ya está reservado.

# Escenario de prueba (BDD: Given-When-Then)

Escenario: Crear una reserva exitosa
Dado que existe una cancha llamada "Cancha 1" de tipo "Fútbol" con horarios disponibles "10:00" y "11:00",
Y que el horario "10:00" no está reservado aún,
Cuando el usuario intenta crear una reserva para "Cancha 1", en la fecha de hoy, horario "10:00",
Entonces la reserva se crea correctamente,
Y el horario "10:00" ya no aparece como disponible en esa cancha