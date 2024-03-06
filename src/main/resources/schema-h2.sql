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
        name VARCHAR2(50) NOT NULL,
        address VARCHAR2(50) NOT NULL,
        PRIMARY KEY(id)
        );
