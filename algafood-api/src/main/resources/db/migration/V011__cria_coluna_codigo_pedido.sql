alter table pedido add codigo varchar(36) not null after id;
update pedido set codigo = uuid();
alter table pedido add constraint unique (codigo);