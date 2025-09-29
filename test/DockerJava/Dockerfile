FROM ubuntu

RUN apt update && apt install -y openjdk-11-jdk git

WORKDIR /app
COPY Calculator.java .

RUN javac Calculator.java

CMD ["java", "Calculator"]