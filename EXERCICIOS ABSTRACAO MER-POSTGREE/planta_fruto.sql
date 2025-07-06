create table planta(
  id int primary key,
  nome_comum varchar(100),
  nome_cientifico varchar(150),
  tipo varchar(50),  
  origem varchar(100)
);

create table fruto(
  id int primary key,
  nome varchar(100),
  cor varchar(50),
  sabor varchar(50), 
  tamanho_cm decimal(8,2)
  id_planta int references planta(id)
);
