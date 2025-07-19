```bash
mvn clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< cl.codewave:reservadecanchas >--------------------
[INFO] Building reservadecanchas 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.1.0:clean (default-clean) @ reservadecanchas ---
[INFO] Deleting C:\Users\mvera\Documents\QA\Mauricio\reservadecanchas\target
[INFO] 
[INFO] --- jacoco:0.8.11:prepare-agent (default) @ reservadecanchas ---
[INFO] argLine set to -javaagent:C:\\Users\\mvera\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.11\\org.jacoco.agent-0.8.11-runtime.jar=destfile=C:\\Users\\mvera\\Documents\\QA\\Mauricio\\reservadecanchas\\target\\jacoco.exec
[INFO] 
[INFO] --- resources:3.0.2:resources (default-resources) @ reservadecanchas ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\mvera\Documents\QA\Mauricio\reservadecanchas\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ reservadecanchas ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 6 source files to C:\Users\mvera\Documents\QA\Mauricio\reservadecanchas\target\classes
[INFO] 
[INFO] --- resources:3.0.2:testResources (default-testResources) @ reservadecanchas ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\mvera\Documents\QA\Mauricio\reservadecanchas\src\test\resources
[INFO]
[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ reservadecanchas ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\Users\mvera\Documents\QA\Mauricio\reservadecanchas\target\test-classes
[INFO] 
[INFO] --- surefire:2.22.1:test (default-test) @ reservadecanchas ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running cl.codewave.service.ReservaServiceTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.628 s - in cl.codewave.service.ReservaServiceTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- jacoco:0.8.11:report (report) @ reservadecanchas ---
[INFO] Loading execution data file C:\Users\mvera\Documents\QA\Mauricio\reservadecanchas\target\jacoco.exec
[INFO] Analyzed bundle 'reservadecanchas' with 4 classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.320 s
[INFO] Finished at: 2025-07-18T20:55:37-04:00
[INFO] ------------------------------------------------------------------------
```