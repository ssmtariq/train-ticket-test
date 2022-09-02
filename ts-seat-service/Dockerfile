FROM openjdk:8

RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

COPY src/ src/
ADD ./target/ts-seat-service-1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/ts-seat-service-1.0.jar"]

EXPOSE 18898