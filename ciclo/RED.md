```bash
mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< cl.codewave:reservadecanchas >--------------------
[INFO] Building reservadecanchas 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- jacoco:0.8.11:prepare-agent (default) @ reservadecanchas ---
[INFO] argLine set to -javaagent:C:\\Users\\mvera\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.11\\org.jacoco.agent-0.8.11-runtime.jar=destfile=C:\\Users\\mvera\\Documents\\QA\\Mauricio\\reservadecanchas\\target\\jacoco.exec
[INFO]
[INFO] --- resources:3.0.2:resources (default-resources) @ reservadecanchas ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\mvera\Documents\QA\Mauricio\reservadecanchas\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ reservadecanchas ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- resources:3.0.2:testResources (default-testResources) @ reservadecanchas ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\mvera\Documents\QA\Mauricio\reservadecanchas\src\test\resources
[INFO]
[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ reservadecanchas ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\Users\mvera\Documents\QA\Mauricio\reservadecanchas\target\test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[27,11] cannot find symbol
  symbol:   class ReservaRepository
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[30,11] cannot find symbol
  symbol:   class CanchaRepository
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[33,11] cannot find symbol
  symbol:   class ReservaService
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[36,26] cannot find symbol
  symbol:   class Reserva
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[39,11] cannot find symbol
  symbol:   class Cancha
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[43,18] cannot find symbol
  symbol:   class Cancha
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[45,26] cannot find symbol
  symbol:   class ReservaService
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[50,5] cannot find symbol
  symbol:   class Cancha
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[50,25] cannot find symbol
  symbol:   class Cancha
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[56,5] cannot find symbol
  symbol:   class Reserva
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[71,54] cannot find symbol
  symbol:   class Reserva
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[76,5] cannot find symbol
  symbol:   class Cancha
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[76,25] cannot find symbol
  symbol:   class Cancha
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[86,5] cannot find symbol
  symbol:   class Cancha
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[86,25] cannot find symbol
  symbol:   class Cancha
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[89,51] cannot find symbol
  symbol:   class Reserva
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[98,13] cannot find symbol
  symbol:   class Reserva
  location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[99,13] cannot find symbol
  symbol:   class Reserva
  location: class cl.codewave.service.ReservaServiceTest
[INFO] 18 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.144 s
[INFO] Finished at: 2025-07-18T19:51:51-04:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.0:testCompile (default-testCompile) on project reservadecanchas: Compilation failure: Compilation failure:
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[27,11] cannot find symbol
[ERROR]   symbol:   class ReservaRepository
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[30,11] cannot find symbol
[ERROR]   symbol:   class CanchaRepository
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[33,11] cannot find symbol
[ERROR]   symbol:   class ReservaService
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[36,26] cannot find symbol
[ERROR]   symbol:   class Reserva
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[39,11] cannot find symbol
[ERROR]   symbol:   class Cancha
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[43,18] cannot find symbol
[ERROR]   symbol:   class Cancha
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[45,26] cannot find symbol
[ERROR]   symbol:   class ReservaService
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[50,5] cannot find symbol
[ERROR]   symbol:   class Cancha
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[50,25] cannot find symbol
[ERROR]   symbol:   class Cancha
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[56,5] cannot find symbol
[ERROR]   symbol:   class Reserva
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[71,54] cannot find symbol
[ERROR]   symbol:   class Reserva
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[76,5] cannot find symbol
[ERROR]   symbol:   class Cancha
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[76,25] cannot find symbol
[ERROR]   symbol:   class Cancha
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[86,5] cannot find symbol
[ERROR]   symbol:   class Cancha
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[86,25] cannot find symbol
[ERROR]   symbol:   class Cancha
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[89,51] cannot find symbol
[ERROR]   symbol:   class Reserva
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[98,13] cannot find symbol
[ERROR]   symbol:   class Reserva
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] /C:/Users/mvera/Documents/QA/Mauricio/reservadecanchas/src/test/java/cl/codewave/service/ReservaServiceTest.java:[99,13] cannot find symbol
[ERROR]   symbol:   class Reserva
[ERROR]   location: class cl.codewave.service.ReservaServiceTest
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```