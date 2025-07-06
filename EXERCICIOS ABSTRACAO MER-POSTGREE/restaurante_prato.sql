create table categoria_prato (
  id serial primary key,
  nome varchar(50) not null unique
);

create table prato (
  id serial primary key,
  nome varchar(100) not null,
  descricao text,
  preco decimal(8,2),
  id_categoria int references categoria_prato(id)
);

create table ingrediente (
  id serial primary key,
  nome varchar(100) not null,
  unidade_medida varchar(20)
);

create table prato_ingrediente (
  id_prato int references prato(id),
  id_ingrediente int references ingrediente(id),
  quantidade int,
  primary key (id_prato, id_ingrediente)
);
