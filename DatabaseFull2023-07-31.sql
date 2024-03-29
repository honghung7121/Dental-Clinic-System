USE [master]
GO
/****** Object:  Database [DentalClinicSystem]    Script Date: 7/31/2023 12:22:40 AM ******/
CREATE DATABASE [DentalClinicSystem]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'DentalClinicSystem', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\DentalClinicSystem.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'DentalClinicSystem_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\DentalClinicSystem_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [DentalClinicSystem] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [DentalClinicSystem].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [DentalClinicSystem] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET ARITHABORT OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [DentalClinicSystem] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [DentalClinicSystem] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [DentalClinicSystem] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET  ENABLE_BROKER 
GO
ALTER DATABASE [DentalClinicSystem] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [DentalClinicSystem] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [DentalClinicSystem] SET  MULTI_USER 
GO
ALTER DATABASE [DentalClinicSystem] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [DentalClinicSystem] SET DB_CHAINING OFF 
GO
ALTER DATABASE [DentalClinicSystem] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [DentalClinicSystem] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [DentalClinicSystem] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [DentalClinicSystem] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'DentalClinicSystem', N'ON'
GO
ALTER DATABASE [DentalClinicSystem] SET QUERY_STORE = OFF
GO
USE [DentalClinicSystem]
GO
/****** Object:  User [sa]    Script Date: 7/31/2023 12:22:40 AM ******/
CREATE USER [sa] FOR LOGIN [sa] WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  Table [dbo].[tblAdvisory]    Script Date: 7/31/2023 12:22:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblAdvisory](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[advisoryDate] [date] NULL,
	[fullName] [nvarchar](100) NULL,
	[phoneNumber] [int] NULL,
	[description] [nvarchar](300) NULL,
	[status] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblAppointment]    Script Date: 7/31/2023 12:22:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblAppointment](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[appDate] [date] NULL,
	[appTime] [time](0) NOT NULL,
	[userID] [int] NULL,
	[serviceID] [int] NULL,
	[dentistID] [int] NULL,
	[description] [nvarchar](300) NULL,
	[status] [bit] NULL,
 CONSTRAINT [PK__tblAppoi__3213E83F95CE291E] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblDentist]    Script Date: 7/31/2023 12:22:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblDentist](
	[dentistID] [int] NOT NULL,
	[experience] [nvarchar](100) NULL,
	[degree] [nvarchar](100) NULL,
	[image] [nvarchar](300) NULL,
	[idRoleDentist] [int] NULL,
 CONSTRAINT [PK_tblDentist] PRIMARY KEY CLUSTERED 
(
	[dentistID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblFeedBackDentist]    Script Date: 7/31/2023 12:22:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblFeedBackDentist](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NULL,
	[dentistID] [int] NULL,
	[rate] [int] NULL,
	[cmt] [nvarchar](300) NULL,
	[status] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblFeedBackService]    Script Date: 7/31/2023 12:22:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblFeedBackService](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NULL,
	[serviceID] [int] NULL,
	[rate] [int] NULL,
	[comment] [nvarchar](300) NULL,
	[status] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblRole]    Script Date: 7/31/2023 12:22:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblRole](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[roleName] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblRoleDentist]    Script Date: 7/31/2023 12:22:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblRoleDentist](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblService]    Script Date: 7/31/2023 12:22:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblService](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[serviceName] [nvarchar](100) NULL,
	[description] [nvarchar](380) NULL,
	[price] [float] NULL,
	[status] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblTreatmentCourse]    Script Date: 7/31/2023 12:22:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblTreatmentCourse](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NULL,
	[dentistID] [int] NULL,
	[status] [bit] NULL,
	[nameTreatment] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblTreatmentCourseDetail]    Script Date: 7/31/2023 12:22:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblTreatmentCourseDetail](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[treatmentDate] [date] NULL,
	[treatmentID] [int] NULL,
	[serviceID] [int] NULL,
	[description] [nchar](300) NULL,
	[status] [bit] NULL,
	[statusPaid] [bit] NULL,
	[treatmentTime] [time](0) NULL,
	[statusFeedBack] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblUser]    Script Date: 7/31/2023 12:22:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblUser](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[fullName] [nvarchar](100) NULL,
	[password] [nvarchar](100) NULL,
	[phoneNumber] [nvarchar](10) NULL,
	[idRole] [int] NULL,
	[status] [bit] NULL,
	[email] [nvarchar](100) NULL,
	[Roll] [nvarchar](10) NULL,
	[gender] [nvarchar](10) NULL,
	[idGoogle] [nvarchar](100) NULL,
	[idFacebook] [nvarchar](100) NULL,
 CONSTRAINT [PK__tblUser__3213E83FA12E2F99] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tblAdvisory] ON 

INSERT [dbo].[tblAdvisory] ([id], [advisoryDate], [fullName], [phoneNumber], [description], [status]) VALUES (1, CAST(N'2023-07-28' AS Date), N'Trí', 837250452, N'đau răng quá', 1)
INSERT [dbo].[tblAdvisory] ([id], [advisoryDate], [fullName], [phoneNumber], [description], [status]) VALUES (2, CAST(N'2023-07-28' AS Date), N'Bình', 123456789, N'có chu cầu niềng răng', 1)
INSERT [dbo].[tblAdvisory] ([id], [advisoryDate], [fullName], [phoneNumber], [description], [status]) VALUES (3, CAST(N'2023-07-28' AS Date), N'Hưng', 985632589, N'cần tư vấn về niềng găng', 1)
INSERT [dbo].[tblAdvisory] ([id], [advisoryDate], [fullName], [phoneNumber], [description], [status]) VALUES (4, CAST(N'2023-07-30' AS Date), N'Thảo', 985632145, N'tôi cần tư vấn về niềng răng', 1)
INSERT [dbo].[tblAdvisory] ([id], [advisoryDate], [fullName], [phoneNumber], [description], [status]) VALUES (5, CAST(N'2023-07-30' AS Date), N'Nhật', 985632589, N'tôi muốn được tư vấn về niềng răng', 1)
INSERT [dbo].[tblAdvisory] ([id], [advisoryDate], [fullName], [phoneNumber], [description], [status]) VALUES (6, CAST(N'2023-07-31' AS Date), N'Thảo', 837250452, N'Tôi cần tư vấn', 1)
SET IDENTITY_INSERT [dbo].[tblAdvisory] OFF
GO
SET IDENTITY_INSERT [dbo].[tblAppointment] ON 

INSERT [dbo].[tblAppointment] ([id], [appDate], [appTime], [userID], [serviceID], [dentistID], [description], [status]) VALUES (1, CAST(N'2023-07-15' AS Date), CAST(N'08:00:00' AS Time), 8, NULL, 1, NULL, 1)
INSERT [dbo].[tblAppointment] ([id], [appDate], [appTime], [userID], [serviceID], [dentistID], [description], [status]) VALUES (2, CAST(N'2023-07-15' AS Date), CAST(N'08:00:00' AS Time), 9, NULL, 2, NULL, 1)
INSERT [dbo].[tblAppointment] ([id], [appDate], [appTime], [userID], [serviceID], [dentistID], [description], [status]) VALUES (4, CAST(N'2023-07-19' AS Date), CAST(N'08:00:00' AS Time), 10, NULL, 1, NULL, 1)
INSERT [dbo].[tblAppointment] ([id], [appDate], [appTime], [userID], [serviceID], [dentistID], [description], [status]) VALUES (5, CAST(N'2023-07-20' AS Date), CAST(N'08:00:00' AS Time), 12, NULL, 1, NULL, 1)
INSERT [dbo].[tblAppointment] ([id], [appDate], [appTime], [userID], [serviceID], [dentistID], [description], [status]) VALUES (6, CAST(N'2023-07-19' AS Date), CAST(N'08:00:00' AS Time), 13, NULL, 3, NULL, 1)
INSERT [dbo].[tblAppointment] ([id], [appDate], [appTime], [userID], [serviceID], [dentistID], [description], [status]) VALUES (7, CAST(N'2023-07-31' AS Date), CAST(N'09:30:00' AS Time), 39, NULL, 1, N'', 1)
SET IDENTITY_INSERT [dbo].[tblAppointment] OFF
GO
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (1, N'10 năm', N'Tốt nghiệp Thạc sĩ Bác sĩ Chuyên khoa', N'img/bacsi/bs-nga.jpg', 1)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (2, N'12 năm', N'Tốt nghiệp xuất sắc chuyên ngành RHM tại Đại Học Y Dược TPHCM', N'img/bacsi/bs-tung.jpg', 2)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (3, N'30 năm', N'Chủ tịch Hội Răng Hàm Mặt TP.HCM, Phó Chủ tịch Hội Răng Hàm Mặt Việt Nam', N'img/bacsi/bs-khanh.jpg', 3)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (4, N'15 năm', N'Tốt nghiệp Thạc sĩ chuyên ngành Răng Hàm Mặt, Tốt nghiệp Bác sĩ Đa khoa', N'img/bacsi/bs-hoaianh.jpg', 1)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (5, N'14 năm', N'Phó trưởng khoa Khám bệnh Răng Miệng, Bệnh viện Răng Hàm Mặt Trung ương TP.HCM', N'img/bacsi/bs-hoa.jpg', 2)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (6, N'16 năm', N'Bác sĩ Cộng tác viên Bộ môn phục Hình Răng - Trường Đại học Y Dược TP.HCM', N'img/bacsi/bs-thao.jpg', 3)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (7, N'11 năm', N'Tổng Thư ký Hội Phẫu thuật Tạo hình TP.HCM', N'img/bacsi/bs-cuong.jpg', 1)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (28, N'5 năm', N'Tốt nghiệp Thạc sĩ Bác sĩ Chuyên khoa', N'img/bacsi/bs-ptminhthao.jpg', 1)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (29, N'3 năm', N'Tốt nghiệp Thạc sĩ chuyên ngành Răng Hàm Mặt, Tốt nghiệp Bác sĩ Đa khoa', N'img/bacsi/bs-hoabinh.jpg', 1)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (30, N'5 năm', N'Tốt nghiệp Thạc sĩ Bác sĩ Chuyên khoa', N'img/bacsi/bs-nhunguyen.jpg', 2)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (31, N'6 năm', N'Tốt nghiệp Thạc sĩ chuyên ngành Răng Hàm Mặt, Tốt nghiệp Bác sĩ Đa khoa', N'img/bacsi/bs-trungtruc.jpg', 2)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (32, N'5 năm', N'Tốt nghiệp Thạc sĩ Bác sĩ Chuyên khoa', N'img/bacsi/bs-vanly.jpg', 3)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (33, N'2 năm', N'Tốt nghiệp xuất sắc chuyên ngành RHM tại Đại Học Y Dược TPHCM', N'img/bacsi/bs-dentisttest.jpg', 3)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (34, N'5 năm', N'Tốt nghiệp Thạc sĩ Bác sĩ Chuyên khoa', N'img/bacsi/bs-honghung.jpg', 1)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (35, N'10 năm', N'Tốt nghiệp Thạc sĩ chuyên ngành Răng Hàm Mặt, Tốt nghiệp Bác sĩ Đa khoa', N'img/bacsi/bs-ductri.jpg', 1)
INSERT [dbo].[tblDentist] ([dentistID], [experience], [degree], [image], [idRoleDentist]) VALUES (38, N'5 năm', N'Tốt nghiệp Thạc sĩ Bác sĩ Chuyên khoa', N'img/bacsi/bs-phansongthao.jpg', 1)
GO
SET IDENTITY_INSERT [dbo].[tblFeedBackDentist] ON 

INSERT [dbo].[tblFeedBackDentist] ([id], [userID], [dentistID], [rate], [cmt], [status]) VALUES (11, 8, 1, 4, N'Tôi rất thích cách nha sĩ giải thích quy trình điều trị cho tôi. Tuy nhiên, tôi cảm thấy giá cả có thể được cải thiện hơn, vì nó đắt với tôi quá.', 1)
INSERT [dbo].[tblFeedBackDentist] ([id], [userID], [dentistID], [rate], [cmt], [status]) VALUES (12, 10, 1, 5, N'Tôi đã có trải nghiệm tuyệt vời với nha sĩ. Anh ấy không chỉ giỏi trong chuyên môn mà còn rất nhẹ nhàng và tận tâm với từng bước điều trị. Tôi không còn lo lắng về việc đến nha sĩ nữa, và kết quả cuối cùng thực sự vượt qua mong đợi của tôi.', 1)
INSERT [dbo].[tblFeedBackDentist] ([id], [userID], [dentistID], [rate], [cmt], [status]) VALUES (13, 11, 2, 4, N'Tôi rất ấn tượng với sự chuyên nghiệp của nha sĩ và đội ngũ nhân viên. Tuy nhiên, tôi gặp một số khó khăn khi liên hệ với văn phòng đặt lịch hẹn và ghi chú về các yêu cầu đặc biệt.', 1)
INSERT [dbo].[tblFeedBackDentist] ([id], [userID], [dentistID], [rate], [cmt], [status]) VALUES (14, 13, 3, 4, N'Tôi rất thích không gian phòng chờ và không khí thân thiện tại nha khoa. Tuy nhiên, tôi nghĩ rằng tầm nhìn từ ghế điều trị có thể được cải thiện để mang lại trải nghiệm tốt hơn cho bệnh nhân.', 1)
INSERT [dbo].[tblFeedBackDentist] ([id], [userID], [dentistID], [rate], [cmt], [status]) VALUES (15, 14, 3, 5, N'Tôi đã tìm thấy nha sĩ hoàn hảo cho mình rồi. Nha sĩ Khanh không chỉ là một chuyên gia về nha khoa mà còn có khả năng tạo cảm giác thoải mái và tạo niềm tin cho bệnh nhân. Tôi rất hài lòng với kết quả điều trị của mình và không ngần ngại giới thiệu anh ấy cho mọi người.', 1)
INSERT [dbo].[tblFeedBackDentist] ([id], [userID], [dentistID], [rate], [cmt], [status]) VALUES (16, 15, 4, 5, N'Tôi thật sự ấn tượng với sự tận tâm và tận hưởng công việc của nha sĩ. Anh ấy đã dành thời gian lắng nghe và hiểu về nhu cầu cá nhân của tôi và đã đáp ứng mọi yêu cầu một cách tốt nhất.', 1)
INSERT [dbo].[tblFeedBackDentist] ([id], [userID], [dentistID], [rate], [cmt], [status]) VALUES (17, 16, 5, 4, N'Tôi rất đánh giá cao kỹ năng và kiến thức chuyên môn của nha sĩ Hòa, tuy nhiên tôi phải chờ đợi hơi lâu và cảm nhận được sự thiếu tự tin trong giao tiếp của nha sĩ.', 1)
INSERT [dbo].[tblFeedBackDentist] ([id], [userID], [dentistID], [rate], [cmt], [status]) VALUES (18, 18, 6, 4, N'Mặc dù không được như tôi mong muốn nhưng tôi thấy nha sĩ Thảo có khả năng giao tiếp tốt và giải thích một cách rõ ràng về tình trạng răng miệng của tôi và các phương pháp điều trị khả dụng.', 1)
INSERT [dbo].[tblFeedBackDentist] ([id], [userID], [dentistID], [rate], [cmt], [status]) VALUES (19, 19, 6, 1, N'Tôi thấy rằng nha sĩ thiếu sự tỉ mỉ và cẩn thận trong quy trình điều trị. Tôi đã gặp phải các vấn đề sau khi hoàn thành điều trị và cảm thấy không hài lòng với kết quả cuối cùng.', 1)
INSERT [dbo].[tblFeedBackDentist] ([id], [userID], [dentistID], [rate], [cmt], [status]) VALUES (20, 20, 7, 5, N'Tôi rất hài lòng với kỹ năng và kiến thức chuyên môn của nha sĩ. Nha sĩ Chơn đã thể hiện sự hiểu biết sâu sắc về các vấn đề răng miệng của tôi và đã đưa ra những giải pháp tốt nhất cho tình trạng của tôi.', 1)
SET IDENTITY_INSERT [dbo].[tblFeedBackDentist] OFF
GO
SET IDENTITY_INSERT [dbo].[tblFeedBackService] ON 

INSERT [dbo].[tblFeedBackService] ([id], [userID], [serviceID], [rate], [comment], [status]) VALUES (11, 8, 2, 4, N'Tôi rất hài lòng với quá trình cạo vôi răng của nha sĩ, tuy nhiên tôi cảm thấy không thoải mái với cảm giác đau và nhạy cảm trong quá trình điều trị.', 1)
INSERT [dbo].[tblFeedBackService] ([id], [userID], [serviceID], [rate], [comment], [status]) VALUES (12, 9, 5, 5, N'Tôi thật sự hài lòng với quá trình trám răng sữa của bạn, màu sắc của răng sau khi trám rất đẹp và tự nhiên như tôi mong đợi.', 1)
INSERT [dbo].[tblFeedBackService] ([id], [userID], [serviceID], [rate], [comment], [status]) VALUES (13, 11, 11, 4, N'Tôi rất đánh giá cao quá trình nhổ chân răng, tuy nhiên tôi cảm thấy không thoải mái với đau và khó chịu trong quá trình điều trị. Tôi hy vọng có thể có một trải nghiệm ít đau đớn hơn trong tương lai.', 1)
INSERT [dbo].[tblFeedBackService] ([id], [userID], [serviceID], [rate], [comment], [status]) VALUES (14, 12, 16, 5, N'Quá trình tiểu phẩu thật sự rất đáng sợ, tôi thật sự khá hồi hộp đó. Tuy nhiên sau đó tôi đã bình tĩnh lại và không cảm thấy đau lắm. Cảm ơn những nổ lực của nha sĩ, cho 5 sao nha!!!', 1)
INSERT [dbo].[tblFeedBackService] ([id], [userID], [serviceID], [rate], [comment], [status]) VALUES (15, 14, 20, 5, N'Tôi làm răng sứ ở Đại Nam này nè, răng thì mài không nhiều, màu răng trắng trong rất tự nhiên, bác sĩ ở đây tận tâm lắm.', 1)
INSERT [dbo].[tblFeedBackService] ([id], [userID], [serviceID], [rate], [comment], [status]) VALUES (16, 15, 24, 5, N'Dịch vụ tốt, nha sĩ có chuyên môn, trồng răng sứ rất thích!', 1)
INSERT [dbo].[tblFeedBackService] ([id], [userID], [serviceID], [rate], [comment], [status]) VALUES (17, 17, 31, 5, N'Sau khi bọc räng sứ công viêc của mình trở nên thuận lợi hơn, mọi người ai cũng khen đẹp. Cảm ơn Nha Khoa Dentcare đã mang lại cho minh nụ cười tươisáng và tự tin hơn trong giao tiếp.', 1)
INSERT [dbo].[tblFeedBackService] ([id], [userID], [serviceID], [rate], [comment], [status]) VALUES (18, 18, 37, 4, N'Tôi thật sự cảm thấy hài lòng với nụ cười mới sau khi sử dụng Răng sứ trên Implant Cera SuperBright. Răng sứ này thực sự mang lại một kết quả đẹp và tự nhiên. Màu sắc và ánh sáng của nó tạo nên một nụ cười rạng rỡ và tự tin.', 1)
INSERT [dbo].[tblFeedBackService] ([id], [userID], [serviceID], [rate], [comment], [status]) VALUES (19, 19, 40, 5, N'Tôi rất hài lòng với quá trình niềng răng. Nha sĩ đã thể hiện sự chuyên nghiệp và tận tâm trong việc điều chỉnh răng của tôi. Quá trình điều trị diễn ra suôn sẻ và tôi đã thấy kết quả tích cực.', 1)
INSERT [dbo].[tblFeedBackService] ([id], [userID], [serviceID], [rate], [comment], [status]) VALUES (20, 20, 44, 4, N'Tôi cảm thấy hài lòng với dịch vụ niềng răng ở đây, tuy nhiên tôi cảm thấy không thoải mái với việc cài đặt và điều chỉnh các dây và móc niềng. Nó gây khó chịu và đau trong một số trường hợp. Tôi hi vọng có thể có một trải nghiệm niềng răng thoải mái hơn trong tương lai.', 1)
SET IDENTITY_INSERT [dbo].[tblFeedBackService] OFF
GO
SET IDENTITY_INSERT [dbo].[tblRole] ON 

INSERT [dbo].[tblRole] ([id], [roleName]) VALUES (1, N'Admin')
INSERT [dbo].[tblRole] ([id], [roleName]) VALUES (2, N'Dentist')
INSERT [dbo].[tblRole] ([id], [roleName]) VALUES (3, N'Marketing')
INSERT [dbo].[tblRole] ([id], [roleName]) VALUES (4, N'Customer Consultant')
INSERT [dbo].[tblRole] ([id], [roleName]) VALUES (5, N'Customer')
SET IDENTITY_INSERT [dbo].[tblRole] OFF
GO
SET IDENTITY_INSERT [dbo].[tblRoleDentist] ON 

INSERT [dbo].[tblRoleDentist] ([id], [name]) VALUES (1, N'Nha sĩ')
INSERT [dbo].[tblRoleDentist] ([id], [name]) VALUES (2, N'Hộ lý nha khoa')
INSERT [dbo].[tblRoleDentist] ([id], [name]) VALUES (3, N'Điều dưỡng nha khoa')
SET IDENTITY_INSERT [dbo].[tblRoleDentist] OFF
GO
SET IDENTITY_INSERT [dbo].[tblService] ON 

INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (1, N'Khám tổng quát', N'Kiểm tra, đánh giá và chăm sóc toàn diện cho sức khỏe răng miệng. Đây là một cuộc hẹn điều trị thông thường trong nha khoa và thường được khuyến nghị hai lần mỗi năm để duy trì sức khỏe răng miệng tốt.', 0, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (2, N'Cạo vôi răng', N'Loại bỏ mảng bám và các cặn vôi tích tụ trên bề mặt răng. Mảng bám và vôi là các chất cứng tích tụ từ thức ăn và nước uống mà không được loại bỏ đúng cách bằng cách đánh răng thông thường.', 400000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (3, N'Điều trị viêm nha chu Cấp 1', N'Điều trị viêm nhiễm của mô nha chu (gồm nướu, xương và mô liên kết xung quanh răng) do sự tích tụ mảng bám và vi khuẩn trong khoảng không gian giữa răng và nướu.', 600000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (4, N'Điều trị viêm nha chu Cấp 2', N'Viêm nha chu cấp 2 nặng hơn cấp 1, có thể cần đến các biện pháp điều trị bổ sung như việc sử dụng kháng sinh hoặc phẫu thuật để điều trị các vấn đề liên quan đến viêm nha chu.', 1000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (5, N'Trám răng sữa', N'Sửa chữa và khôi phục răng sữa bị hư hỏng, thường do sâu răng. Quá trình này nhằm loại bỏ sâu răng và sau đó sử dụng chất trám (như composite) để khôi phục răng sữa và tái thiết kết cấu của nó. Trám răng sữa thường được thực hiện cho trẻ em có răng sữa bị mục nát hoặc bị sâu răng.', 200000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (6, N'Trám răng thẩm mỹ', N'Khôi phục và tái tạo răng bị hư hỏng một cách tự nhiên và esthetic. Thay vì sử dụng các vật liệu truyền thống như amalgam (chất trám bạc) có màu xám đen, trám răng thẩm mỹ sử dụng chất trám composite màu sắc phù hợp với màu răng tự nhiên. Quá trình này giúp tái tạo vẻ đẹp tự nhiên của răng và mang lại nụ cười tươi sáng.', 500000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (7, N'Trám cổ răng', N'Trám răng nhằm khôi phục vùng cổ răng bị hư hỏng. Vùng cổ răng là phần nằm gần nướu và thường dễ bị mục nát, mất men hoặc có các vấn đề khác. Quá trình trám cổ răng thường bao gồm loại bỏ vùng hư hỏng, làm sạch và sau đó sử dụng chất trám composite hoặc vật liệu khác để tái tạo và bảo vệ vùng cổ răng.', 600000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (8, N'Nhổ răng sữa', N'Loại bỏ răng sữa đã chảy rụng để làm đường cho răng vĩnh viễn mọc thay thế. Răng sữa thường rụng tự nhiên khi răng vĩnh viễn phía sau nó đã sẵn sàng để mọc lên.', 100000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (9, N'Nhổ răng cửa R1-2-3', N'Loại bỏ răng cửa thứ nhất, thứ hai và thứ ba từ bên phải (R1), giữa (R2) và bên trái (R3) trong hàm trên hoặc dưới của một người.', 500000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (10, N'Nhổ răng nhiều chân R4-5-6-7', N'Loại bỏ răng nhiều chân thứ tư, thứ năm, thứ sáu và thứ bảy từ bên phải (R4) đến bên trái (R7) trong hàm trên hoặc dưới của một người.', 800000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (11, N'Nhổ chân răng, răng lung lay', N'Loại bỏ chân răng hoặc rễ răng từ trong xương hàm.', 300000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (12, N'Tiểu phẩu răng khôn – Mọc thẳng', N'Loại bỏ răng khôn mọc thẳng nếu nó gây áp lực lên các răng khác hoặc không có đủ không gian để vệ sinh.', 1000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (13, N'Tiểu phẩu răng khôn – Khó độ I', N'Loại bỏ răng khôn khó độ 1: Răng khôn mọc hoàn toàn trong xương hàm và không gây áp lực lên các răng khác.', 1800000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (14, N'Tiểu phẩu răng khôn – Khó độ II', N'Loại bỏ răng khôn khó độ 2: Răng khôn chưa hoàn toàn mọc ra khỏi xương hàm nhưng đã phá vỡ một phần của nướu.', 2500000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (15, N'Tiểu phẩu răng khôn – Khó độ III', N'Loại bỏ răng khôn khó độ 3: Răng khôn chỉ mọc một phần và chưa phá vỡ nướu.', 3500000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (16, N'Tiểu phẩu răng khôn – Khó độ IV', N'Loại bỏ răng khôn khó độ 4: Răng khôn không thể hoàn toàn mọc lên mà còn chôn sâu trong xương hàm.', 5000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (17, N'Tẩy trắng răng', N'Sử dụng các chất hoá học hoặc phương pháp công nghệ để làm sáng màu răng và loại bỏ các vết ố, mảng bám và bề mặt bị nhưng do thức ăn, đồ uống, thuốc lá và quá trình lão hóa.', 3000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (18, N'Răng giả acrylic', N'Loại răng giả phổ biến nhất và được sử dụng rộng rãi. Răng giả acrylic được làm từ chất liệu nhựa acrylic có độ bền cao.', 1800000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (19, N'Răng sứ kim loại Titan', N'Đây là loại răng sứ được làm từ hợp kim titan, có độ bền cao và chống oxi hóa tốt.', 2500000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (20, N'Răng sứ kim loại Cr-co', N'Loại răng sứ này được làm từ hợp kim crôm-coban, một loại hợp kim kim loại thông dụng trong nha khoa.', 3500000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (21, N'Răng sứ Sage', N'Loại răng sứ với chất lượng cao và độ bền tốt. Chúng được tạo ra từ sự kết hợp giữa sứ và hợp chất phủ sứ, mang lại một cái nhìn tự nhiên và đẹp.', 5500000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (22, N'Răng sứ Bio', N'Loại răng sứ được sản xuất từ sứ tự nhiên, tạo nên một bề mặt mịn màng và tự nhiên. Chúng thường có tính kháng khuẩn cao và khả năng chống thấm mực tốt.', 6900000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (23, N'Răng sứ Sage Shine', N'Phiên bản cải tiến của răng sứ Sage, với khả năng tái tạo sự sáng bóng tự nhiên và khả năng chống bám mảng bám tốt hơn.', 8800000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (24, N'Răng sứ Bio Shine HT', N'Loại răng sứ cao cấp, kết hợp giữa sự tự nhiên của sứ và khả năng chống chịu lực cao. Nó có một bề mặt sáng bóng và đẹp mắt.', 10500000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (25, N'Răng sứ Viva', N'Loại răng sứ được sản xuất bằng công nghệ tiên tiến và vật liệu sứ cao cấp. Răng sứ Viva có độ bền cao và khả năng tương thích môi trường miệng tốt. ', 6900000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (26, N'Răng sứ Viva Shine', N'Phiên bản cải tiến của răng sứ Viva, với khả năng tái tạo sự sáng bóng tự nhiên. Răng sứ Viva Shine có một lớp phủ đặc biệt giúp duy trì sự sáng bóng và độ bền màu của răng trong thời gian dài. Điều này giúp răng sứ trông luôn mới và tự nhiên hơn.', 8800000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (27, N'Răng sứ Viva Ultrathin', N'Loại răng sứ siêu mỏng, chỉ có độ dày khoảng 0,2-0,3mm. Răng sứ Viva Ultrathin được thiết kế để tạo ra vẻ đẹp tự nhiên và mỏng nhẹ nhưng vẫn đảm bảo độ bền và chịu lực tương đương với các loại răng sứ khác.', 12800000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (28, N'Trụ Implant + Abutment Biotem', N'Biotem là một nhãn hiệu nha khoa cung cấp các loại trụ implant và abutment. Các trụ implant và abutment Biotem thường được làm từ chất liệu titanium hoặc hợp kim titanium, đảm bảo tính an toàn và độ bền cao.', 17000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (29, N'Trụ Implant + Abutment Dio	', N' Dio là một nhãn hiệu nha khoa nổi tiếng cung cấp các sản phẩm implant và abutment. Chúng được làm từ titanium hoặc hợp kim titanium, với các lớp phủ bề mặt đặc biệt để tăng khả năng tích hợp với xương và mô nướu.', 17000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (30, N'Trụ Implant + Abutment Swiss', N'Swiss là một nhãn hiệu nha khoa uy tín cung cấp các sản phẩm implant và abutment. Trụ implant và abutment Swiss thường được sản xuất từ titanium, được gia công và thiết kế chính xác để đảm bảo khả năng tương thích và ổn định với hệ thống implant. Chúng có độ bền cao và đáng tin cậy.', 29000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (31, N'Trụ Implant + Abutment Straumann SLA', N'Straumann là một nhãn hiệu nổi tiếng trong lĩnh vực nha khoa và cung cấp các sản phẩm implant và abutment chất lượng cao. Trụ implant và abutment Straumann SLA thường có bề mặt phủ SLA, giúp tăng khả năng tương thích với xương và mô nướu. Chúng được làm từ titanium hoặc hợp kim titanium, đáng tin cậy và được sử dụng phổ biến trong ngành nha khoa.', 30000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (32, N'Trụ Implant + Abutment Straumann SLA Active', N'Phiên bản nâng cấp của trụ implant và abutment Straumann SLA. Trụ implant và abutment Straumann SLA Active có bề mặt phủ SLA Active, được thiết kế để thúc đẩy sự tích hợp xương và giảm thời gian trị liệu. Chúng cũng có tính năng kháng khuẩn và độ bền cao.', 34000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (33, N'Trụ Implant + Abutment Nobel Active', N'Loại trụ implant và abutment thuộc hệ thống Nobel Biocare. Nó được thiết kế với mục đích cải thiện tính ổn định và tương thích với xương. Trụ implant và abutment Nobel Active được chế tạo từ vật liệu titanium hoặc hợp kim titanium, với một hệ thống kết nối chính xác giữa trụ và abutment để tạo ra một nền móng vững chắc cho răng sứ.', 34000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (34, N'Răng sứ trên Implant Titan', N'Loại răng sứ được gắn lên trụ implant được làm từ vật liệu titan. Răng sứ trên Implant Titan có độ bền cao, tính thẩm mỹ tốt và khả năng tương thích với mô xương và mô nướu. Chúng được chế tạo theo kích thước, hình dạng và màu sắc tự nhiên của răng, tạo ra một nụ cười tự nhiên và hài hòa.', 4000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (35, N'Răng sứ trên Implant Cera', N'Loại răng sứ được gắn lên trụ implant và được chế tạo từ vật liệu sứ cao cấp. Răng sứ trên Implant Cera có tính thẩm mỹ cao, với màu sắc và ánh sáng tự nhiên tương tự như răng tự nhiên. Chúng được tạo hình chính xác để khớp với cấu trúc răng và mô nướu, tạo ra một nụ cười tuyệt đẹp và tự nhiên.', 6500000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (36, N'Răng sứ trên Implant Cera Bright	', N'Phiên bản cải tiến của răng sứ trên Implant Cera. Nó có một lớp phủ đặc biệt giúp tăng cường độ sáng và sự lấp lánh của răng. Răng sứ trên Implant Cera Bright mang lại một nụ cười trắng sáng và tự nhiên hơn, đồng thời giữ được tính thẩm mỹ và độ bền cao.', 7900000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (37, N'Răng sứ trên Implant Cera SuperBright', N'Loại răng sứ được gắn lên trụ implant với tính năng sáng bóng vượt trội. Với lớp phủ đặc biệt, nó mang đến một nụ cười rạng rỡ và tự nhiên hơn. Chế tạo từ vật liệu sứ cao cấp và độ chính xác cao, răng sứ này khớp hoàn hảo với cấu trúc răng và mô nướu. Đồng thời, nó cũng có độ bền và độ chống nứt tốt', 8400000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (38, N'Niềng răng mắc cài kim loại chuẩn – Đơn giản', N'Phương pháp này sử dụng các braket (cài kim loại) được gắn lên răng và được kết nối bằng các dây đai và lò xo. Quá trình niềng răng đơn giản này thường áp dụng cho các trường hợp chỉ cần điều chỉnh vị trí răng đơn giản.', 35000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (39, N'Niềng răng mắc cài kim loại chuẩn – Phức tạp', N'Tương tự như niềng răng đơn giản, nhưng trong trường hợp này, quá trình điều chỉnh vị trí răng phức tạp hơn và có thể yêu cầu thời gian và công sức lớn hơn.', 45000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (40, N'Niềng răng mắc cài kim loại có khóa – Đơn giản', N'Phương pháp này sử dụng cùng các braket và dây đai như niềng răng mắc cài kim loại chuẩn, nhưng có thêm một khoá được đặt để giữ chặt dây đai và tăng cường hiệu quả điều chỉnh răng.', 40000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (41, N'Niềng răng mắc cài kim loại có khóa – Phức tạp', N'ương tự như niềng răng mắc cài kim loại đơn giản, nhưng với độ phức tạp cao hơn trong việc điều chỉnh vị trí răng.', 50000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (42, N'Niềng răng mắc cài sứ chuẩn – Đơn giản', N'Phương pháp này sử dụng các braket và dây đai được gắn lên răng sứ để điều chỉnh vị trí răng. Đây là lựa chọn phổ biến cho những người muốn giữ vẻ đẹp tự nhiên của răng sứ.', 40000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (43, N'Niềng răng mắc cài sứ chuẩn – Phức tạp', N'Tương tự như niềng răng mắc cài sứ đơn giản, nhưng có độ phức tạp cao hơn trong việc điều chỉnh vị trí răng.', 50000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (44, N'Niềng răng Invisalign – Đơn giản', N'Phương pháp này sử dụng hệ thống ốp trơn và trong suốt, gọi là Aligners, để điều chỉnh vị trí răng. Các Aligners được tạo ra thông qua quá trình quét 3D của răng và mô phỏng di chuyển răng dựa trên kế hoạch điều trị. Bằng cách thay đổi Aligners theo lịch trình được đề ra, răng dần dần di chuyển đến vị trí mong muốn.', 34000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (45, N'Niềng răng Invisalign – Phức tạp cấp I', N'Đây là trường hợp phức tạp nhất trong phạm vi Invisalign, thường liên quan đến các vấn đề như răng chồng chéo, răng lệch hướng, hay sự mất cân đối nghiêm trọng giữa hai hàm. Để đạt được kết quả tốt, có thể yêu cầu sự kết hợp của niềng răng Invisalign với các phương pháp khác như trích xuất răng, trị liệu hàm mặt hoặc phẫu thuật.', 81000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (46, N'Niềng răng Invisalign – Phức tạp cấp II', N'Trường hợp này liên quan đến sự chồng chéo, lệch hướng răng và các vấn đề khác nhau trong một phạm vi vừa phải. Các vấn đề này có thể yêu cầu thời gian và công sức nhiều hơn so với niềng răng đơn giản, và cần một kế hoạch điều trị chi tiết và cẩn thận.', 101000000, 1)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (47, N'Niềng răng Invisalign – Phức tạp cấp III', N'Đây là trường hợp phức tạp trung bình, liên quan đến các vấn đề như sự chồng chéo, lệch hướng răng và một số vấn đề khác, nhưng ở mức độ nhẹ hơn so với cấp II. Quá trình điều trị có thể được thực hiện với sự kết hợp của các Aligners phức tạp hơn và kế hoạch điều chỉnh răng cụ thể.', 121000000, 0)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (48, N'Kế hoạch mô phỏng di chuyển răng 3D (Clincheck)', N'Đây là một bước quan trọng trong quá trình niềng răng Invisalign. Bằng cách sử dụng công nghệ quét 3D, dữ liệu răng của bạn sẽ được chuyển vào phần mềm Clincheck để tạo ra mô phỏng di chuyển răng chi tiết. Kế hoạch này sẽ hiển thị các bước di chuyển từ vị trí hiện tại đến vị trí mục tiêu của răng trong suốt quá trình điều trị.', 8000000, 0)
INSERT [dbo].[tblService] ([id], [serviceName], [description], [price], [status]) VALUES (49, N'Khác', NULL, 0, 1)
SET IDENTITY_INSERT [dbo].[tblService] OFF
GO
SET IDENTITY_INSERT [dbo].[tblTreatmentCourse] ON 

INSERT [dbo].[tblTreatmentCourse] ([id], [userID], [dentistID], [status], [nameTreatment]) VALUES (1, 8, 1, 1, N'Nhổ răng khôn')
INSERT [dbo].[tblTreatmentCourse] ([id], [userID], [dentistID], [status], [nameTreatment]) VALUES (2, 9, 2, 1, N'Nhổ răng sữa')
INSERT [dbo].[tblTreatmentCourse] ([id], [userID], [dentistID], [status], [nameTreatment]) VALUES (3, 10, 1, 1, N'Trồng răng sứ')
INSERT [dbo].[tblTreatmentCourse] ([id], [userID], [dentistID], [status], [nameTreatment]) VALUES (4, 12, 1, 1, N'Viêm nha chu')
INSERT [dbo].[tblTreatmentCourse] ([id], [userID], [dentistID], [status], [nameTreatment]) VALUES (5, 13, 3, 1, N'Nhổ răng hàm trên')
SET IDENTITY_INSERT [dbo].[tblTreatmentCourse] OFF
GO
SET IDENTITY_INSERT [dbo].[tblTreatmentCourseDetail] ON 

INSERT [dbo].[tblTreatmentCourseDetail] ([id], [treatmentDate], [treatmentID], [serviceID], [description], [status], [statusPaid], [treatmentTime], [statusFeedBack]) VALUES (1, CAST(N'2023-07-16' AS Date), 1, 2, N'Cạo vôi răng                                                                                                                                                                                                                                                                                                ', 1, 1, CAST(N'08:00:00' AS Time), 0)
INSERT [dbo].[tblTreatmentCourseDetail] ([id], [treatmentDate], [treatmentID], [serviceID], [description], [status], [statusPaid], [treatmentTime], [statusFeedBack]) VALUES (2, CAST(N'2023-07-17' AS Date), 1, 12, N'Tiểu phẩu răng khôn                                                                                                                                                                                                                                                                                         ', 1, 1, CAST(N'08:00:00' AS Time), 0)
INSERT [dbo].[tblTreatmentCourseDetail] ([id], [treatmentDate], [treatmentID], [serviceID], [description], [status], [statusPaid], [treatmentTime], [statusFeedBack]) VALUES (3, CAST(N'2023-07-16' AS Date), 2, 2, N'Cạo vôi răng                                                                                                                                                                                                                                                                                                ', 1, 1, CAST(N'09:00:00' AS Time), 0)
INSERT [dbo].[tblTreatmentCourseDetail] ([id], [treatmentDate], [treatmentID], [serviceID], [description], [status], [statusPaid], [treatmentTime], [statusFeedBack]) VALUES (4, CAST(N'2023-07-18' AS Date), 2, 8, N'Nhổ răng sữa                                                                                                                                                                                                                                                                                                ', 1, 1, CAST(N'10:00:00' AS Time), 0)
INSERT [dbo].[tblTreatmentCourseDetail] ([id], [treatmentDate], [treatmentID], [serviceID], [description], [status], [statusPaid], [treatmentTime], [statusFeedBack]) VALUES (5, CAST(N'2023-07-20' AS Date), 3, 2, N'Cạo vôi răng                                                                                                                                                                                                                                                                                                ', 1, 1, CAST(N'16:00:00' AS Time), 0)
INSERT [dbo].[tblTreatmentCourseDetail] ([id], [treatmentDate], [treatmentID], [serviceID], [description], [status], [statusPaid], [treatmentTime], [statusFeedBack]) VALUES (6, CAST(N'2023-07-25' AS Date), 3, 18, N'Trồng răng                                                                                                                                                                                                                                                                                                  ', 1, 1, CAST(N'15:00:00' AS Time), 0)
INSERT [dbo].[tblTreatmentCourseDetail] ([id], [treatmentDate], [treatmentID], [serviceID], [description], [status], [statusPaid], [treatmentTime], [statusFeedBack]) VALUES (7, CAST(N'2023-07-21' AS Date), 4, 2, N'Cạo vôi răng                                                                                                                                                                                                                                                                                                ', 1, 1, CAST(N'08:00:00' AS Time), 0)
INSERT [dbo].[tblTreatmentCourseDetail] ([id], [treatmentDate], [treatmentID], [serviceID], [description], [status], [statusPaid], [treatmentTime], [statusFeedBack]) VALUES (8, CAST(N'2023-07-22' AS Date), 4, 17, N'Tẩy trắng răng                                                                                                                                                                                                                                                                                              ', 1, 1, CAST(N'10:00:00' AS Time), 0)
INSERT [dbo].[tblTreatmentCourseDetail] ([id], [treatmentDate], [treatmentID], [serviceID], [description], [status], [statusPaid], [treatmentTime], [statusFeedBack]) VALUES (9, CAST(N'2023-07-29' AS Date), 4, 3, N'Điều trị viêm nha chu                                                                                                                                                                                                                                                                                       ', 1, 1, CAST(N'11:00:00' AS Time), 0)
INSERT [dbo].[tblTreatmentCourseDetail] ([id], [treatmentDate], [treatmentID], [serviceID], [description], [status], [statusPaid], [treatmentTime], [statusFeedBack]) VALUES (10, CAST(N'2023-07-20' AS Date), 5, 9, N'Nhổ răng hàm trên                                                                                                                                                                                                                                                                                           ', 1, 1, CAST(N'08:00:00' AS Time), 0)
SET IDENTITY_INSERT [dbo].[tblTreatmentCourseDetail] OFF
GO
SET IDENTITY_INSERT [dbo].[tblUser] ON 

INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (1, N'Trần Thị Mỹ Nga', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0258659666', 2, 1, N'ngamtt@gmail.com', NULL, N'Nữ', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (2, N'Nguyễn Hiếu Tùng', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0214587659', 2, 1, N'tunghn@gmail.com', NULL, N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (3, N'Ngô Đồng Khanh', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0214563578', 2, 1, N'khanhdn@gmail.com', NULL, N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (4, N'Trương Thị Hoài An', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0236547856', 2, 1, N'anhtt@gmail.com', NULL, N'Nữ', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (5, N'Vũ Quang Hòa', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0236598741', 2, 1, N'hoaqv@gmail.com', NULL, N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (6, N'Nguyễn Thị Thảo', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0214536589', 2, 1, N'thaotn@gmail.com', NULL, N'Nữ', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (7, N'Hồ Nguyễn Thanh Chơn', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0985657892', 2, 1, N'chontnh@gmail.com', NULL, N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (8, N'Trần Minh Sang', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0896574523', 5, 1, N'sangmt@gmail.com', N'P001', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (9, N'Nguyễn Công Danh', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0258745633', 5, 1, N'danhcn@gmail.com', N'P002', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (10, N'Lưu Thành Đạt', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0258965785', 5, 1, N'dattl@gmail.com', N'P003', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (11, N'Nguyễn Hoàng Anh', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0236589657', 5, 1, N'anhhn@gmail.com', N'P004', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (12, N'Nguyễn Đăng Quang', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0256321458', 5, 1, N'quangdn@gmail.com', N'P005', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (13, N'Chướng Thành Đông', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0236589657', 5, 1, N'dongtc@gmail.com', N'P006', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (14, N'Đinh Quang Minh', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0236589657', 5, 1, N'minhqd@gmail.com', N'P007', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (15, N'Kiều Quang Phúc', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0236547896', 5, 1, N'phucqk@gmail.com', N'P008', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (16, N'Nguyễn Trung Kiên', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0256325632', 5, 1, N'kientn@gmail.com', N'P009', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (17, N'Nguyễn Thành Long', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0236589998', 5, 1, N'longtn@gmail.com', N'P010', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (18, N'Trần Hữu Phước', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0235478965', 5, 1, N'phuocht@gmail.com', N'P011', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (19, N'Nguyễn Minh Trí', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0145789654', 5, 1, N'trimn@gmail.com', N'P012', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (20, N'Hoàng Thảo Nguyên', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0254657867', 5, 1, N'nguyenth@gmail.com', N'P013', N'Nữ', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (21, N'Trần Nguyên Hiền', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0213578968', 5, 1, N'hiennt@gmail.com', N'P014', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (22, N'Hoàng Mỹ Ly', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0987563254', 5, 1, N'lymh@gmail.com', N'P015', N'Nữ', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (23, N'Trần Văn Hào', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0856997752', 3, 1, N'haovh@gmail.com', NULL, N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (24, N'Đặng Bảo Nhi', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0456558871', 3, 1, N'nhibh@gmail.com', NULL, N'Nữ', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (25, N'Lê Văn Mỹ', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0986691124', 4, 1, N'myvl@gmail.com', NULL, N'Nữ', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (26, N'Trương Thoại Phương Thư', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0896588932', 4, 1, N'thuptt@gmail.com', NULL, N'Nữ', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (27, N'ADMIN', N'QuyCExO+cRcQcLqmtME1Gr6ZXNI=', N'0874547851', 1, 1, N'admin@gmail.com', NULL, N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (28, N'Phan Song Thảo', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0896578966', 2, 1, N'songthao@gmail.com', NULL, N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (29, N'Lê Hòa Bình', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0986586698', 2, 1, N'hoabinh@gmail.com', NULL, N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (30, N'Lê Văn Ba', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0986588965', 5, 1, N'levnanba@gmail.com', N'P016', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (31, N'Nguyễn Nhu Nguyên', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0325699856', 2, 1, N'nhunguyen@gmail.com', NULL, N'Nữ', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (32, N'Lê Trung Trực', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0986586958', 2, 1, N'av@gmail.com', NULL, N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (33, N'Đào Văn Ly', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0856998853', 2, 1, N'gg@gmail.com', NULL, N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (34, N'Trần Hồng Hưng', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0789885633', 5, 1, N'bintran7121@gmail.com', N'P017', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (35, N'Nguyễn Huỳnh Đức Trí', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0789558823', 5, 1, N'ductri3122002@gmail.com', N'P018', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (36, N'Lê Hòa Bình', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0741589655', 5, 1, N'hb1234tv@gmail.com', N'P019', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (37, N'Lê Văn Nhật', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0869875331', 5, 1, N'levannhat574602@gmail.com', N'P020', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (38, N'Phan Song Thảo', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0789889235', 5, 1, N'phansongthao204@gmail.com', N'P021', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (39, N'User Test', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0987511478', 5, 1, N'usertestdcbss@gmail.com', N'P022', N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (40, N'Marketing Test', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0986522458', 3, 1, N'marketingtestdcbs@gmail.com', NULL, N'Nam', NULL, NULL)
INSERT [dbo].[tblUser] ([id], [fullName], [password], [phoneNumber], [idRole], [status], [email], [Roll], [gender], [idGoogle], [idFacebook]) VALUES (41, N'CSKH Test', N'9UmyoQQHfwK5l0E/zJVhGjzoH2g=', N'0986522458', 4, 1, N'cskhtestdcbs@gmail.com', NULL, N'Nam', NULL, NULL)
SET IDENTITY_INSERT [dbo].[tblUser] OFF
GO
/****** Object:  Index [UQ__tblDenti__BA394DCBEDC7E35F]    Script Date: 7/31/2023 12:22:40 AM ******/
ALTER TABLE [dbo].[tblDentist] ADD  CONSTRAINT [UQ__tblDenti__BA394DCBEDC7E35F] UNIQUE NONCLUSTERED 
(
	[dentistID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[tblAdvisory] ADD  DEFAULT (getdate()) FOR [advisoryDate]
GO
ALTER TABLE [dbo].[tblAppointment]  WITH CHECK ADD  CONSTRAINT [FK__tblAppoin__userI__6EF57B66] FOREIGN KEY([userID])
REFERENCES [dbo].[tblUser] ([id])
GO
ALTER TABLE [dbo].[tblAppointment] CHECK CONSTRAINT [FK__tblAppoin__userI__6EF57B66]
GO
ALTER TABLE [dbo].[tblAppointment]  WITH CHECK ADD  CONSTRAINT [FK_tblAppointment_tblDentist] FOREIGN KEY([dentistID])
REFERENCES [dbo].[tblDentist] ([dentistID])
GO
ALTER TABLE [dbo].[tblAppointment] CHECK CONSTRAINT [FK_tblAppointment_tblDentist]
GO
ALTER TABLE [dbo].[tblAppointment]  WITH CHECK ADD  CONSTRAINT [FK_tblAppointment_tblService] FOREIGN KEY([serviceID])
REFERENCES [dbo].[tblService] ([id])
GO
ALTER TABLE [dbo].[tblAppointment] CHECK CONSTRAINT [FK_tblAppointment_tblService]
GO
ALTER TABLE [dbo].[tblDentist]  WITH CHECK ADD  CONSTRAINT [FK_tblDentist_tblRoleDentist] FOREIGN KEY([idRoleDentist])
REFERENCES [dbo].[tblRoleDentist] ([id])
GO
ALTER TABLE [dbo].[tblDentist] CHECK CONSTRAINT [FK_tblDentist_tblRoleDentist]
GO
ALTER TABLE [dbo].[tblDentist]  WITH CHECK ADD  CONSTRAINT [FK_tblDentist_tblUser] FOREIGN KEY([dentistID])
REFERENCES [dbo].[tblUser] ([id])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[tblDentist] CHECK CONSTRAINT [FK_tblDentist_tblUser]
GO
ALTER TABLE [dbo].[tblFeedBackDentist]  WITH CHECK ADD FOREIGN KEY([dentistID])
REFERENCES [dbo].[tblDentist] ([dentistID])
GO
ALTER TABLE [dbo].[tblFeedBackDentist]  WITH CHECK ADD FOREIGN KEY([userID])
REFERENCES [dbo].[tblUser] ([id])
GO
ALTER TABLE [dbo].[tblFeedBackService]  WITH CHECK ADD FOREIGN KEY([serviceID])
REFERENCES [dbo].[tblService] ([id])
GO
ALTER TABLE [dbo].[tblFeedBackService]  WITH CHECK ADD FOREIGN KEY([userID])
REFERENCES [dbo].[tblUser] ([id])
GO
ALTER TABLE [dbo].[tblTreatmentCourse]  WITH CHECK ADD FOREIGN KEY([dentistID])
REFERENCES [dbo].[tblDentist] ([dentistID])
GO
ALTER TABLE [dbo].[tblTreatmentCourse]  WITH CHECK ADD FOREIGN KEY([userID])
REFERENCES [dbo].[tblUser] ([id])
GO
ALTER TABLE [dbo].[tblTreatmentCourseDetail]  WITH CHECK ADD FOREIGN KEY([treatmentID])
REFERENCES [dbo].[tblTreatmentCourse] ([id])
GO
ALTER TABLE [dbo].[tblTreatmentCourseDetail]  WITH CHECK ADD  CONSTRAINT [FK_tblTreatmentCourseDetail_tblService] FOREIGN KEY([serviceID])
REFERENCES [dbo].[tblService] ([id])
GO
ALTER TABLE [dbo].[tblTreatmentCourseDetail] CHECK CONSTRAINT [FK_tblTreatmentCourseDetail_tblService]
GO
ALTER TABLE [dbo].[tblUser]  WITH CHECK ADD  CONSTRAINT [FK__tblUser__idRole__3A81B327] FOREIGN KEY([idRole])
REFERENCES [dbo].[tblRole] ([id])
GO
ALTER TABLE [dbo].[tblUser] CHECK CONSTRAINT [FK__tblUser__idRole__3A81B327]
GO
USE [master]
GO
ALTER DATABASE [DentalClinicSystem] SET  READ_WRITE 
GO
