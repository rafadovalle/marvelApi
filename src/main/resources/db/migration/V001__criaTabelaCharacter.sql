create table characters(
id bigint not null auto_increment,
nome varchar(60) not null,
descricao text not null,
dataModificado datetime not null,
resourceURI text,
thumbnail text,

primary key(id)
);