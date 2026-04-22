--drop table if exists shapdev.stuff;
--
create table shapdev.stuff
(
   id varchar(40),
   name varchar(100),
   dtime_inserted timestamp,
   dtime_updated timestamp,
   status int
)
;

insert into shapdev.stuff values ('xenia',  'xenia',  current_timestamp(0), current_timestamp(0), 0);
insert into shapdev.stuff values ('daniel', 'daniel', current_timestamp(0), current_timestamp(0), 0);
