create table autor(
  id int primary key,
  nome varchar(100),
  nacionalidade varchar(50),
  nascimento date
);
create table genero (
  id int primary key,
  nome varchar(50),
  descricao text
);
create table livro (
  id int primary key,
  titulo varchar(150),
  ano_publicacao int,
  isbn varchar(20),
  editora varchar(100)
);

create table livro_autor (
  id_autor int references autor(id),
  id_livro int references livro(id),
  PRIMARY KEY (id_livro, id_autor)
);

create table livro_genero(
  id_livro int references livro(id),
  id_genero int references genero(id),
  primary key (id_livro, id_genero)
);