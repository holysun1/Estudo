-- 1. Cria a estrutura da tabela
CREATE TABLE modules (
     id BIGINT NOT NULL AUTO_INCREMENT,
     name VARCHAR(150) NOT NULL,
     PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO modules (name) VALUES
                               ('financeiro'),
                               ('controle de ponto'),
                               ('Estoque');