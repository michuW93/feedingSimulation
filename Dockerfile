FROM openjdk:8
MAINTAINER michal.walkowiak93@gmail.com
COPY ./out/production/feedingSimulator/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","Main"]