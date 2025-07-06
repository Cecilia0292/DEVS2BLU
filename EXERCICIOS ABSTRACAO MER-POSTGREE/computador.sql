create table cliente (
  id serial primary key,
  nome varchar(100) not null,
  cpf varchar(14) unique,
  telefone varchar(15)
);

create table computador (
  id serial primary key,
  marca varchar(50),
  modelo varchar(50),
  id_cliente int references cliente(id)
);

create table tecnico (
  id serial primary key,
  nome varchar(100) not null,
  especialidade varchar(100)
);

create table ordem_servico (
  id serial primary key,
  data_abertura date,
  status varchar(50),
  id_computador int references computador(id),
  id_tecnico int references tecnico(id)
);

create table servico (
  id serial primary key,
  descricao varchar(100),
  valor numeric(10,2)
);

-- Tabela para relacionamento N:N 
create table ordem_servico_servico (
  id_ordem int references ordem_servico(id),
  id_servico int references servico(id),
  primary key (id_ordem, id_servico)
);
