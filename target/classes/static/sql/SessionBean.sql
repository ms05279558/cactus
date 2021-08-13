create table [cactus] (
		[user_id] int primary key identity not null
		,[username]	nvarchar(max) not null
      ,[email] nvarchar(max) not null
      ,[password] nvarchar(max) not null
      ,[name] nvarchar(max) null
      ,[gender] nvarchar(50) null
      ,[birth] date null
      ,[cellphone] nvarchar(max) null
      ,[qualification_of_teacher] bit not null
);

create table member_session (
	orderId int primary key identity not null,
	user_id int not null foreign key references [dbo].[cactus](user_id),
	courseid int not null foreign key references [dbo].[course](courseid),
    purchased_Date nvarchar(10) not null
	  );
	  
create table course(
		[courseid] int primary key identity not null
      ,[course_type] nvarchar(20) not null
      ,[user_id] int foreign key references [dbo].[cactus](user_id) not null
      ,[course_name] nvarchar(max) not null
      ,[course_description] nvarchar(max) null
      ,[price] int not null
      ,[launched] date not null
);