# SpringMVC-Hibernate-Example

### For correctly deploying you need
> Tomcat 8+

> MySQL 5.5+

### Installation
#### Database
1. Create database `country_info` at `localhost:3306`
2. Create table `country` by execution query
```SQL
CREATE TABLE COUNTRY 
(
   id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
   countryName varchar(100) NOT NULL,
   population int NOT NULL
);
```
3. Having a user with credits `root:root`

#### Deploying
- deploy `SpringMVCHibernateCRUDExample.war` at your Tomcat Server
