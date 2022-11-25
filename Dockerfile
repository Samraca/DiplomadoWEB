FROM java11
EXPOSE 8080
ADD helpmeuid-0.0.1-SNAPSHOT.jar helpmeuid.jar
ENTRYPOINT [java, -jar, helpmeuid.jar]

