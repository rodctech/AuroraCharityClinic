/* Database Systems, Coronel/Morris */
/* Type of SQL : MySQL */

DROP TABLE IF EXISTS aurora_charity_clinic;

create database if not exists aurora_charity_clinic;

use aurora_charity_clinic;

CREATE TABLE CLINIC_INVENTORY (
ITEM_NUMBER int primary key not null,
MAIN_CATEGORY varchar(30),
SUBCATEGORY varchar(30) DEFAULT " ",
DESCRIPTION varchar(75) DEFAULT " ",
SIZE varchar(8) DEFAULT " ",
ITEM_UNIT varchar(20),
MIN_QTY_REQUIRED int NOT NULL,
QTY_ON_HAND int DEFAULT 0,
VEND_NUMBER int
);
INSERT INTO CLINIC_INVENTORY VALUES(5698,'Gloves','Sterile',' ','6','50/box',500,325, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(5700,'Gloves','Non-Sterile',' ','medium','12/box',300,125,5204 );
INSERT INTO CLINIC_INVENTORY VALUES(6298,'PPE',' ','face mask',' ','20/box',1500,628, 5201);
INSERT INTO CLINIC_INVENTORY VALUES(6981,'Wound Care','Bandage','Sheer Adhesive',' ','15/pk',3500,2510, 5201);

/* -- */

CREATE TABLE EMPLOYEE (
ID_NUMBER int primary key not null,
EMP_LNAME varchar(15),
EMP_FNAME varchar(15),
EMP_MID_INITIAL varchar(1),
EMP_DOB varchar(10),
EMP_JOB_TITLE varchar(45),
CREATE_DELETE_ITEM_ALLOW char(1),
EDIT_ITEM_ALLOW char(1),
READ_DATA_ALLOW char(1),
REPORT_ENABLED char (1),
EMP_PASSWORD varchar(45) not null
);
INSERT INTO EMPLOYEE VALUES('10010','Ramas','Alfred','A','1996/05/31','Inventory Manager','Y','Y','Y','Y','password1');
INSERT INTO EMPLOYEE VALUES('10011','Dunne','Leona','K','2001/06/03','Volunteer Admin Aide','Y','Y','Y','Y','password2');
INSERT INTO EMPLOYEE VALUES('10012','Smith','Lisa','N','1986/07/06','Nurse','N','N','Y','Y', 'password3');
INSERT INTO EMPLOYEE VALUES('10013','Olowski','Paul','F','1975/11/15','Physician','N','N','Y','Y','password4');
INSERT INTO EMPLOYEE VALUES('10014','Orlando','Myron',NULL,'1993/10/14','Volunteer Nursing Aide','N','N','Y','Y','password5');

/*--*/

CREATE TABLE VENDOR (
VEND_NUMBER int,
VEND_NAME varchar(50),
VEND_CONTACT varchar(50),
VEND_AREACODE varchar(3),
VEND_PHONE varchar(8),
VEND_STATE varchar(2)
);

INSERT INTO VENDOR VALUES('5201','Midwest Medical, Inc.','Smithson','615','223-3234','TN');
INSERT INTO VENDOR VALUES('5202','Alco Hospital Supplies','Flushing','904','215-8995','FL');
INSERT INTO VENDOR VALUES('5203','Jensen Sterile Products','Singh','615','228-3245','TN');
INSERT INTO VENDOR VALUES('5204','Gomez Bros. Industrial Supply','Ortega','615','889-2546','KY');

/*--*/

CREATE TABLE REPLENISHMENT (
ID_NUMBER int,
ITEM_NUMBER int,
ORDER_QUANTITY int,
UNIT_PRICE float,
TOTAL_PRICE float,
VEND_NUMBER int
);

INSERT INTO REPLENISHMENT VALUES('10010','5698','150','12.68','1902.00',5203);
