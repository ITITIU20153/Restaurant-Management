INSERT INTO user_table (id, username, password, role)
VALUES
(5, 'NguyenVanA', '123', 'CUSTOMER'),
(6, 'TranThiB', '123', 'CUSTOMER'),
(7, 'LeVanC', '123', 'CUSTOMER'),
(8, 'PhamThiD', '123', 'CUSTOMER');


INSERT INTO customer_table (user_id, full_name, customer_level)
VALUES (5, 'Nguyen Van A', 'GOLD');

INSERT INTO customer_table (user_id, full_name, customer_level)
VALUES (6, 'Tran Thi B', 'SILVER');

INSERT INTO customer_table (user_id, full_name, customer_level)
VALUES (7, 'Le Van C', 'PLATINUM');

INSERT INTO customer_table (user_id, full_name, customer_level)
VALUES (8, 'Pham Thi D', 'BRONZE');


INSERT INTO order_table (name,customer_id) VALUES ('vietanh1Order',1);
INSERT INTO order_table (name,customer_id) VALUES ('vietanh2Order',1);
INSERT INTO order_table (name,customer_id) VALUES ('vietanh3Order',2);

-- Menu
INSERT INTO item_table (name,price,status) VALUES ('Pho',35,'AVAILABLE');
INSERT INTO item_table (name,price,status) VALUES ('Bun Bo',35,'AVAILABLE');
INSERT INTO item_table (name,price,status) VALUES ('Com Suon',30,'AVAILABLE');
INSERT INTO item_table (name,price,status) VALUES ('Com Cha',38,'AVAILABLE');
INSERT INTO item_table (name,price,status) VALUES ('Hu tieu',40,'AVAILABLE');
INSERT INTO item_table (name,price,status) VALUES ('Hoanh Thanh',45,'AVAILABLE');

INSERT INTO order_items_table (items_id,order_id,quantity) VALUES (1,1,2);
INSERT INTO order_items_table (items_id,order_id,quantity) VALUES (2,1,2);
INSERT INTO order_items_table (items_id,order_id,quantity) VALUES (5,1,2);
INSERT INTO order_items_table (items_id,order_id,quantity) VALUES (4,1,2);

