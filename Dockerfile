FROM openjdk:17-slim

RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        build-essential \
        gcc \
        g++ \
        make \
        libc6-dev \
        && apt-get clean && rm -rf /var/lib/apt/lists/*
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/micro-servicio-lib-arq-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
COPY libcodec.so /lib64
ENV LD_LIBRARY_PATH=/usr/local/lib/jni:/lib64
ENTRYPOINT ["java","-jar","/app.jar"]

