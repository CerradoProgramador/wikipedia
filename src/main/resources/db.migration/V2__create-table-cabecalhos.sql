CREATE TABLE cabecalhos{
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    observacao varchar(500),
    titulo varchar(100) NOT NULL,
    informacao_adicional varchar(500),
    linguas_disponiveis NOT NULL SMALLINT
    }