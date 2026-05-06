INSERT INTO customer_table (fullname,username,password,role) VALUES ('Đinh VAnh','vietanh1412','123','customer')
INSERT INTO customer_table (fullname,username,password,role) VALUES ('Đinh Việt Anh','vietanh','123','customer')
INSERT INTO customer_table (fullname,username,password,role) VALUES ('Việt Anh','vietanh42','123','customer')
INSERT INTO customer_table (fullname,username,password,role) VALUES ('Đinh Anh','vietanh24','123','customer')

INSERT INTO order_table (name,customer_id) VALUES ('vietanh1Order',1)
INSERT INTO order_table (name,customer_id) VALUES ('vietanh2Order',1)
INSERT INTO order_table (name,customer_id) VALUES ('vietanh3Order',2)

INSERT INTO item_table (name,price,status) VALUES ('Pho',35,'AVAILABLE')
INSERT INTO item_table (name,price,status) VALUES ('Bun Bo',35,'AVAILABLE')
INSERT INTO item_table (name,price,status) VALUES ('Com Tam',45,'AVAILABLE')

