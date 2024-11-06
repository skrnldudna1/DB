
drop procedure if exists whileProc2;
delimiter $$
create procedure whileProc2()
begin
     declare i int;  -- 1에서 100까지 증가할 변수
     declare hap int;  -- 더한 값을 누적할 변수
     set i = 1;
     set hap = 0;

mywhile:
while (i <= 100) DO
     if (i%4 = 0) then
         set i = i+ 1;
         iterate mywhile;  -- 지정한 lable 문으로 가서 계속 진행
	end if;
    set hap = hap + i;
     if (hap > 1000) then
         leave mywhile;         -- 지저한 lable 문을 떠님 즉 While 종료
	end if;
    set i = i+ 1;
end while;

select '1부터 100까지의 합 (4의 배수 제외), 1000 넘으면 종료 ==>', hap;
end $$
delimiter ;
call whileProc2();
    