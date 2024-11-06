
-- case 문 만들기

delimiter $$
  CREATE PROCEDURE caseProc()
  BEGIN
	declare point int;
    declare credit char(1);
	set point = 88; 
	case
	when point >= 90 then
         set credit = 'A';
    when point >= 80 then
         set credit = 'B';
	when point >= 70 then
         set credit = 'C';
    when point >= 60 then
         set credit = 'D';
    else
         set credit = 'F';
    end case;
    
    select concat('취득점수==>' , point), concat('학점 : ', credit) 학점;
    
  END $$  
delimiter ;


CALL caseProc();
