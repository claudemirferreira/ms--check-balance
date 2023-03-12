create sequence s_account start with 1 increment by 1;

create sequence s_client start with 1 increment by 1;


create table account (
acc_id bigint not null,
balance float4 not null,
type varchar(30),
cli_id bigint,
primary key (acc_id));

create table client (
cli_id bigint not null,
email varchar(100),
name varchar(100),
primary key (cli_id));

alter table account add constraint FK16gcultgjd3kwwr5h3bhca4g0
foreign key (cli_id) references client;


INSERT INTO client
VALUES ( 1, 'claudemirramosferreira@gmail.com', 'claudemir Ramos Ferreira');

INSERT INTO ACCOUNT
VALUES ( 1, 100, 'CONTA CORENTE', 1);