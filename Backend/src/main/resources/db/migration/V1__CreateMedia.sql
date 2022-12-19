CREATE TABLE media
(
    id          serial  not null primary key,
    title       text    not null,
    body        text    not null,
    author_name text    not null,
    is_accepted boolean not null,
    category    text    not null,
    email       text    not null,
    created_at  date    not null
);

INSERT INTO media (title, body, author_name, is_accepted, category, email, created_at)
VALUES ('how to be good', 'just dont be evil dude', 'john', true, 'life', 'johnJohn@gmail.com', current_date),
       ('how to be evil', 'be vegan', 'alex', false, 'love', 'alexSmith@gmail.com', current_date);