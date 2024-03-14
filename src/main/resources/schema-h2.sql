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

CREATE TABLE MOTOGP
    (
    id NUMBER(10) NOT NULL,
    biker_name VARCHAR2(50) NOT NULL,
    team VARCHAR2(50) NOT NULL,
    nationality VARCHAR2(50) NOT NULL,
    bike_number VARCHAR2(50) NOT NULL,
    bike_brand VARCHAR2(50) NOT NULL,
    wins VARCHAR2(50) NOT NULL,
    podiums VARCHAR2(50) NOT NULL,
    championships VARCHAR2(50) NOT NULL,
    active VARCHAR2(50) NOT NULL,
    PRIMARY KEY(id)
    );

CREATE TABLE BARCELONA
    (
    id BIGINT PRIMARY KEY,
    player_name VARCHAR(255),
    position VARCHAR(255),
    nationality VARCHAR(255),
    age INT,
    appearances INT,
    goals INT,
    assists INT,
    yellow_cards INT,
    red_cards INT
    );

CREATE TABLE CALLOFDUTY
    (
    id NUMBER(10) NOT NULL,
    title VARCHAR2(50) NOT NULL,
    release_year VARCHAR2(50) NOT NULL,
    platform VARCHAR2(50) NOT NULL,
    genre VARCHAR2(50) NOT NULL,
    setting VARCHAR2(50) NOT NULL,
    main_character VARCHAR2(50) NOT NULL,
    multiplayer VARCHAR2(50) NOT NULL,
    dlc_available VARCHAR2(50) NOT NULL,
    sales VARCHAR2(50) NOT NULL,
    rating VARCHAR2(50) NOT NULL,
    PRIMARY KEY(id)
    );


 CREATE TABLE BLINK
    (
     ID NUMBER(10) NOT NULL,
     grade VARCHAR2(50) NOT NULL,
     member VARCHAR2(50) NOT NULL,
     activate VARCHAR2(50) NOT NULL,
     rating VARCHAR2(50) NOT NULL,
     personalrating VARCHAR2(50) NOT NULL,
     datee VARCHAR2(50) NOT NULL,
     timee VARCHAR2(50) NOT NULL,
     PRIMARY KEY(ID)
    );

