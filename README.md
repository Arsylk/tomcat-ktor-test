# Steps to reproduce

Run 
```./gradlew :war```

## Working scenario
- Tomcat 9.0.54 

Copy `build/libs/ROOT.war` into `docker/working`

Build & deploy container: 
```
docker build -t tomcat-working ./docker/working/
docker run -p 80:8080 tomcat-working
```

### POST without body:
`curl -X POST localhost/method`

RESPONSE: `post text: ''`

### POST with body:
`curl -X POST localhost/method --data 'any text'`

RESPONSE: `post text: 'any text'`


## Broken scenario
- Tomcat 9.0.58

Copy `build/libs/ROOT.war` into `docker/broken`

Build & deploy container:
```
docker build -t tomcat-broken ./docker/broken/
docker run -p 80:8080 tomcat-broken
```

### POST without body:
`curl -X POST localhost/method`

RESPONSE: `post text: ''`

### POST with body:
`curl -X POST localhost/method --data 'any text'`

no response, no error in logs, no timeout even after 60s +