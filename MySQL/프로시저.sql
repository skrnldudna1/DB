
-- 프로시저 학습 연습

DROP PROCEDURE IF EXISTS ifProcl;

-- SQL 에서 작업한걸 실행할 때 delimiter를 사용해야함
delimiter $$
   CREATE PROCEDURE ifProc3()
   BEGIN
       declare debutdate date;       -- 데뷔일자
       declare curDate date;     -- 오늘
       declare days int;       -- 활동한 일수
       
       select debut_date into debutDate   -- debutDate여기다가 데뷔날짜 저장해라 -- 
       from market_db.member
       where mem_id = 'APN';
       
     set curDate = current_date(); 
     set days = datediff(curDate, debutDate);
       
       if (days/365) >= 5 then  -- 5년이 지났다면
         select concat('데뷔한 지 ', days, '일이나 지났습니다. 핑순 축하');
       else
	     select concat('데뷔한 지 ', days, '일 밖에 안되었네요. 핑순 화이팅');
	   END IF;
   END $$
delimiter ;




CALL ifProc3();





