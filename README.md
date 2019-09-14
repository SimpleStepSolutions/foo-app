generated via 

```
NAME=foo-app;curl https://start.spring.io/starter.tgz -d dependencies=web,actuator,flyway,data-jpa,postgresql -d artifactId=$NAME -d name=$NAME -d baseDir=$NAME | tar -xzvf -
```

create a foo
```
curl -d '{"bar":"myBarValue"}' -H "Content-Type: application/json" -X POST http://localhost:8080/foos
```

view foos

```
curl http://localhost:8080/foos
```
