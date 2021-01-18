create table comicList(
id bigint not null auto_increment,
sumarryId int,
available int,
returned int,
collectionUri text,

primary key(id)
);

create table comicSummary(
id bigint not null auto_increment,
resourceURI text,
nome varchar(255),

primary key(id)
);

alter table comicList add constraint fk_comicList_Summary
foreign key (cliente_id) references comicSummary(id);