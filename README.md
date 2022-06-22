# doctorify/core

The core backend service for doctorify.

## Technologies

- [Spring Boot]
- [MongoDB]
- [Docker]
  - We use the standard [mongo](https://hub.docker.com/_/mongo) and [openjdk](https://hub.docker.com/_/openjdk) docker
    images

## Development

### Docker based

Local development is enabled through [Docker] and [Docker Compose].

```shell
# Run to spin up the development environment
docker compose -f stack-development.yml up
```

Login to the docker container: `doctorify-core`

```shell
docker exec -it doctorify-core bash
```

To run the service locally:

```shell
cd /home/doctorify/core
./gradlew build
java -jar -Dspring.profiles.active=docker build/libs/core-<version>.jar
```

Access the service at: http://localhost:8080

[Spring Boot]: https://spring.io/projects/spring-boot

[MongoDB]: https://www.mongodb.com/

[Docker]: https://www.docker.com/

[Docker Compose]: https://docs.docker.com/compose/