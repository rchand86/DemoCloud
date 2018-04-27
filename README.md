This is a backend application for berater mobile app.


## Install and start
mvn clean package spring-boot:run

## Requirements
* Spring milestone as repository
* local installation of MySQL

## installation of MySQL
* Please, install MySQL DB on your local
* Create its schema & user, as per application.yml file.i.e.DB/Connection: bapp,  username: bapp , password: bapp@123 
* Once you build the application using maven(mvn clean package spring-boot:run), it will automatically create your DB tables.
