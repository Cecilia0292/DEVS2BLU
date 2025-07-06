create table filme (
  id serial primary key,
  titulo varchar(100) not null,
  duracao_min int,
  genero varchar(50),
  classificacao varchar(10), 
  diretor varchar(100)
);

create table sessao (
  id serial primary key,
  id_filme int references filme(id),
  data date,
  hora time,
  sala varchar(10),
  preco decimal(8,2)
);

create table ingresso (
  id serial primary key,
  id_sessao int references sessao(id),
  assento varchar(5),
  data_compra date,
  forma_pagamento varchar(50)
);

create table cliente (
  id serial primary key,
  nome varchar(100),
  cpf varchar(14) unique,
  email varchar(100)
);