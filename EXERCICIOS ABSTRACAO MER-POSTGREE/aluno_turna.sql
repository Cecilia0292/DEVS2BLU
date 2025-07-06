create table categoria_elemento(
  id serial primary key,
  descricao varchar(100) not null unique
);



create table elemento_quimico (
  numero_atomico int primary key,
  simbolo varchar(3) not null unique,
  nome varchar(50) not null,
  massa_atomica numeric(6,3),
  grupo int,
  id_categoria int references categoria_elemento(id)
);
