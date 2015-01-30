FROM codenvy/jdk7
RUN mkdir /home/user/app
WORKDIR /home/user/app
ADD $app$ /home/user/$app$
ADD $src$ /home/user/

RUN unzip -q /home/user/$app$ -d /home/user/app && \
    rm /home/user/$app$
# expected to have all dependencies in lib directory and one single jar file application.jar in 'root' directory of archive.
CMD ls -l
CMD java -jar application.jar server /home/user/config.yml

ENV CODENVY_APP_PORT_8080_HTTP 8080
EXPOSE 8080