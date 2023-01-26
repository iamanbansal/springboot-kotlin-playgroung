
### This is playground to mess with SpringBoot and Kotlin 

To start interacting with postgres container
```
docker exec -it postgres bash 
```
connects to a PostgreSQL database with user playground
```
psql -U playground
```
List all database
```
\l 
```
Create db customer
```
CREATE DATABASE customer  - create database “customer”
```
connect to database “customer”
```
\c customer
``` 
list all tables
```
\d 
```