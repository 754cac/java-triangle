## Preparation (Codespaces)

Install OpenJDK 17:
```bash
sudo apt update
sudo apt install openjdk-17-jdk -y
```

Set Java 17 as the default:
```bash
sudo update-alternatives --config java
(Select the Java 17 option.)
```

Set `JAVA_HOME` environment variable:
```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
```

Verify the update:
```bash
java -version
```

## Exercise
`Triangle.java`: View the class under test at `src/main/java/com/example`.

`TriangleTest.java`: View the class under test at `test/main/java/com/example`

Execute to run the automated tests

```
mvn package
```

To view the Jacoco will generate the coverage report, execute

```
python -m http.server
```

Access the website at `localhost:8000`.

Navigate to `/target/site/jacoco/`. 


**Exercise:**: Add  test cases to `TriangleTest.java` to increase the test coverage.
