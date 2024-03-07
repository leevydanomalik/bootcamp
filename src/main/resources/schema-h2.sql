CREATE TABLE EMPLOYEE
        (
        id NUMBER(10) NOT NULL,
        name VARCHAR2(50) NOT NULL,
        address VARCHAR2(50) NOT NULL,
        PRIMARY KEY(id)
        );

CREATE TABLE CUSTOMER
        (
        id NUMBER(10) NOT NULL,
        name VARCHAR2(50) NOT NULL,
        address VARCHAR2(50) NOT NULL,
        custtype VARCHAR2(10) NOT NULL,
        custstatus VARCHAR2(10) NOT NULL,
        PRIMARY KEY(id)
        );


CREATE TABLE PRODUCT
        (
        id NUMBER(10) NOT NULL,
        productname VARCHAR2(50) NOT NULL,
        productprice VARCHAR2(50) NOT NULL,
        PRIMARY KEY(id)
        );

CREATE TABLE TRANSACTION
        (
       id NUMBER(10) NOT NULL,
        customerId VARCHAR2(50) NOT NULL,
        price VARCHAR2(50) NOT NULL,
        productid VARCHAR2(50) NOT NULL,
        PRIMARY KEY(id)
        );

CREATE TABLE FORMULAONE
        (
        id NUMBER(10) NOT NULL,
        team VARCHAR2(50) NOT NULL,
        chassis VARCHAR2(50) NOT NULL,
        PRIMARY KEY(id)
        );

CREATE TABLE TEAMS
        (
        id NUMBER(10) NOT NULL,
        teamname VARCHAR2(50) NOT NULL,
        hq VARCHAR2(50) NOT NULL,
        leader VARCHAR2(50) NOT NULL,
        chassis VARCHAR2(50) NOT NULL,
        PRIMARY KEY(id)
        );

CREATE TABLE CARS
        (
        id NUMBER(10) NOT NULL,
        enginename VARCHAR2(50) NOT NULL,
        chassisname VARCHAR2(50) NOT NULL,
        teamname VARCHAR2(50) NOT NULL,
        fuel VARCHAR2(50) NOT NULL,
        frontwing VARCHAR2(50) NOT NULL,
        rearwing VARCHAR2(50) NOT NULL,
        onthrottle VARCHAR2(50) NOT NULL,
        offthrottle VARCHAR2(50) NOT NULL,
        frontchamber VARCHAR2(50) NOT NULL,
        rearchamber VARCHAR2(50) NOT NULL,
        fronttoeout VARCHAR2(50) NOT NULL,
        reartoein VARCHAR2(50) NOT NULL,
        PRIMARY KEY(id)
        );


CREATE TABLE DRIVER
        (
        id NUMBER(10) NOT NULL,
        firstname VARCHAR2(50) NOT NULL,
        lastname VARCHAR2(50) NOT NULL,
        nationality VARCHAR2(50) NOT NULL,
        teamname VARCHAR2(50) NOT NULL,
        carnumber VARCHAR2(50) NOT NULL,
        championsip VARCHAR2(50) NOT NULL,
        wins VARCHAR2(50) NOT NULL,
        podiums VARCHAR2(50) NOT NULL,
        careerpoints VARCHAR2(50) NOT NULL,
        poleposition VARCHAR2(50) NOT NULL,
        fastestlap VARCHAR2(50) NOT NULL,
        firstentry VARCHAR2(50) NOT NULL,
        firstwin VARCHAR2(50) NOT NULL,
        lastentry VARCHAR2(50) NOT NULL,
        driverlicense VARCHAR2(50) NOT NULL,
        PRIMARY KEY(id)
        );