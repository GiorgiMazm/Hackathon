CREATE TABLE media
(
    id         serial    not null primary key,
    title       text      not null,
    body    text      not null,
    author_name    text      not null,
    is_accepted boolean not null,
    category    text      not null,
    create_date date not null
);
