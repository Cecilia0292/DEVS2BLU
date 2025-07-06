create table especie (
  id serial primary key,
  nome_cientifico varchar(100) not null,
  nome_popular varchar(100),
  familia varchar(100)
);

create table localizacao (
  id serial primary key,
  latitude numeric(9,6),
  longitude numeric(9,6),
  endereco varchar(150),
  cidade varchar(100)
);

create table arvore (
  id serial primary key,
  data_plantio date,
  altura_metros numeric(4,2),
  diametro_cm numeric(4,1),
  id_especie int references especie(id),
  id_localizacao int references localizacao(id)
);

create table condicao_ambiental (
  id serial primary key,
  id_arvore int references arvore(id),
  data_avaliacao date,
  saude varchar(50), 
  observacoes text
);

