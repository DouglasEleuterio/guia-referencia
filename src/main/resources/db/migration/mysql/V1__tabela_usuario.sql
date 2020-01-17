create table usuario(
	id bigint (20) auto_increment primary key,
    usuario varchar (15) not null unique,
    senha varchar (100) not null,
    perfil varchar (25) not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;