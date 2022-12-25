FROM ubuntu:18.04

RUN apt update -y \
    && apt-get upgrade -y\
    && apt install software-properties-common -y \
    && add-apt-repository ppa:deadsnakes/ppa -y \
    && add-apt-repository ppa:openjdk-r/ppa -y \
    && apt update -y \
    && apt-get install python3 -y \
    && apt-get install python3-pip -y \
    && apt-get install -y git build-essential \
    && apt-get install -y libnuma-dev

RUN alias python=python3

# RUN mkdir /etc/ssl/certs/java/
RUN apt install -y --reinstall -o Dpkg::Options::="--force-confask,confnew,confmiss" --reinstall ca-certificates-java ssl-cert openssl ca-certificates

RUN apt -y install openjdk-17-jre openjdk-17-jdk

# Downloading and installing Maven
ARG MAVEN_VERSION=3.8.6
ARG USER_HOME_DIR="/root"
RUN mkdir -p /usr/share/maven /usr/share/maven/ref \
    && apt-get install curl -y \
    && echo "Downlaoding maven" \
    && curl -fsSL -o /tmp/apache-maven.tar.gz  https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz \
    && echo "Unziping maven" \
    && tar -xzf /tmp/apache-maven.tar.gz -C /usr/share/maven --strip-components=1 \
    && echo "Cleaning and setting links" \
    && rm -f /tmp/apache-maven.tar.gz \
    && ln -s /usr/share/maven/bin/mvn /usr/bin/mvn
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"
RUN mvn -version

# RUN pip install bintrees google-api-python-client

COPY src/ src/
COPY sperf/ sperf/

WORKDIR sperf/

ENV JXPerf_HOME /sperf
ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk-amd64
ENV MAVEN_HOME /usr/share/maven
ENV PATH $JAVA_HOME/bin:$MAVEN_HOME/bin:$PATH
ENV LD_LIBRARY_PATH $JXPerf_HOME/bin/kissmalloc:$JXPerf_HOME/build/preload:$LD_LIBRARY_PATH
ENV JAVA_AGENT $JXPerf_HOME/thirdparty/allocation-instrumenter/target/java-allocation-instrumenter-HEAD-SNAPSHOT.jar

RUN make -j

# application specific
ADD ./target/ts-train-service-1.0.jar /app/
RUN ln -fs /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

RUN mkdir /cache
WORKDIR /cache

RUN sysctl -a | grep perf_event_paranoid

CMD ["sysctl", "-w", "kernel.perf_event_paranoid=1"]

EXPOSE 14567