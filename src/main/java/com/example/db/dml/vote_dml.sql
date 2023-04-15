-- -- 
-- stored procedure
-- -- 

start transaction;

-- 新增投票項目(原)
   insert into vote_project(vote_name, vote_time)
   values('電腦',0),
         ('滑鼠',0);

-- 獲取全部投票項目
delimiter //
create procedure get_allProject()
begin
   select * from vote_project order by vote_id;
end
//

-- 獲取單一投票項目
delimiter //
create procedure get_project(in vote_in int)
begin
   select * from vote_project where vote_id = vote_in;
end
//

-- 獲取單一投票人
delimiter //
create procedure get_name(in name_in int)
begin
   select * from vote_record where name_id = name_in;
end
//

-- 新增投票人投票
delimiter //
create procedure add_vote(in name varchar(50), in vote_id int)
begin
   insert into vote_record(name, voteId)
   values(name, vote_id);
end
//

-- 計算投票項目投票數
delimiter //
create procedure get_voteCount()
begin
   insert into vote_project(vote_time)
   select count(*) as vote_time
   from vote_record
   group by vote_record.vote_id;
end
//
commit;
