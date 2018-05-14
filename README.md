To run with `fn` then run the following commands:
 - `sbt makePom`
 - `cp target/scala-2.12/hello-world_2.12-0.1.pom pom.xml`
 - `fn run`
 
 This will copy the generated `pom.xml` to the root to allow `fn` to create a function container. This function can then be mounted to a HTTP endpoint in the standard way by creating an app and then mounting e.g.:
 - `fn apps create java-app`
 - `fn deploy --app java-app --local`
 - `fn call java-app /hello-world` or `curl http://localhost:8080/r/java-app/hello-world`