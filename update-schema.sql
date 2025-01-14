CREATE TABLE news
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    title       VARCHAR(255)          NULL,
    content     VARCHAR(255)          NULL,
    create_time datetime              NULL,
    update_time datetime              NULL,
    CONSTRAINT pk_news PRIMARY KEY (id)
);