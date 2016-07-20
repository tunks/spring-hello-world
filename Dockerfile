FROM java:8
MAINTAINER ebrimatunkara@gmail.com

#2 - WORKDIR and ENV
#WORKDIR /opt/apps
ENV BUILDPATH build

#2- CMD
ADD ./target/spring-hello-world-*.jar $BUILDPATH/spring-hello-world.jar
CMD java -jar $BUILDPATH/spring-hello-world.jar