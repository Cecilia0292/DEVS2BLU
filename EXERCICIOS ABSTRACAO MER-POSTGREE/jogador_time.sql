create table time (
  id int primary key,
  nome varchar(100) not null,
  modalidade varchar(50),
  cidade varchar(100),
  tecnico varchar(100)
);

create table jogador (
  id int primary key,
  nome varchar(100) not null,
  data_nascimento date,
  posicao varchar(50), 
  num_camisa int,
  id_time int references time(id)
);
