create database MercadinhoGosling;

use MercadinhoGosling;

create table produto
(
	id int auto_increment primary key,
    descricao varchar(25) not null,
    qnt int not null,
    preco double not null
);

select * from produto;