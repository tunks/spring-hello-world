FROM java:8
MAINTAINER ebrimatunkara@gmail.com

#2 - WORKDIR and ENV
ENV BUILDPATH build
WORKDIR spring-hello-world

#2- CMD
ADD ./target/spring-hello-world-*.jar $BUILDPATH/spring-hello-world.jar
CMD java -jar $BUILDPATH/spring-hello-world.jar