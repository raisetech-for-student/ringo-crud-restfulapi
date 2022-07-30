DROP TABLE IF EXISTS user;
/* ユーザーテーブル作成 */
CREATE TABLE user
(
  id CHAR(26) NOT NULL
  ,name VARCHAR(255)  NOT NULL
  ,birthdate DATE NOT NULL
  ,deleted BOOLEAN NOT NULL
  ,created_at DATETIME NOT NULL
  ,created_by VARCHAR(255) NOT NULL
  ,updated_at DATETIME NOT NULL
  ,updated_by VARCHAR(255) NOT NULL
  ,deleted_at DATETIME
  ,deleted_by VARCHAR(255)
  ,PRIMARY KEY (id)
);

INSERT INTO user
(
  id
  ,name
  ,birthdate
  ,deleted
  ,created_at
  ,created_by
  ,updated_at
  ,updated_by
  ,deleted_at
  ,deleted_by
)

VALUES
('12345678901234567890123456', '太郎', '2000-07-30', '1', '2021-07-28', '太郎', '2021-07-30 01:04:06', '太郎', '2022-08-08 01:04:06', '太郎' ),
('121212121212121212121212ss', '二郎', '1999-08-09', '0', '2021-08-05', '二郎', '2021-06-30 01:04:06', '二郎', NULL, NULL ),
('sdsdsdsdsdsdsdsdsssdsddd44', '三郎', '1999-10-09', '0', '2021-09-28', '三郎', '2022-05-30 01:04:06', '三郎', NULL, NULL );
