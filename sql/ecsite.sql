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

("大学受験本（初級）",1500,100,NOW()),
("大学受験本（中級）",1500,100,NOW()),

("Tシャツ（ボーダー）",2000,150,NOW()),
("Tシャツ（緑）",2000,150,NOW()),

("スニーカー",6500,80,NOW()),
("校内シューズ",4000,80,NOW());

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
(1,"高校受験本（初級）","高校受験を目指す方（初級コース）","1500","image/highschool.syokyu.png"),
(2,"高校受験本（中級）","高校受験を目指す方（中級コース）","1500","image/highschool.tyukyu.png"),
(3,"高校受験本（上級）","高校受験を目指す方（上級コース）","1500","image/highschool.zyokyu.png"),
(4,"大学受験本（初級）","大学受験を目指す方（初級コース）","1500","image/university.syokyu.png"),
(5,"大学受験本（中級）","大学受験を目指す方（中級コース）","1500","image/university.tyukyu.png"),
(6,"大学受験本（上級）","大学受験を目指す方（上級コース）","1500","image/university.zyokyu.jpg"),

(7,"Tシャツ（黒）","黒Tシャツ（Mサイズ）","2000","image/shirt.black.jpg"),
(8,"Tシャツ（青）","青Tシャツ（Sサイズ）","1800","image/shirt.blue.jpg"),
(9,"Tシャツ（ボーダー）","ボーダーTシャツ（Mサイズ）","2000","image/shirt.border.jpg"),
(10,"Tシャツ（緑）","緑Tシャツ（Lサイズ）","2000","image/shirt.green.jpg"),
(11,"Tシャツ（黄）","黄色Tシャツ（Mサイズ）","2000","image/shirt.yellow.jpg"),

(12,"ランニングシューズ","サイズ（26.5cm）","5000","image/ranning.jpg"),
(13,"スニーカー","サイズ（27.5cm）","6500","image/sotobaki.jpg"),
(14,"体育館シューズ","サイズ（2５.5cm）","3500","image/taiikukan.jpg"),
(15,"校内シューズ","サイズ（27.0cm）","4000","image/uwabaki.jpg");