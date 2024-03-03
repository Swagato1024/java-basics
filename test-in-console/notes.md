javac -d out/test -sourcepath src/test -classpath lib/junit-platform-console-standalone-1.10.0.jar:out/production  src/test/io/github/swagato/math/AddTest.java

java -jar lib/junit-platform-console-standalone-1.10.0.jar execute -cp out/test:out/production -c io.github.swagato.math.AddTest 