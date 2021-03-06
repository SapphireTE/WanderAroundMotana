# Travel Routes in Montana, USA
````
This project is a back end of a web service based on Java and Spring frameworks.
````
## Configure local environment 
```
docker pull postgres
docker run --name Container_Name -e POSTGRES_USER=${username} -e POSTGRES_PASSWORD=${password} -e POSTGRES_DB=${databaseName} -p ${hostport}:${containerport} -d postgres
```
## Environment properity configuration

```
location:./src/main/resources/META-INF/env

Template:
database.driverName=${driverName}
database.url=${url}
database.port=${port}
database.name=${name}
database.username=${username}
database.password=${password}
app.support.email={email}

mvn compile -Dspring.profiles.active=${env}
```
## Flyway migration
```
mvn compile flyway:migrate -P unit -Ddb_username=${username} -Ddb_url=localhost:${containerport}/${databasename} -Ddb_password=${password} 
```
## Testing
```
location:./src/main/resources/META-INF/env

Template:
database.driverName=${driverName}
database.url=${url}
database.port=${port}
database.name=${name}
database.username=${username}
database.password=${password}
app.support.email={email}

mvn compile test -Dspring.profiles.active=${env} -P ${env}
```
## Create war package file
``` 
mvn compile package -DoutputDirectory=./target -P dev
    in mvn package
```
## User Controller API Demo
![User Login](https://github.com/Tsai-Te/WanderAroundMontana/blob/master/screenshot/Screen%20Shot%202019-03-30%20at%205.23.55%20PM.png?raw=true)


