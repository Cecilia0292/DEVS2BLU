CREATE TABLE musica(
  id INTEGER PRIMARY KEY,
  nome VARCHAR(100),
  data_lancamento DATE,
  duracao INTEGER
);
CREATE TABLE artista (
  id INTEGER PRIMARY KEY,
  nome VARCHAR(100),
  pais_origem VARCHAR(50)
);
CREATE TABLE genero (
  id INTEGER PRIMARY KEY,
  nome VARCHAR(50),
  descricao TEXT
);
CREATE TABLE artista_genero (
  id_artista INTEGER REFERENCES artista(id),
  id_genero INTEGER REFERENCES genero (id),
  PRIMARY KEY (id_artista, id_genero)
);
CREATE TABLE musica_artista (
  id_musica INTEGER REFERENCES musica(id),
  id_artista INTEGER REFERENCES artista(id),
  PRIMARY KEY (id_musica, id_artista)
);

--create table musica_genero(
	musica_id int,
	genero_id int,
	foreign key(musica_id) references musica(id),
	foreign key(genero_id) references genero(id),
	primary key(musica_id, genero_id)
--);