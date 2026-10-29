# adb_2026_task_2
Task 2 of Winter Semester 2026/27 advanced database proseminar.
Task 3 get's the same starter code.

Requires JDK 17+, Maven, and PostgreSQL. Configure your local `src/main/java/adb/setup/ConnectionFactory.java` with the database connection settings.

Run from the project root:

```bash
mvn package
java -jar target/adb-1.0-SNAPSHOT.jar
```

If necessary change the main class in pom.xml:
<mainClass>adb.RestartBlocking</mainClass>
