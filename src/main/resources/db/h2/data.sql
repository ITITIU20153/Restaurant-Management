INSERT INTO customer_table (fullname,username,password,role) VALUES ('Đinh VAnh','vietanh1412','123','customer')
INSERT INTO customer_table (fullname,username,password,role) VALUES ('Đinh Việt Anh','vietanh','123','customer')
INSERT INTO customer_table (fullname,username,password,role) VALUES ('Việt Anh','vietanh42','123','customer')
INSERT INTO customer_table (fullname,username,password,role) VALUES ('Đinh Anh','vietanh24','123','customer')

INSERT INTO order_table (name,customer_id) VALUES ('vietanh1Order',1)
INSERT INTO order_table (name,customer_id) VALUES ('vietanh2Order',1)
INSERT INTO order_table (name,customer_id) VALUES ('vietanh3Order',2)

-- Menu
INSERT INTO item_table (name,price,status) VALUES ('Pho',35,'AVAILABLE')
INSERT INTO item_table (name,price,status) VALUES ('Bun Bo',35,'AVAILABLE')
INSERT INTO item_table (name,price,status) VALUES ('Com Suon',30,'AVAILABLE')
INSERT INTO item_table (name,price,status) VALUES ('Com Cha',38,'AVAILABLE')
INSERT INTO item_table (name,price,status) VALUES ('Hu tieu',40,'AVAILABLE')
INSERT INTO item_table (name,price,status) VALUES ('Hoanh Thanh',45,'AVAILABLE')

INSERT INTO order_items_table (items_id,order_id,quantity) VALUES (1,1,2)
INSERT INTO order_items_table (items_id,order_id,quantity) VALUES (2,1,2)
INSERT INTO order_items_table (items_id,order_id,quantity) VALUES (5,1,2)
INSERT INTO order_items_table (items_id,order_id,quantity) VALUES (4,1,2)

