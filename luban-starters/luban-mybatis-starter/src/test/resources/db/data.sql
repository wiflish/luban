DELETE FROM t_user;

INSERT INTO t_user (name, age, email, settings, other_info) VALUES
('张三1', 10, 'zhangsan@qq.com', 0, '{"address": "福田区建艺大厦1", "zipcode": "518001"}'),
('张三2', 10, 'zhangsan@qq.com', 1, '{"address": "福田区建艺大厦2", "zipcode": "518002"}'),
('张三3', 10, 'zhangsan@qq.com', 2, '{"address": "福田区建艺大厦3", "zipcode": "518003"}'),
('张三4', 10, 'zhangsan@qq.com', 4, '{"address": "福田区建艺大厦4", "zipcode": "518004"}'),
('张三5', 10, 'zhangsan@qq.com', 7, '{"address": "福田区建艺大厦5", zipcode": "518005"}'),
('张三6', 10, 'zhangsan@qq.com', 15, '{"address": "福田区建艺大厦6", "zipcode": "518006"}1');