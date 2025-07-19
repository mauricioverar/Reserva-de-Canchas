# 🧪 Módulo de Reservas de Canchas con TDD, Mockito y JaCoCo

Este proyecto implementa un **módulo de reservas de canchas** siguiendo el **desarrollo dirigido por pruebas (TDD)**, con **JUnit 5** y **Mockito** para pruebas unitarias, y **JaCoCo** para medir la cobertura de código.

## 📁 Estructura del proyecto

```
src/
├── main/
│   └── java/
│       └── cl/
│           └── codewave/
│               ├── model/
│               │   ├── Cancha.java
│               │   └── Horario.java
│               │   └── Reserva.java
│               ├── repository/
│               │   ├── CanchaRepository.java
│               │   └── ReservaRepository.java
│               └── service/
│                   └── ReservaService.java
├── test/
    └── java/
        └── cl/
            └── codewave/
                └── service/
                    └── ReservaServiceTest.java
```

## 📦 Requisitos

- **Java 17+**
- **Apache Maven 3.9.10** (o superior)
- IDE recomendado: **IntelliJ IDEA, Eclipse o VSCode**
- **JUnit 5**, **Mockito**, **JaCoCo**


## 🧪 Cómo ejecutar las pruebas

Desde la raíz del proyecto:

```bash
mvn test
```

### 📊 Cómo ver el informe de cobertura con JaCoCo

```bash
mvn test jacoco:report
```

El informe se genera en:

```
target/site/jacoco/index.html
```


## ✅ Funcionalidades implementadas

- **Registrar canchas** con nombre, tipo de deporte y horarios disponibles.
- **Crear, modificar y cancelar reservas**.
- **Validar horarios disponibles** y evitar reservas duplicadas.
- **Calcular el número de reservas por día**.
- **Aplicar TDD desde cero** y **pruebas unitarias completas**.
- **Uso de Mockito** para simular repositorios y verificar interacciones.
- **Diseño limpio con principios SOLID**.


## 🧪 Pruebas unitarias

- Se aplicó **TDD** para construir el módulo desde cero.
- Se usó **JUnit 5** para pruebas unitarias.
- Se usó **Mockito** para simular dependencias.
- Se usó **ArgumentCaptor** y **verify()** para validar interacciones.
- Se cubrieron escenarios de éxito y error:
  - Cancha no encontrada
  - Horario no disponible
  - Reserva duplicada
  - Validaciones de parámetros


## 📊 Cobertura con JaCoCo

- Se usó **JaCoCo** para medir la cobertura de código.
- Se logró **cobertura alta (73%+)** con pruebas relevantes.
- Se identificaron áreas de mejora en cobertura y se propusieron pruebas adicionales.
- Se justificó dejar algunas líneas sin cubrir si no aportaban valor funcional.


## 🧾 Historia de usuario (modelo INVEST)

**Como** usuario de la aplicación de canchas,  
**Quiero** poder crear una reserva para una cancha en un horario disponible,  
**Para** asegurarme de que el horario que deseo esté reservado y no pueda ser usado por otra persona.


### Criterios de aceptación

1. El sistema debe permitir crear una reserva si la cancha y el horario están disponibles.
2. El sistema debe lanzar un error si la cancha no existe.
3. El sistema debe lanzar un error si el horario ya está reservado.


### Escenario BDD

**Dado** que existe una cancha llamada "Cancha 1" de tipo "Fútbol" con horarios disponibles "10:00" y "11:00",  
**Y** que el horario "10:00" no está reservado aún,  
**Cuando** el usuario intenta crear una reserva para "Cancha 1" en la fecha de hoy, horario "10:00",  
**Entonces** la reserva se crea correctamente,  
**Y** el horario "10:00" ya no aparece como disponible.


## ✅ Conclusión

Este proyecto demuestra un enfoque profesional del desarrollo de software:

- Aplicación del **TDD desde cero**
- Uso de **mocks avanzados** y verificaciones con **ArgumentCaptor**
- Diseño limpio con **principios SOLID**
- Cobertura de código con **JaCoCo**
- Pruebas unitarias bien estructuradas con **JUnit 5 y Mockito**
- Historia de usuario y escenario BDD
