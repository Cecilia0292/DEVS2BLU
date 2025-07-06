
create table companhia_aerea(
  id int primary key,
  nome varchar(100),
  sigla varchar(10),
  pais_origem varchar(50)
);


create table passageiro(
  id int primary key,
  nome varchar(100),
  cpf varchar(14),
  data_nascimento date
);

create table voo (
  id int primary key,
  numero_voo varchar(10),
  origem varchar(100),
  destino varchar(100),
  data_partida date,
  hora_partida time,
  data_chegada date,
  hora_chegada time,
  id_companhia int references companhia_aerea(id)
);

create table passagem (
  id int primary key,
  data_emissao date,
  assento varchar(5),
  valor numeric(10,2),
  id_voo int references voo(id),
  id_passageiro int references passageiro(id)
);