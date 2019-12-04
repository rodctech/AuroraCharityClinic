/* Database Systems, Coronel/Morris */
/* Type of SQL : MySQL */

DROP SCHEMA IF EXISTS aurora_charity_clinic;

create database if not exists aurora_charity_clinic;

use aurora_charity_clinic;

CREATE TABLE CLINIC_INVENTORY (
ITEM_NUMBER int primary key not null,
main_category varchar(30),
subcategory varchar(30) DEFAULT " ",
Size varchar(10) DEFAULT " ",
DESCRIPTION varchar(75) DEFAULT " ",
ITEM_UNIT varchar(20),
MIN_QTY_REQUIRED int NOT NULL,
QTY_ON_HAND int DEFAULT 0,
VEND_NUMBER int
);
INSERT INTO CLINIC_INVENTORY VALUES(5698,'Gloves','Sterile',' ','Size 6 Gloves','50/box',500,325, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(5625,'Gloves','Sterile',' ','Size 6.5 Gloves','50/box',500,350, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(5616,'Gloves','Sterile',' ','Size 7 Gloves','50/box',500,250, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(5617,'Gloves','Sterile',' ','Size 8 Gloves','50/box',500,325, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(5700,'Gloves','Non-Sterile',' ','Small Canvas Work Gloves ','12/box',300,125,5204 );
INSERT INTO CLINIC_INVENTORY VALUES(5701,'Gloves','Non-Sterile',' ','Medium Canvas Work Gloves ','12/box',300,100,5204 );
INSERT INTO CLINIC_INVENTORY VALUES(5702,'Gloves','Non-Sterile',' ','Large Canvas Work Gloves ','12/box',300,150,5204 );
INSERT INTO CLINIC_INVENTORY VALUES(6298,'PPE',' ',' ','protective personal mask','20/box',1500,628, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(6282,'PPE',' ',' ','protective personal gown','20/box',500,350, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(6285,'PPE',' ',' ','protective mask with shield','20/box',1500,628, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(6262,'PPE',' ',' ','bottle glo germ','10/box',40,25, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(6299,'PPE',' ',' ','black light','1/box',15,6, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(6981,'Wound Care','Bandage',' ','Sheer Adhesive','15/pk',3500,2510, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(6975,'Wound Care','Bandage',' ','Butterfly','15/pk',500,250, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(6964,'Wound Care','Bandage',' ','Steri Strips','20/pk',500,220, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(6965,'Wound Care','Tape',' ','Cloth Surgical Tape','15/pk',300,150, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(6901,'Wound Care','Misc',' ','Staple Remover','1/pk',50,25,5203);
INSERT INTO CLINIC_INVENTORY VALUES(6985,'Personal Care',' ',' ','adult wipes','75/pk',3500,2500, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(4269,'Personal Care',' ',' ','adult disposable briefs','16/pk',320,640, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(6987,'Personal Care',' ',' ','chux','1/pk',30,25, 5203);
INSERT INTO CLINIC_INVENTORY VALUES(4302,'Oxygen','Respitory',' ','nasal cannula','5/pk',500,500, 5201);
INSERT INTO CLINIC_INVENTORY VALUES(4310,'Oxygen','Respitory',' ','Venturi oxygen mask','2/pk',50,30, 5201);
INSERT INTO CLINIC_INVENTORY VALUES(4312,'Oxygen','Respitory',' ','suction tubing','1/pk',50,16, 5201);
INSERT INTO CLINIC_INVENTORY VALUES(4326,'Oxygen','Respitory',' ','Yankauer suction handle','1/pk',5,16, 5201);
INSERT INTO CLINIC_INVENTORY VALUES(4363,'Oxygen','Respitory',' ','sterile water for inhalation','15/pk',45,30, 5201);

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
INSERT INTO EMPLOYEE VALUES('10015','Brown','Charles',NULL,'1983/10/01','Volunteer Admin Aide','N','N','Y','Y','password6');
INSERT INTO EMPLOYEE VALUES('10016','Manchester','Laura','N','1976/03/06','Nurse','N','N','Y','Y', 'password7');
INSERT INTO EMPLOYEE VALUES('10017','Winslow','Peter','F','1979/11/25','Physician','N','N','Y','Y','password8');
INSERT INTO EMPLOYEE VALUES('10018','OBrien','Michael',NULL,'2003/05/14','Volunteer Nursing Aide','N','N','Y','Y','password9');
INSERT INTO EMPLOYEE VALUES('10019','Downey','Carl',NULL,'1991/10/10','Volunteer Nursing Aide','N','N','Y','Y','password10');
INSERT INTO EMPLOYEE VALUES('10020','Myers','Janet',NULL,'1973/07/14','Housekeeping','N','N','N','N','password11');
INSERT INTO EMPLOYEE VALUES('10021','Jackson','Milly',NULL,'1983/07/01','Housekeeping','N','N','N','N','password12');
INSERT INTO EMPLOYEE VALUES('10022','Mabon','River',NULL,'1977/06/14','Housekeeping','N','N','N','N','password13');
INSERT INTO EMPLOYEE VALUES('10023','Rogers','Nancy','E','1954/07/04','Reception','N','N','N','N','password14');


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

INSERT INTO REPLENISHMENT VALUES('10010','5698','150','12.68','1902.00','5203');
