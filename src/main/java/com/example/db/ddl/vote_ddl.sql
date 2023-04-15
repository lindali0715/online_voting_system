-- CREATE DATABASE IF NOT EXISTS esun;

-- -- 
-- 投票項目
-- -- 
drop table if exists `vote_project`;
CREATE TABLE `vote_project` (
                                `vote_id` int NOT NULL AUTO_INCREMENT COMMENT '投票項目編號',
                                `vote_name` varchar(50) NOT NULL COMMENT '投票項目名稱',
                                `vote_time` int NOT NULL COMMENT '投票累積次數',
                                PRIMARY KEY (`vote_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='投票項目'

-- -- 
-- 投票紀錄
-- -- 
drop table if exists `vote_record`;
CREATE TABLE `vote_record` (
                               `name_id` int NOT NULL AUTO_INCREMENT COMMENT '投票人編號',
                               `name` varchar(50) DEFAULT NULL COMMENT '投票人',
                               `vote_id` int DEFAULT NULL COMMENT '投票項目編號',
                               PRIMARY KEY (`name_id`),
                               KEY `FK_vote_record_vote_id` (`vote_id`),
                               CONSTRAINT `FK_vote_record_vote_id` FOREIGN KEY (`vote_id`) REFERENCES `vote_project` (`vote_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='投票紀錄'

