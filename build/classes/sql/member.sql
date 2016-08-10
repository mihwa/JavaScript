select * from member;
create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	reg_date varchar2(20),
	ssn varchar2(10),
	email varchar2(30),
	profile_img varchar2(100),
	phone varchar2(15)
);
-- CREATE
insert into member(id,pw,name,reg_date,ssn,email,profile_img,phone) 
values('lee','1','이순신','2016-07-01','800101-1','lee@test.com','lee.jpg','010-1234-5678');
insert into member(id,pw,name,reg_date,ssn,email,profile_img,phone) 
values('hong','1','홍길동','2015-07-01','100701-1','pakjkwan@gamil.com','hong.jpg','010-9075-3070');
insert into member(id,pw,name,reg_date,ssn,email,profile_img,phone) 
values('kim','1','김유신','2013-07-01','090701-3','kim@test.com','kim.jpg','010-1234-5678');
-- READ ()
select * from member; -- list
select * from member where id = 'hong';-- findByPK
select * from member where gender = '남';-- findByNotPK
select count(*) as count from member; -- count

-- UPDATE
update member set email = id || '@test.com'; 
update member set email = 'hong@test.com'where id = 'hong';
update member set phone = '010-9075-3075';
alter table member add email varchar2(30);
alter table member add profile_img varchar2(100);
alter table member add phone varchar2(15);
alter table member modify phone varchar2(15);
update member set ssn = '900301-1' where id = 'park';
update member set profile_img = id ||'.jpg' where profile_img IS NULL;
-- DELETE
delete from member where id = 'test';
select * from member;

select * from member where id='hong2';

