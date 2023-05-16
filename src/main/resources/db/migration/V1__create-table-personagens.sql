CREATE TABLE personagem(
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           nome VARCHAR(50) NOT NULL,
                           cla VARCHAR(50) NOT NULL,
                           estilo VARCHAR(50) NOT NULL,
                           patente VARCHAR(50) NOT NULL,
                           avatar VARCHAR(255) NOT NULL
);