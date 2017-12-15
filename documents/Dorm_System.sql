--����Student��ѧ������
create table Student
(Sno char(11) primary key,
 Sname char(20) not null,
 Ssex char(2),
 Sgrade smallint,
 Sdept char(20)
);
--��Ssex��Sage���checkԼ��
alter table Student
add constraint CK_Ssex check(Ssex='Ů' or Ssex='��');


--����Teacher����ʦ����
create table Teacher
(Tno char(11) primary key,
 Tname char(20) not null,
 Tsex char(2)
);
--��Tsex���checkԼ��
alter table Teacher
add constraint CK_Tsex check(Tsex='Ů' or Tsex='��');

--����Dormitory�����ᣩ��
create table Dormitory
(Dno char(6) primary key,
 dtel char(20) not null,
);

--����Asset���Ʋ�����
create table Asset
(Ano char(3) primary key,
 Aname char(20) not null,
 Aprice int not null,
 Astore int
);

--����Building������¥����
create table Building
(Bno char(2) primary key,
 Bblock char(6) not null,
 Btime datetime not null
);
--��Bblock���checkԼ��
alter table Building
add constraint CK_Bblock check(Bblock='����Է' or Bblock='����Է' or Bblock='�Ϻ�Է');

--����LeaveSchool��ѧ����У����
create table LeaveSchool
(Sno char(11),
 Sltime date,
 Sreturn date,
 primary key(Sno,Sltime),
 foreign key(Sno) references Student(Sno)
);

--����Mail���ż��շ�����
create table Mail
(Mno char(20) primary key,
 Sno char(11),
 Marrive date not null,
 Maccept date,
 foreign key(Sno) references Student(Sno)
);

--����Curfew��ҹ���ϵ����
create table Curfew
(Sno char(11),
 NightTime datetime,
 NightReason char(50),
 Tno char(11),
 primary key(Sno,NightTime),
 foreign key(Sno) references Student(Sno),
 foreign key(Tno) references Teacher(Tno)
);

--����Repairs�����޹�ϵ����
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

--����SD��ѧ�������ϵ����
create table SD
(Sno char(11),
 Dno char(6),
 Scin date not null,
 primary key(Sno,Dno),
 foreign key(Sno) references Student(Sno),
 foreign key(Dno) references Dormitory(Dno)
);

--����DT����������ϵ����
create table DT
(Bno char(2),
 Tno char(11),
 primary key(Bno,Tno),
 foreign key(Bno) references Building(Bno),
 foreign key(Tno) references Teacher(Tno)
);

--����DA������Ʋ���ϵ����
create table DA
(Dno char(6),
 Ano char(3),
 Amount int not null,
 primary key(Dno,Ano),
 foreign key(Dno) references Dormitory(Dno),
 foreign key(Ano) references Asset(Ano)
);


