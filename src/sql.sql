
create table sys_permission(
 id int(4) not null primary key ,
 available char(20) not null,
 name char(20) not null,
 parent_id int(4) not null,
 parent_ids char(20) not null,
 permission char(20) not null,
 resource_type char(20) not null,
 url char(20) not null
 );

create table sys_role(
 id int(4) not null primary key ,
 available char(20) not null,
 description char(20) not null,
 role char(20) not null

 );

create table sys_role_permission(
 permission_id int(4) not null  ,
 role_id int(4) not null
 );

create table sys_user_role(
 role_id int(4) not null  primary key,
 uid int(4) not null
 );

create table user_info(
 uid char(20) not null primary key ,
  username char(20) not null,
  name char(20) not null,
  password char(20) not null,
  salt char(20) not null,
  state char(20) not null
 );


INSERT INTO `sys_permission` (`id`,`available`,`name`,`parent_id`,`parent_ids`,`permission`,`resource_type`,`url`) VALUES (1,0,'用户管理',0,'0/','userInfo:view','menu','userInfo/userList');
INSERT INTO `sys_permission` (`id`,`available`,`name`,`parent_id`,`parent_ids`,`permission`,`resource_type`,`url`) VALUES (2,0,'用户添加',1,'0/1','userInfo:add','button','userInfo/userAdd');
INSERT INTO `sys_permission` (`id`,`available`,`name`,`parent_id`,`parent_ids`,`permission`,`resource_type`,`url`) VALUES (3,0,'用户删除',1,'0/1','userInfo:del','button','userInfo/userDel');
INSERT INTO `sys_role` (`id`,`available`,`description`,`role`) VALUES (1,'0','管理员','admin');
INSERT INTO `sys_role` (`id`,`available`,`description`,`role`) VALUES (2,'0','VIP会员','vip');INSERT INTO `sys_role_permission` VALUES ('1', '1');
INSERT INTO `sys_role_permission` (`permission_id`,`role_id`) VALUES (1,1);
INSERT INTO `sys_role_permission` (`permission_id`,`role_id`) VALUES (1,2);
INSERT INTO `sys_role_permission` (`permission_id`,`role_id`) VALUES (1,3);
INSERT INTO `sys_user_role` (`role_id`,`uid`) VALUES (1,1);
INSERT INTO `user_info` (`uid`,`username`,`name`,`password`,`salt`,`state`) VALUES ('1', 'admin', '管理员', '1', '8d78869f470951332959580424d4bf4f', 0);

