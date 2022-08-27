Drop schema if exists `Expense_Manager`;
create schema `Expense_Manager`;
use `Expense_Manager`;

drop table if exists `user_details`;
create table `user_details`(
`user_id` int(20) Not Null auto_increment,
`user_name` varchar(50) Not Null,
`Phone_Number` varchar(12) Not Null,
`username` varchar(30) unique Not Null,
`password` varchar(20) Not NUll,
primary key(`user_id`)
)ENGINE=InnoDB DEFAULT CHARSET=latin2;

Drop table if exists `user_room_details`;
create table `user_room_details`(
`user_id` int(20) not null,
`room_id` varchar(25) Not Null,
primary key(`room_id`),
Key `FK_detail_idk` (`user_id`),
constraint `FK_detail` foreign key (`user_id`) references `user_details`(`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);
