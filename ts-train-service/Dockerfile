FROM java:8-jre

RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

COPY src/ src/
ADD ./target/ts-train-service-1.0.jar /app/
COPY ./lightstep-opentelemetry-javaagent.jar /app/
ENV LS_ACCESS_TOKEN=Vc4iYtTykhCRBCrkM/+CS5S8HmtncU6yO4fM6q9Px2NOl6vm00vBxBKXVs0G1mIqc4IgDy6GM/rKnj2USFNlaYBFaYaewjLKB2/FFOcl
ENV LS_SERVICE_NAME=jaeger-query
CMD ["curl -L \"https://github.com/lightstep/otel-launcher-java/releases/latest/download/lightstep-opentelemetry-javaagent.jar\" > lightstep-opentelemetry-javaagent.jar"]
CMD ["java", "-Xmx200m", "-javaagent:/app/lightstep-opentelemetry-javaagent.jar", "-jar", "/app/ts-train-service-1.0.jar"]

EXPOSE 14567