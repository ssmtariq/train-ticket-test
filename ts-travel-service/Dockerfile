FROM openjdk:8

RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

COPY src/ src/
ADD ./target/ts-travel-service-1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/ts-travel-service-1.0.jar"]

EXPOSE 12346