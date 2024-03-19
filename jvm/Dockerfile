FROM bellsoft/liberica-runtime-container:jre-17.0.10-slim-glibc
ADD ./build/libs/-3.0.jar /app
WORKDIR /app
ENTRYPOINT ["java", "-Duser.timezone=Asia/Seoul", "-jar", "JvmMemory-0.0.1-SNAPSHOT.jar"]