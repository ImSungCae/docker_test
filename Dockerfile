# JDK 17 기반
FROM openjdk:17

# build할 jar 파일 변수 선언
ARG JAR_FILE=build/libs/*.jar

# build/libs에 있는 JAR파일을 Docker 이미지의 app.jar로 복사
COPY ${JAR_FILE} app.jar

# Docker 컨테이너가 실행되면 java -jar app.jar 명령어를 실행하여 Spring boot 실행
ENTRYPOINT ["java", "-jar", "app.jar"]