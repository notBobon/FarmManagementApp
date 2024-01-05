CREATE TABLE transaction (
  id int NOT NULL AUTO_INCREMENT,
  buyerName varchar(45) DEFAULT NULL,
  sellerName varchar(45) DEFAULT NULL,
  taxID varchar(45) DEFAULT NULL,
  animalName varchar(45) DEFAULT NULL,
  quantity int DEFAULT NULL,
  total decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Employee (
  id INT PRIMARY KEY AUTO_INCREMENT,
  email VARCHAR(255) NOT NULL,
  image_url VARCHAR(255) NOT NULL
);

INSERT INTO Employee (email, image_url) VALUES
('fabianwira@gmail.com', 'https://media.licdn.com/dms/image/C4E03AQFmPNfw4hL6xg/profile-displayphoto-shrink_800_800/0/1631584454672?e=2147483647&v=beta&t=lH0132bWEjsbcd3fAcjLOzsbBtVBlg4btMsHW_fUJcY'),
('danutryas@email.com', 'https://thedadungs.vercel.app/assets/photo/danu.png'),
('marcelino@gmail.com', 'https://media.licdn.com/dms/image/D4D03AQEl7s7-YCc5OQ/profile-displayphoto-shrink_800_800/0/1673360437188?e=2147483647&v=beta&t=hzWCaA6sZRKjTuHf9CSDasNPNFtJx2CBzhRmIcnaFRA'),
('ariiqaf@email.com', 'https://media.licdn.com/dms/image/D4E03AQEPVCvep4RZiQ/profile-displayphoto-shrink_400_400/0/1673422090133?e=2147483647&v=beta&t=y8gPEwcy7nhtMKRoWQKkg_1TrmuEzKBete3_wGc_w-k'),
('raihankahfi@gmail.com', 'https://media.licdn.com/dms/image/D4D03AQHrUhBCrvtQQA/profile-displayphoto-shrink_800_800/0/1668683879126?e=2147483647&v=beta&t=D_IwdnM5ZmuugJb4L_UMHUMkyN5YmO3IAxbNckNnyX8');
