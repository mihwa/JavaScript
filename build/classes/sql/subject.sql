create sequence subj_seq start with 1000;
create table subject(
	subj_seq int primary key,
	major varchar2(10),
	subjects varchar2(100),
	id varchar2(20),
	constraint subject_member_fk foreign key (id)
	references member(id) on delete cascade
);

insert into subject(subj_seq,major,subjects,id)
values(subj_seq.nextval,'computer','java,sql,cpp','hong');

create or replace view subject_member 
as
select 
m.id,m.pw,m.name,m.reg_date as reg,
m.ssn,m.email,m.profile_img as img,
m.phone, s.major, s.subjects
from member m, subject s
where m.id = s.id;

select * from subject_member;



