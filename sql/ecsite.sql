set names utf8;
set foreign_key_checks = 0;
drop database if exists ecsite;

create database ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

INSERT INTO login_user_transaction(login_id, login_pass, user_name) VALUES("internous", "internous01", "test");
INSERT INTO login_user_transaction(login_id, login_pass, user_name) VALUES("a", "a", "test");


drop table if exists admin_login_user_transaction;

create table admin_login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16)unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);
INSERT INTO admin_login_user_transaction(login_id, login_pass, user_name) VALUES("b", "b", "test");



drop table if exists item_info_transaction;
create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);
insert into item_info_transaction(item_name, item_price, item_stock,insert_date) values
("NoteBook", 100, 50,NOW()),
("Desktop",80, 50,NOW()),
("Mouse",10, 50,NOW()),
("Key Board",10, 50,NOW()),

("��w�󌱖{�i�����j",1500,100,NOW()),
("��w�󌱖{�i�����j",1500,100,NOW()),

("T�V���c�i�{�[�_�[�j",2000,150,NOW()),
("T�V���c�i�΁j",2000,150,NOW()),

("�X�j�[�J�[",6500,80,NOW()),
("�Z���V���[�Y",4000,80,NOW());

drop table if exists user_buy_item_transaction;
create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);

drop table if exists product_list;

create table product_list(
id int not null primary key auto_increment,
product_name varchar(255),
product_description varchar(255),
total_price int,
image_file_path varchar(255)
);

insert into product_list(id,product_name,product_description,total_price,image_file_path) values
(1,"���Z�󌱖{�i�����j","���Z�󌱂�ڎw�����i�����R�[�X�j","1500","image/highschool.syokyu.png"),
(2,"���Z�󌱖{�i�����j","���Z�󌱂�ڎw�����i�����R�[�X�j","1500","image/highschool.tyukyu.png"),
(3,"���Z�󌱖{�i�㋉�j","���Z�󌱂�ڎw�����i�㋉�R�[�X�j","1500","image/highschool.zyokyu.png"),
(4,"��w�󌱖{�i�����j","��w�󌱂�ڎw�����i�����R�[�X�j","1500","image/university.syokyu.png"),
(5,"��w�󌱖{�i�����j","��w�󌱂�ڎw�����i�����R�[�X�j","1500","image/university.tyukyu.png"),
(6,"��w�󌱖{�i�㋉�j","��w�󌱂�ڎw�����i�㋉�R�[�X�j","1500","image/university.zyokyu.jpg"),

(7,"T�V���c�i���j","��T�V���c�iM�T�C�Y�j","2000","image/shirt.black.jpg"),
(8,"T�V���c�i�j","��T�V���c�iS�T�C�Y�j","1800","image/shirt.blue.jpg"),
(9,"T�V���c�i�{�[�_�[�j","�{�[�_�[T�V���c�iM�T�C�Y�j","2000","image/shirt.border.jpg"),
(10,"T�V���c�i�΁j","��T�V���c�iL�T�C�Y�j","2000","image/shirt.green.jpg"),
(11,"T�V���c�i���j","���FT�V���c�iM�T�C�Y�j","2000","image/shirt.yellow.jpg"),

(12,"�����j���O�V���[�Y","�T�C�Y�i26.5cm�j","5000","image/ranning.jpg"),
(13,"�X�j�[�J�[","�T�C�Y�i27.5cm�j","6500","image/sotobaki.jpg"),
(14,"�̈�كV���[�Y","�T�C�Y�i2�T.5cm�j","3500","image/taiikukan.jpg"),
(15,"�Z���V���[�Y","�T�C�Y�i27.0cm�j","4000","image/uwabaki.jpg");