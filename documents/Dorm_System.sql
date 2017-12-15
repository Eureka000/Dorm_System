--创建Student（学生）表
create table Student
(Sno char(11) primary key,
 Sname char(20) not null,
 Ssex char(2),
 Sgrade smallint,
 Sdept char(20)
);
--对Ssex和Sage添加check约束
alter table Student
add constraint CK_Ssex check(Ssex='女' or Ssex='男');


--创建Teacher（教师）表
create table Teacher
(Tno char(11) primary key,
 Tname char(20) not null,
 Tsex char(2)
);
--对Tsex添加check约束
alter table Teacher
add constraint CK_Tsex check(Tsex='女' or Tsex='男');

--创建Dormitory（宿舍）表
create table Dormitory
(Dno char(6) primary key,
 dtel char(20) not null,
);

--创建Asset（财产）表
create table Asset
(Ano char(3) primary key,
 Aname char(20) not null,
 Aprice int not null,
 Astore int
);

--创建Building（宿舍楼）表
create table Building
(Bno char(2) primary key,
 Bblock char(6) not null,
 Btime datetime not null
);
--对Bblock添加check约束
alter table Building
add constraint CK_Bblock check(Bblock='北海苑' or Bblock='东海苑' or Bblock='南海苑');

--创建LeaveSchool（学生离校）表
create table LeaveSchool
(Sno char(11),
 Sltime date,
 Sreturn date,
 primary key(Sno,Sltime),
 foreign key(Sno) references Student(Sno)
);

--创建Mail（信件收发）表
create table Mail
(Mno char(20) primary key,
 Sno char(11),
 Marrive date not null,
 Maccept date,
 foreign key(Sno) references Student(Sno)
);

--创建Curfew（夜归关系）表
create table Curfew
(Sno char(11),
 NightTime datetime,
 NightReason char(50),
 Tno char(11),
 primary key(Sno,NightTime),
 foreign key(Sno) references Student(Sno),
 foreign key(Tno) references Teacher(Tno)
);

--创建Repairs（报修关系）表
create table Repairs
(Ano char(3),
 Dno char(6),
 ReportTime date,
 ReportReason char(50) not null,
 FixTime date,
 primary key(Ano,Dno,ReportTime),
 foreign key(Ano) references Asset(Ano),
 foreign key(Dno) references Dormitory(Dno)
);

--创建SD（学生宿舍关系）表
create table SD
(Sno char(11),
 Dno char(6),
 Scin date not null,
 primary key(Sno,Dno),
 foreign key(Sno) references Student(Sno),
 foreign key(Dno) references Dormitory(Dno)
);

--创建DT（宿舍管理关系）表
create table DT
(Bno char(2),
 Tno char(11),
 primary key(Bno,Tno),
 foreign key(Bno) references Building(Bno),
 foreign key(Tno) references Teacher(Tno)
);

--创建DA（宿舍财产关系）表
create table DA
(Dno char(6),
 Ano char(3),
 Amount int not null,
 primary key(Dno,Ano),
 foreign key(Dno) references Dormitory(Dno),
 foreign key(Ano) references Asset(Ano)
);


