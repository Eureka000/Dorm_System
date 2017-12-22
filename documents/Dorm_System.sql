drop table DA;
drop table DT;
drop table SD;
drop table Repairs;
drop table Curfew;
drop table Mail;
drop table LeaveSchool;
drop table Building;
drop table Asset;
drop table Dormitory;
drop table Teacher;
drop table Student;
drop table Users;


--����User��
create table Users
(Uno char(11) primary key,	--�û���
 Pass char(20) not null,	--����
 Pri char(1)				--Ȩ�ޣ�0Ϊѧ����1Ϊ��ʦ��
);
--��Pri���checkԼ��
alter table Users
add constraint CK_Pri check(Pri='1' or Pri='0');

insert into Users values('2110','2110','1');
insert into Users values('2111','2111','1');
insert into Users values('2120','2120','1');
insert into Users values('2121','2121','1');
insert into Users values('2122','2122','1');
insert into Users values('2130','2130','1');
insert into Users values('2131','2131','1');
insert into Users values('2240','2240','1');
insert into Users values('2241','2241','1');
insert into Users values('2250','2250','1');
insert into Users values('2251','2251','1');
insert into Users values('2360','2360','1');
insert into Users values('2361','2361','1');
insert into Users values('2370','2370','1');
insert into Users values('2371','2371','1');
insert into Users values('2372','2372','1');
insert into Users values('14010011001','14010011001','0');
insert into Users values('14010011002','14010011002','0');
insert into Users values('14010011003','14010011003','0');
insert into Users values('14010022001','14010022001','0');
insert into Users values('14010022002','14010022002','0');
insert into Users values('14010022003','14010022003','0');
insert into Users values('14010022004','14010022004','0');
insert into Users values('14020011012','14020011012','0');
insert into Users values('14020011013','14020011013','0');
insert into Users values('15020012001','15020012001','0');
insert into Users values('15020011033','15020011033','0');
insert into Users values('14020031015','14020031015','0');
insert into Users values('16020041002','16020041002','0');
insert into Users values('17020023005','17020023005','0');
insert into Users values('15020032010','15020032010','0');
insert into Users values('15020032009','15020032009','0');
insert into Users values('15020031042','15020031042','0');
insert into Users values('15020031048','15020031048','0');
insert into Users values('15020031108','15020031108','0');
insert into Users values('15110041008','15110041008','0');
insert into Users values('15110011002','15110011002','0');
insert into Users values('16110022037','16110022037','0');
insert into Users values('14120011028','14120011028','0');
insert into Users values('15120012009','15120012009','0');
insert into Users values('16120013011','16120013011','0');
insert into Users values('16120013013','16120013013','0');
insert into Users values('17120014011','17120014011','0');
insert into Users values('14090021027','14090021027','0');
insert into Users values('14090021001','14090021001','0');
insert into Users values('15090032010','15090032010','0');
insert into Users values('15090032013','15090032013','0');
insert into Users values('16090012014','16090012014','0');
insert into Users values('17090011045','17090011045','0');

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

insert into Student values('14010011001','����','Ů',2014,'���󻷾�ѧԺ');
insert into Student values('14010011002','����','Ů',2014,'���󻷾�ѧԺ');
insert into Student values('14010011003','����','Ů',2014,'���󻷾�ѧԺ');
insert into Student values('14010022001','�¼���','Ů',2014,'���󻷾�ѧԺ');
insert into Student values('14010022002','���h','Ů',2014,'���󻷾�ѧԺ');
insert into Student values('14010022003','��ǿ','��',2014,'���󻷾�ѧԺ');
insert into Student values('14010022004','����','��',2014,'���󻷾�ѧԺ');
insert into Student values('14020011012','���Ƿ�','��',2014,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('14020011013','��ة','��',2014,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('15020012001','�˷�','��',2015,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('15020011033','ղ����','��',2015,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('14020031015','����','Ů',2014,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('16020041002','�¶�','Ů',2016,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('17020023005','���','Ů',2017,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('15020032010','��Ԩ��','Ů',2015,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('15020032009','������','Ů',2015,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('15020031042','����','��',2015,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('15020031048','����','��',2015,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('15020031108','������','��',2015,'��Ϣ��ѧ�빤��ѧԺ');
insert into Student values('15110041008','����','Ů',2015,'����ѧԺ');
insert into Student values('15110011002','������','��',2015,'����ѧԺ');
insert into Student values('16110022037','��˧','��',2016,'����ѧԺ');
insert into Student values('14120011028','������','��',2014,'����ѧԺ');
insert into Student values('15120012009','���','��',2015,'����ѧԺ');
insert into Student values('16120013011','��ѩ','Ů',2016,'����ѧԺ');
insert into Student values('16120013013','����','��',2016,'����ѧԺ');
insert into Student values('17120014011','����','��',2017,'����ѧԺ');
insert into Student values('14090021027','��Ȼ','��',2014,'����ѧԺ');
insert into Student values('14090021001','����','��',2014,'����ѧԺ');
insert into Student values('15090032010','����','��',2015,'����ѧԺ');
insert into Student values('15090032013','����','��',2015,'����ѧԺ');
insert into Student values('16090012014','��ŵ','Ů',2016,'����ѧԺ');
insert into Student values('17090011045','�ű���','Ů',2017,'����ѧԺ');


--����Teacher����ʦ����
create table Teacher
(Tno char(11) primary key,
 Tname char(20) not null,
 Tsex char(2)
);
--��Tsex���checkԼ��
alter table Teacher
add constraint CK_Tsex check(Tsex='Ů' or Tsex='��');

insert into Teacher values('2110','�Էｿ','Ů');
insert into Teacher values('2111','����','Ů');
insert into Teacher values('2120','����','��');
insert into Teacher values('2121','�ǳ�','��');
insert into Teacher values('2122','����','��');
insert into Teacher values('2130','��ǿ','��');
insert into Teacher values('2131','����','��');
insert into Teacher values('2240','����','Ů');
insert into Teacher values('2241','��¶','Ů');
insert into Teacher values('2250','����','��');
insert into Teacher values('2251','��ǿ','��');
insert into Teacher values('2360','¬��','Ů');
insert into Teacher values('2361','����','Ů');
insert into Teacher values('2370','��չ','��');
insert into Teacher values('2371','����','��');
insert into Teacher values('2372','������','��');

--����Dormitory�����ᣩ��
create table Dormitory
(Dno char(6) primary key,
 dtel char(20) not null,
);

insert into Dormitory values('1#101','6001101');
insert into Dormitory values('1#102','6001102');
insert into Dormitory values('1#103','6001103');
insert into Dormitory values('2#101','6002101');
insert into Dormitory values('2#102','6002102');
insert into Dormitory values('2#103','6002103');
insert into Dormitory values('3#101','6003101');
insert into Dormitory values('3#102','6003102');
insert into Dormitory values('4#101','6004101');
insert into Dormitory values('4#102','6004102');
insert into Dormitory values('5#101','6005101');
insert into Dormitory values('5#102','6005102');
insert into Dormitory values('6#101','6006101');
insert into Dormitory values('6#102','6006102');
insert into Dormitory values('7#101','6007101');
insert into Dormitory values('7#102','6007102');


--����Asset���Ʋ�����
create table Asset
(Ano char(3) primary key,
 Aname char(20) not null,
 Aprice int not null,
 Astore int
);

insert into Asset values('1','��',2000,120);
insert into Asset values('2','����',1500,100);
insert into Asset values('3','�¹�',1800,120);
insert into Asset values('4','���',60,200);
insert into Asset values('5','����',130,140);
insert into Asset values('6','��',1600,50);
insert into Asset values('7','����ϴ�»�',2500,4);
insert into Asset values('8','���������',70,15);

--����Building������¥����
create table Building
(Bno char(2) primary key,
 Bblock char(6) not null,
 Btime time not null
);
--��Bblock���checkԼ��
alter table Building
add constraint CK_Bblock check(Bblock='����Է' or Bblock='����Է' or Bblock='�Ϻ�Է');

insert into Building values('1','����Է','22:30:00');
insert into Building values('2','����Է','22:30:00');
insert into Building values('3','����Է','22:30:00');
insert into Building values('4','����Է','22:45:00');
insert into Building values('5','����Է','22:45:00');
insert into Building values('6','�Ϻ�Է','22:45:00');
insert into Building values('7','�Ϻ�Է','22:45:00');

--����LeaveSchool��ѧ����У����
create table LeaveSchool
(Sno char(11),
 Sltime date,
 Sreturn date,
 primary key(Sno,Sltime),
 foreign key(Sno) references Student(Sno)
);

insert into LeaveSchool values('15020032010','2016-1-23','2016-3-3');
insert into LeaveSchool values('15020032010','2016-7-20','2016-8-12');
insert into LeaveSchool values('15020032010','2017-1-19','2017-2-27');
insert into LeaveSchool values('15020032010','2017-7-16','2017-8-19');
insert into LeaveSchool values('15020032009','2016-1-22','2016-3-2');
insert into LeaveSchool values('15020032009','2016-7-18','2016-7-27');
insert into LeaveSchool values('15020032009','2017-1-20','2017-3-3');
insert into LeaveSchool values('15020032009','2017-7-16','2017-8-19');
insert into LeaveSchool values('15020031042','2016-1-21','2016-3-3');
insert into LeaveSchool values('15020031042','2016-7-18','2016-8-11');
insert into LeaveSchool values('15020031042','2017-1-22','2017-2-27');
insert into LeaveSchool values('15020031042','2017-7-16','2017-8-19');
insert into LeaveSchool values('15020031048','2016-1-23','2016-3-3');
insert into LeaveSchool values('15020031048','2016-7-20','2016-8-12');
insert into LeaveSchool values('15020031048','2017-1-19','2017-2-27');
insert into LeaveSchool values('15020031048','2017-7-16','2017-8-19');
insert into LeaveSchool values('15020031108','2016-1-23','2016-3-3');
insert into LeaveSchool values('15020031108','2016-7-20','2016-8-12');
insert into LeaveSchool values('15020031108','2017-1-19','2017-2-27');
insert into LeaveSchool values('15020031108','2017-7-13','2017-8-18');

--����Mail���ż��շ�����
create table Mail
(Mno char(20) primary key,
 Sno char(11),
 Marrive date not null,
 Maccept date,
 foreign key(Sno) references Student(Sno)
);

insert into Mail values('M1','15020032010','2015-10-13','2015-10-13');
insert into Mail values('M2','15020032010','2015-12-1','2015-12-2');
insert into Mail values('M3','15020032010','2016-5-6','2016-5-8');
insert into Mail values('M4','15020032010','2017-12-25',null);
insert into Mail values('M5','15020032009','2015-10-13','2015-10-13');
insert into Mail values('M6','15020032009','2015-12-1','2015-12-2');
insert into Mail values('M7','15020032009','2016-5-6','2016-5-8');
insert into Mail values('M8','15020032009','2017-12-25',null);
insert into Mail values('M9','15020031042','2015-10-13','2015-10-13');
insert into Mail values('M10','15020031042','2015-12-1','2015-12-2');
insert into Mail values('M11','15020031042','2016-5-6','2016-5-8');
insert into Mail values('M12','15020031042','2017-12-25',null);
insert into Mail values('M13','15020031048','2015-10-13','2015-10-13');
insert into Mail values('M14','15020031048','2015-12-1','2015-12-2');
insert into Mail values('M15','15020031048','2016-5-6','2016-5-8');
insert into Mail values('M16','15020031048','2017-12-25',null);
insert into Mail values('M17','15020031108','2015-10-13','2015-10-13');
insert into Mail values('M18','15020031108','2015-12-1','2015-12-2');
insert into Mail values('M19','15020031108','2016-5-6','2016-5-8');
insert into Mail values('M20','15020031108','2018-1-12',null);

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

insert into Curfew values('15020032010','2016-11-11 22:45:00','���Ż','2110');
insert into Curfew values('15020032010','2017-11-11 22:45:00','���Ż',null);
insert into Curfew values('15020032009','2016-10-7 23:30:00','�ؼҷ�У','2111');
insert into Curfew values('15020032009','2017-5-3 23:30:00','���Ż',null);
insert into Curfew values('15020031042','2016-1-1 22:45:00','���Ż','2121');
insert into Curfew values('15020031042','2016-11-11 22:45:00','���Ż',null);
insert into Curfew values('15020031048','2015-12-11 22:45:00','��У������У','2120');
insert into Curfew values('15020031048','2016-11-11 22:45:00','���Ż',null);
insert into Curfew values('15020031108','2016-9-16 23:30:00','ʵϰ��У','2121');
insert into Curfew values('15020031108','2016-11-11 22:45:00','���Ż',null);

--����Repairs�����޹�ϵ����
create table Repairs
(Dno char(6),
 Ano char(3),
 ReportTime date,
 ReportReason char(50) not null,
 FixTime date,
 primary key(Ano,Dno,ReportTime),
 foreign key(Ano) references Asset(Ano),
 foreign key(Dno) references Dormitory(Dno)
);

insert into Repairs values('1#101','2','2016-11-30','���뻵����','2016-12-1');
insert into Repairs values('1#101','4','2017-12-25','�Ʋ�����',null);
insert into Repairs values('1#102','7','2016-10-20','ϴ�»���������','2016-10-22');
insert into Repairs values('1#102','6','2017-12-30','�Űѻ���',null);
insert into Repairs values('2#101','3','2015-9-30','�¹��Ż�����','2015-10-8');
insert into Repairs values('2#101','5','2018-1-3','������������',null);
insert into Repairs values('2#102','4','2015-12-11','�Ʋ�����','2015-12-12');
insert into Repairs values('2#102','8','2017-11-11','���������',null);
insert into Repairs values('2#103','1','2015-9-19','���廵��','2015-9-19');
insert into Repairs values('2#103','7','2017-12-11 22:45:00','ϴ�»���������',null);

--����SD��ѧ�������ϵ����
create table SD
(Sno char(11),
 Dno char(6),
 Scin date not null,
 primary key(Sno,Dno),
 foreign key(Sno) references Student(Sno),
 foreign key(Dno) references Dormitory(Dno)
);

insert into SD values('14010011001','6#101','2014-8-25');
insert into SD values('14010011002','6#101','2014-8-25');
insert into SD values('14010011003','6#102','2014-8-25');
insert into SD values('14010022001','6#102','2014-8-25');
insert into SD values('14010022002','6#102','2014-8-25');
insert into SD values('14010022003','7#101','2014-8-25');
insert into SD values('14010022004','7#101','2014-8-25');
insert into SD values('14020011012','2#102','2014-8-25');
insert into SD values('14020011013','2#102','2014-8-25');
insert into SD values('15020012001','2#102','2015-8-25');
insert into SD values('15020011033','2#103','2015-8-25');
insert into SD values('14020031015','1#101','2014-8-25');
insert into SD values('16020041002','1#102','2016-8-25');
insert into SD values('17020023005','1#102','2017-8-25');
insert into SD values('15020032010','1#101','2015-8-25');
insert into SD values('15020032009','1#102','2015-8-25');
insert into SD values('15020031042','2#101','2015-8-25');
insert into SD values('15020031048','2#102','2015-8-25');
insert into SD values('15020031108','2#103','2015-8-25');
insert into SD values('15110041008','4#101','2015-8-25');
insert into SD values('15110011002','5#101','2015-8-25');
insert into SD values('16110022037','5#101','2016-8-25');
insert into SD values('14120011028','5#102','2014-8-25');
insert into SD values('15120012009','5#102','2015-8-25');
insert into SD values('16120013011','4#102','2016-8-25');
insert into SD values('16120013013','5#102','2016-8-25');
insert into SD values('17120014011','5#102','2017-8-25');
insert into SD values('14090021027','3#101','2014-8-25');
insert into SD values('14090021001','3#101','2014-8-25');
insert into SD values('15090032010','3#102','2015-8-25');
insert into SD values('15090032013','3#102','2015-8-25');
insert into SD values('16090012014','1#103','2016-8-25');
insert into SD values('17090011045','1#103','2017-8-25');


--����DT����������ϵ����
create table DT
(Bno char(2),
 Tno char(11),
 primary key(Bno,Tno),
 foreign key(Bno) references Building(Bno),
 foreign key(Tno) references Teacher(Tno)
);

insert into DT values('1','2110');
insert into DT values('1','2111');
insert into DT values('2','2120');
insert into DT values('2','2121');
insert into DT values('2','2122');
insert into DT values('3','2130');
insert into DT values('3','2131');
insert into DT values('4','2240');
insert into DT values('4','2241');
insert into DT values('5','2250');
insert into DT values('5','2251');
insert into DT values('6','2360');
insert into DT values('6','2361');
insert into DT values('7','2370');
insert into DT values('7','2371');
insert into DT values('7','2372');


--����DA������Ʋ���ϵ����
create table DA
(Dno char(6),
 Ano char(3),
 Amount int not null,
 primary key(Dno,Ano),
 foreign key(Dno) references Dormitory(Dno),
 foreign key(Ano) references Asset(Ano)
);

insert into DA values('1#101','1',4);
insert into DA values('1#101','2',4);
insert into DA values('1#101','3',4);
insert into DA values('1#101','4',4);
insert into DA values('1#101','5',2);
insert into DA values('1#101','7',1);
insert into DA values('1#102','1',4);
insert into DA values('1#102','2',4);
insert into DA values('1#102','3',4);
insert into DA values('1#102','4',4);
insert into DA values('1#102','5',2);
insert into DA values('1#102','7',1);
insert into DA values('2#101','1',4);
insert into DA values('2#101','2',4);
insert into DA values('2#101','3',4);
insert into DA values('2#101','4',4);
insert into DA values('2#101','5',2);
insert into DA values('2#101','7',1);
insert into DA values('2#102','1',4);
insert into DA values('2#102','2',4);
insert into DA values('2#102','3',4);
insert into DA values('2#102','4',4);
insert into DA values('2#102','5',2);
insert into DA values('2#102','7',1);
insert into DA values('2#103','1',4);
insert into DA values('2#103','2',4);
insert into DA values('2#103','3',4);
insert into DA values('2#103','4',4);
insert into DA values('2#103','5',2);
insert into DA values('2#103','7',1);




--�����û���(User�ǹؼ��֣�������)
create table Usser
(Uno char(15) primary key,
 Pswd char(20),
 Id smallint
 );