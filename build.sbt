name := "hello-world"

version := "0.1"

scalaVersion := "2.12.6"

resolvers += Resolver.bintrayRepo("fnproject", "fnproject")

val fdkVersion = "1.0.59"

publishMavenStyle := true

libraryDependencies ++= Seq(
  "com.fnproject.fn" % "api" % fdkVersion,
  "com.fnproject.fn" % "testing" % fdkVersion,
  "org.scalatest" %% "scalatest" % "3.0.1" % Test
)

pomExtra :=
  <build>
    <plugins>
      <plugin>
        <groupId>org.scala-tools</groupId>
        <artifactId>maven-scala-plugin</artifactId>
        <executions>
          <execution>
            <id>compile</id>
            <goals>
              <goal>compile</goal>
            </goals>
            <phase>compile</phase>
          </execution>
          <execution>
            <id>test-compile</id>
            <goals>
              <goal>testCompile</goal>
            </goals>
            <phase>test-compile</phase>
          </execution>
          <execution>
            <phase>process-resources</phase>
            <goals>
              <goal>compile</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>