FROM tomcat:9.0.54
EXPOSE 80:8080
COPY ./ROOT.war/ /usr/local/tomcat/webapps
WORKDIR /usr/local/tomcat
CMD ["catalina.sh", "run"]