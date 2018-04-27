/*
-- Query: SELECT * FROM bapp.department
LIMIT 0, 1000

-- Date: 2018-02-21 13:41
*/
INSERT INTO `bapp.department` (`id`,`name`,`short_name`,`number`,`department_type`,`is_part_of_id`) VALUES (1,'Public','PS','0007',1,7);
INSERT INTO `bapp.department` (`id`,`name`,`short_name`,`number`,`department_type`,`is_part_of_id`) VALUES (2,'Business Consulting Public','BCP','0071',2,1);
INSERT INTO `bapp.department` (`id`,`name`,`short_name`,`number`,`department_type`,`is_part_of_id`) VALUES (3,'Government','PSG','0072',2,1);
INSERT INTO `bapp.department` (`id`,`name`,`short_name`,`number`,`department_type`,`is_part_of_id`) VALUES (4,'Security & Transport','PSST','0077',2,1);
INSERT INTO `bapp.department` (`id`,`name`,`short_name`,`number`,`department_type`,`is_part_of_id`) VALUES (5,'Homeland Security','PSHS','0073',3,1);
INSERT INTO `bapp.department` (`id`,`name`,`short_name`,`number`,`department_type`,`is_part_of_id`) VALUES (6,'Transport','PST','0074',3,1);
INSERT INTO `bapp.department` (`id`,`name`,`short_name`,`number`,`department_type`,`is_part_of_id`) VALUES (7,'Sopra Steria AG','SopraSteria AG','001',0,NULL);
INSERT INTO `bapp.department` (`id`,`name`,`short_name`,`number`,`department_type`,`is_part_of_id`) VALUES (8,'Banking','Banking','002',1,7);

/*
-- Query: SELECT * FROM bapp.consultant
LIMIT 0, 1000

-- Date: 2018-02-21 13:41
*/
INSERT INTO `bapp.consultant` (`id`,`first_name`,`surname`,`middle_name`,`job_title`,`title`,`birthdate`,`gender`,`date_of_joining`,`date_of_leaving`,`mobile`,`business_phone`,`private_phone`,`email`,`employment_number`,`loginname`,`bonus_points`,`achievement_type`,`department_id`) VALUES (1,'Frank','Musterfrank',NULL,'Manager',NULL,'1988-08-08',0,'2016-12-01',NULL,'+491728997343',NULL,NULL,'frank.csehan@soprasteria.com','0002020','fcsehan',NULL,0,5);
INSERT INTO `bapp.consultant` (`id`,`first_name`,`surname`,`middle_name`,`job_title`,`title`,`birthdate`,`gender`,`date_of_joining`,`date_of_leaving`,`mobile`,`business_phone`,`private_phone`,`email`,`employment_number`,`loginname`,`bonus_points`,`achievement_type`,`department_id`) VALUES (2,'Michael','Mustermichael',NULL,'Senior Consultant',NULL,'1988-08-08',0,'2014-05-01',NULL,NULL,NULL,NULL,'michael.daehnert@soprasteria.com','303030','mdaehnert',NULL,1,6);
INSERT INTO `bapp.consultant` (`id`,`first_name`,`surname`,`middle_name`,`job_title`,`title`,`birthdate`,`gender`,`date_of_joining`,`date_of_leaving`,`mobile`,`business_phone`,`private_phone`,`email`,`employment_number`,`loginname`,`bonus_points`,`achievement_type`,`department_id`) VALUES (3,'Daniela','Musterdaniela',NULL,'Senior Consultant',NULL,'1988-08-08',1,'2016-12-01',NULL,'+4915140627477',NULL,NULL,'daniela.woerle@soprasteria.com','909090','dwoerle',NULL,2,8);
/*
-- Query: SELECT * FROM bapp.news_item
LIMIT 0, 1000

-- Date: 2018-02-21 13:40
*/
INSERT INTO `bapp.news_item` (`id`,`news_subject`,`news_text`,`news_date`,`news_item_type`,`news_path_to_media`,`news_media_type`,`recipients_id`) VALUES (1,'CEO Video News Part # 1','password: SopraSteria!Strategie2022','2018-02-21',0,'https://vimeo.com/253123817',2,7);
INSERT INTO `bapp.news_item` (`id`,`news_subject`,`news_text`,`news_date`,`news_item_type`,`news_path_to_media`,`news_media_type`,`recipients_id`) VALUES (2,'CEO Video News Part # 2','Password: ceossc','2018-02-21',0,'https://vimeo.com/255401950',2,7);
INSERT INTO `bapp.news_item` (`id`,`news_subject`,`news_text`,`news_date`,`news_item_type`,`news_path_to_media`,`news_media_type`,`recipients_id`) VALUES (4,'BU FI Network News','<p><span style=\"font-size: 7.5pt; line-height: 115%; font-family: \'Segoe UI WestEuropean\'; color: #343a41;\">Liebe Kolleginnen, liebe Kollegen,<br /> <br /> ich m&ouml;chte euch heute und zuk&uuml;nftig einmal monatlich ein kurzes Business Update hier bei Yammer geben. <br /> <br /> Fangen wir gleich an mit den Financials, der vorl&auml;ufige Monatsabschluss f&uuml;r Januar unserer BU liegt vor. In Summe ein zufriedenstellender Monat. Zur Erl&auml;uterung vorweg: In einem rollierenden Prozess prognostizieren wir monatlich unseren Customer Sales (Umsatz) und unser REX (Betriebsergebnis, franz. R&eacute;sultat d\'Exploitation) auf Sicht der n&auml;chsten 3 Monate. Das nennen wir Forecast. Den Forecast f&uuml;r Januar, welchen wir also im Dezember prognostiziert hatten, haben wir im REX leicht &uuml;bertroffen und im Umsatz leicht unterschritten. Das h&auml;ngt u.a. damit zusammen, dass noch nicht alle Reisekosten aus dem Januar im Ergebnis ber&uuml;cksichtigt werden konnten. Nehmt also bitte mit: Die Reisekosten immer zeitnah (einmal w&ouml;chentlich) abrechnen und einreichen, damit erh&ouml;hen wir die Qualit&auml;t unseres Forecasts.<br /> <br /> Was mich beim Thema Kommunikation beeindruckt, ist der Traffic, den wir zwischenzeitlich auf unserer Yammer-Plattform erreicht haben. Ihr wisst, dass mir der Austausch und das Networking sehr am Herzen liegt, macht also bitte weiter so! F&uuml;r die externe Kommunikation und unser Branding, hatte ich Ende letzten Jahres die Entwicklung einer Pr&auml;sentation zu unserem Leistungsportfolio f&uuml;r die Sparkassen-Finanzgruppe angek&uuml;ndigt. Ihr d&uuml;rft gespannt sein, in den n&auml;chsten zwei Wochen gibt es hierzu ein Update f&uuml;r euch.<br /> <br /> Das Highlight des heutigen Tages ist unsere 100ste Mitarbeiterin, die wir in der BU begr&uuml;&szlig;en d&uuml;rfen. Herzlich Willkommen Kristin Rudolph. Ein paar Tage sp&auml;ter hat der 101ste Mitarbeiter seinen Vertrag unterschrieben: Igor Meller, auch dir ein ganz herzliches Willkommen! Und weil wir nicht nur neue Mitarbeiter, sondern auch viele Berater haben, die der Firma &uuml;ber lange Zeit treu geblieben sind, darf ich heute auch </span><a href=\"https://www.yammer.com/soprasteria.com/#/users/1542654048\"><span style=\"font-size: 7.5pt; line-height: 115%; font-family: \'Segoe UI WestEuropean\'; color: #386cbb; text-decoration: none; text-underline: none;\">BOBETH Maik</span></a><span style=\"font-size: 7.5pt; line-height: 115%; font-family: \'Segoe UI WestEuropean\'; color: #343a41;\"> zu seinem 20-j&auml;hrigen Jubil&auml;um gratulieren. Maik, vielen Dank f&uuml;r die gute Zusammenarbeit in all diesen Jahren!<br /> <br /> Was erwartet uns im Februar: Es gibt spannende Opportunities. Wir haben zahlreiche Einladungen zur Vorstellung von Angeboten und Beratern bei der Finanz Informatik, in einer Sparkasse, bei der Deutschen Leasing und den Landesbausparkassen. Kommende Woche ist ein privater Stammtisch in Hannover organisiert und Ende des Monats sehen wir uns alle beim </span><a href=\"https://www.yammer.com/soprasteria.com/topics/25806498\"><span style=\"font-size: 7.5pt; line-height: 115%; font-family: \'Segoe UI WestEuropean\'; color: #386cbb; text-decoration: none; text-underline: none;\">#bt2018</span></a><span style=\"font-size: 7.5pt; line-height: 115%; font-family: \'Segoe UI WestEuropean\'; color: #343a41;\"> in Hamburg. Ich freue mich darauf!<br /> <br /> Viele Gr&uuml;&szlig;e<br /> <br /> Tobi</span></p>','2018-02-21',4,NULL,0,8);
INSERT INTO `bapp.news_item` (`id`,`news_subject`,`news_text`,`news_date`,`news_item_type`,`news_path_to_media`,`news_media_type`,`recipients_id`) VALUES (5,'Organisation und Personalien','<p>Liebe Kolleginnen, liebe Kollegen,</p>\r\n<p>&nbsp;</p>\r\n<p>zu Eurer Information im Folgenden alle bedeutenden Weiterentwicklungen unserer organisatorischen Strukturen und einige Personalia zur Orientierung:</p>\r\n<p>&nbsp;</p>\r\n<p><strong><span style=\"font-size: 12.0pt;\">Die ersten Schritte auf dem Weg zu einer Europ&auml;ischen Gesellschaft (SE) sind erfolgt </span></strong></p>\r\n<p>Wir hatten Euch hierzu ja schon im Herbst informiert, dass wir in 2018 die Eintragung als Europ&auml;ische Gesellschaft (SE) beantragen werden. Mit dieser modernen Gesellschaftsform, die sich auf europ&auml;isches Recht gr&uuml;ndet, wird Sopra Steria Consulting der internationalen Ausrichtung des Konzerns und der F&ouml;rderung einer internationalen sowie offenen Unternehmenskultur und nicht zuletzt seinem eingeschlagenen Wachstumskurs besser gerecht. Seit November 2017 sind wir nun (als notwendigen Zwischenschritt) eine deutsche Aktiengesellschaft. Damit sind schon jetzt Akquisitionen einfacher geworden. Im n&auml;chsten notwendigen Schritt werden wir mit den Arbeitnehmervertretern einige Rahmenbedingungen festlegen, bevor die Eintragung erfolgen darf. Unser Wunsch sind z&uuml;gige Gespr&auml;che, um eine schnelle Umsetzung und damit die Konzentration auf wichtigere Themen zu gew&auml;hrleisten. Wie wiederholt festgestellt: F&uuml;r Euch als Mitarbeiterinnen und Mitarbeiter ergeben sich dadurch keinerlei Ver&auml;nderungen.</p>\r\n<p>&nbsp;</p>\r\n<p><strong><span style=\"font-size: 12.0pt;\">Die Sopra Steria Services GmbH wird zuk&uuml;nftig von Thomas Seidel als eigenst&auml;ndige Business Unit in der Division Banking gef&uuml;hrt </span></strong></p>\r\n<p>Im M&auml;rz 2017 haben wir die Sopra Steria Services GmbH, ein auf Compliance Services spezialisiertes Unternehmen als 100%ige Tochter der Sopra Steria AG gegr&uuml;ndet. Mit nunmehr 45 Kolleginnen und Kollegen sowie diversen Servicevertr&auml;gen mit Bankkunden ist das Unternehmen fulminant gestartet. Wir haben uns entschlossen, die Gesellschaft nun als eigenst&auml;ndige Business Unit ab dem 1. Januar 2018 in der Division Banking zu f&uuml;hren. Bislang war die Gesellschaft ein Teil der Business Unit Deutsche Bank. Wir m&ouml;chten uns insbesondere bei Martin Stolberg f&uuml;r die Aufbauarbeit bedanken. Gleichzeitig w&uuml;nschen wir Thomas Seidel, der seit dem 1. Oktober 2017 bei uns an Bord ist und diesen Themenbereich vorher erfolgreich bei der Deutschen Bank geleitet hat, als neuen BU-Leiter viel Erfolg bei der weiteren Umsetzung der Wachstumspl&auml;ne f&uuml;r diese Business Unit.</p>\r\n<p>&nbsp;</p>\r\n<p><strong><span style=\"font-size: 12.0pt;\">Ronald de Jonge ist neuer Business Unit Director Public Business Consulting</span></strong></p>\r\n<p>Ron hat bereits zum 1. Oktober 2017 die Leitung der Business Unit &uuml;bernommen und das Team nun f&uuml;r die Zukunft neu aufgestellt. Wir freuen uns sehr, dass ein weiterer Kollege aus den eigenen Reihen die Leitung einer Business Unit &uuml;bernommen hat und sehen uns gerade hier in unserer Absicht best&auml;tigt, unser Unternehmen f&uuml;r Eure Karrierem&ouml;glichkeiten aufzustellen. Wir gratulieren Ron insbesondere auch zu seiner Ernennung zum Director, die er nach einer eindrucksvollen Pr&auml;sentation seines Business Cases zum 1. Januar 2018 erhalten hat.</p>\r\n<p>&nbsp;</p>\r\n<p><strong><span style=\"font-size: 12.0pt;\">Thommy Mewes leitet die Business Unit Energy</span></strong></p>\r\n<p>Thommy ist seit Mai 2016 bei uns und hat in den letzten Monaten Jens Liepertz in der Leitung Energy unterst&uuml;tzt. Im Dezember 2017 haben wir die weitere Strategie und Entwicklung der Business Unit Energy diskutiert und die Leitung an Thommy &uuml;bertragen. Wir w&uuml;nschen ihm und der Business Unit viel Erfolg beim weiteren Aufbau.</p>\r\n<p><strong>&nbsp;</strong></p>\r\n<p><strong><span style=\"font-size: 12.0pt;\">Jens Liepertz ist stellvertretender Leiter der Division Industries</span></strong></p>\r\n<p>Der bisherige Stellvertreter des Leiters der Division Industries, Herv&eacute; Forestier, hat zus&auml;tzlich zur Leitung der Business Unit Aeroline in den letzten Monaten weitere Aufgaben in Frankreich &uuml;bernommen. F&uuml;r die wichtige Rolle als Stellvertreter von Kai Staffeldt in der Division-Leitung konnten wir ab dem 1. Januar 2018 Jens Liepertz gewinnen.</p>\r\n<p><strong>&nbsp;</strong></p>\r\n<p><strong><span style=\"font-size: 12.0pt;\">Torsten S&auml;mann &uuml;bernimmt die Leitung der neuen Community Application Management und Cloud</span></strong></p>\r\n<p>Die Communities Application Management und Cloud werden unter der Leitung von Torsten S&auml;mann zusammengefasst. Hierdurch tragen wir der engen inhaltlichen Verzahnung der beiden Themen Rechnung und st&auml;rken unsere Management Priorit&auml;t Application Management. Wir w&uuml;nschen Torsten viel Erfolg bei dieser neuen Aufgabe.</p>\r\n<p>&nbsp;</p>\r\n<p><strong><span style=\"font-size: 12.0pt;\">Marco Wagner ist neuer Leiter Finance</span></strong></p>\r\n<p>Wir freuen uns sehr, als neuen Leiter Finance Marco Wagner zu begr&uuml;&szlig;en. Er &uuml;bernimmt ab dem 1. Januar 2018 die F&uuml;hrung des Finance Teams von Joel Fournier, der in der Aktivphase seiner Altersteilzeit ist und in den n&auml;chsten Jahren f&uuml;r die wichtigen Themen rund um unser Wachstum zur Verf&uuml;gung steht. Marco kommt von KPMG, ist Wirtschaftspr&uuml;fer und wird uns in dieser wichtigen internen Funktion verst&auml;rken.</p>\r\n<p>&nbsp;</p>\r\n<p><strong><span style=\"font-size: 12.0pt;\">Associate Consultant / Associate Manager / Associate Director</span></strong></p>\r\n<p>Wir haben uns aus Markt- und Wettbewerbsgr&uuml;nden dazu entschlossen, ab dem 1. Januar 2018 unseren Einstiegslevel umzubenennen und auf zwei weiteren Karrierelevels f&uuml;r wenige ausgew&auml;hlte Kolleginnen und Kollegen einen zus&auml;tzlichen Positionstitel einzuf&uuml;hren.</p>\r\n<p>&nbsp;</p>\r\n<p>Der Associate Consultant ersetzt als Titel den bisherigen Junior Consultant. Eintritte auf diesem Level sind in der Regel Graduates mit wenig Berufserfahrung. Der Begriff Junior Consultant ist im Markt kaum mehr vertreten, die Bezeichnungen f&uuml;r diesen Einstiegslevel hingegen vielf&auml;ltig. Wir verstehen diesen Level f&uuml;r junge Kolleginnen und Kollegen auf dem Weg zum Consultant &ndash; also Associate Consultants. Dieser neue Level-Name gilt ab sofort f&uuml;r alle bisherigen und zuk&uuml;nftigen Junior Consultants.</p>\r\n<p>&nbsp;</p>\r\n<p>Der Associate Manager ist ein sogenannter Positionstitel auf dem Level Senior Consultant. Wir vergeben ihn ab sofort an Kolleginnen und Kollegen, deren Bef&ouml;rderung zum Manager in den n&auml;chsten beiden Jahren angedacht ist. Die Erwartung an diesen Positionstitel ist eine Leistung, die den Manager-KPIs hinsichtlich Sales zu etwa zwei Dritteln entspricht. So wird der Manager Business Case vorbereitet. Der Associate Manager ist kein eigener Level, eine Promotion zum Manager kann auch ohne diesen Zwischenschritt erfolgen.</p>\r\n<p>&nbsp;</p>\r\n<p>Der Associate Director ist ein Positionstitel auf dem Level Senior Manager. Auch hier sind Kolleginnen und Kollegen gemeint, die schon heute am oberen Rand des Senior Manager Levels stehen, eine Vorbildfunktion in der Business Unit einnehmen und durch ihre beruflichen Erfahrungen und Leistungen &uuml;berzeugen. Der n&auml;chste Karriereschritt kann die Bef&ouml;rderung zum Director sein, die aber im Regelfall der Leitung einer Business Unit oder einer sehr gro&szlig;en und bedeutsamen F&uuml;hrungsfunktion vorbehalten ist.</p>\r\n<p>&nbsp;</p>\r\n<p><strong><span style=\"font-size: 12.0pt;\">Unsere Bef&ouml;rderungen zum 1. Januar 2018</span></strong></p>\r\n<p>In Face2Face findet Ihr <a href=\"http://portal.corp.sopra/hr/HR_DE_ST/Home/Pages/Befoerderungen.aspx\">die Bef&ouml;rderungen zum 1. Januar 2018</a>. Wie &uuml;blich sind dies im wesentlichen Bef&ouml;rderungen zum Consultant und Senior Consultant, nur in wenigen Ausnahmen Bef&ouml;rderungen auf F&uuml;hrungslevels (diese erfolgen &uuml;blicherweise zum 1. Juli eines Jahres).</p>\r\n<p>&nbsp;</p>\r\n<p>Wir w&uuml;nschen allen bef&ouml;rderten Kolleginnen und Kollegen sowie nat&uuml;rlich auch den oben genannten F&uuml;hrungskr&auml;ften viel Erfolg und freuen uns darauf, mit Euch die positive Entwicklung von Sopra Steria Consulting in 2018 weiter fortzuf&uuml;hren.</p>\r\n<p>&nbsp;</p>\r\n<p>Beste Gr&uuml;&szlig;e</p>\r\n<p>Urs M. Kr&auml;mer | Michael Donat</p>\r\n<p>&nbsp;</p>','2018-02-21',0,NULL,0,7);
INSERT INTO `bapp.news_item` (`id`,`news_subject`,`news_text`,`news_date`,`news_item_type`,`news_path_to_media`,`news_media_type`,`recipients_id`) VALUES (6,'++++ CEO Newsticker ++++','<p><span style=\"color: black;\">Liebe Kolleginnen, liebe Kollegen,</span></p>\r\n<p><span style=\"color: black;\">&nbsp;</span></p>\r\n<p><span style=\"color: black;\">kundenseitig l&auml;uft das junge Jahr f&uuml;r uns schon l&auml;ngst wieder auf Hochtouren &ndash; vier beeindruckende Winning Postcards in den ersten drei Wochen sprechen f&uuml;r sich. Im Februar schalten wir nun auch wieder in den Event-Modus. Drei wichtige Messen stehen im n&auml;chsten Monat an. Mehr dazu im heutigen Newsticker. Ich w&uuml;nsche Euch einen guten Start in die Woche!</span></p>\r\n<p><span style=\"color: black;\">&nbsp;</span></p>\r\n<p><span style=\"color: black;\">Viele Gr&uuml;&szlig;e</span></p>\r\n<p><span style=\"color: black;\">Urs</span></p>\r\n<p><span style=\"color: black;\">&nbsp;</span></p>\r\n<p><span style=\"color: black;\">+++</span></p>\r\n<p><strong><span style=\"color: black;\">Vorbereitungen f&uuml;r den Eventmonat Februar</span></strong></p>\r\n<p><span style=\"color: black;\">Vom 6. bis 8. Februar &ouml;ffnet die <strong><a href=\"https://www.e-world-essen.com/de/aktuelles/\">E-world energy &amp; water 2018</a> </strong>in Essen ihre Tore. Die Messe ist mit &uuml;ber 20.000 Fachbesuchern und dem begleitenden Fachkongress der bedeutendste Impulsgeber f&uuml;r die gesamte Energie- und Wasserwirtschaft Europas. Sopra Steria Consulting ist auch dieses Jahr wieder mit einem repr&auml;sentativen Stand dabei. Wir zeigen unsere L&ouml;sungen und Business Suites f&uuml;r Strom- und Gasm&auml;rkte, mit denen unsere Kunden bspw. Abrechnungs- und Vertriebsprozesse automatisieren und Systeme f&uuml;r den Kundenservice effizienter gestalten k&ouml;nnen. Wir werden in den drei Messetagen sicher wieder &uuml;ber 100 Kundengespr&auml;che f&uuml;hren und uns als der Management- und Technologieberater der Wahl pr&auml;sentieren, der seinen Kunden hilft, mit den richtigen Ideen die Aufgaben der Digitalisierung und der Energiewende zu l&ouml;sen.</span></p>\r\n<p><span style=\"color: black;\">Zeitgleich, vom 6. bis 7. Februar, findet der <strong><a href=\"http://www.europaeischer-polizeikongress.de/\">21. Europ&auml;ische Polizeikongress</a></strong> in Berlin statt. Auf Europas f&uuml;hrender Kongressmesse f&uuml;r Innere Sicherheit treffen sich rund 1.500 Teilnehmer aus dem In- und Ausland. Vertreter der Kriminal- und Schutzpolizeien, der Grenzpolizeien, der Sicherheits- und Nachrichtendienste sowie der Regierungen und Parlamente diskutieren &uuml;ber neueste Technologien f&uuml;r den Polizeieinsatz und tauschen gegenseitig Informationen aus. Im Mittelpunkt unseres Messeauftritts stehen IGNIS-Plus, das Einsatzleitsystem f&uuml;r die kooperative Leitstelle sowie mobile Fahndungsabfragen samt Fast-ID. </span></p>\r\n<p><span style=\"color: black;\">Vom 20. bis 21. Februar sind wir schlie&szlig;lich beim diesj&auml;hrigen <strong><a href=\"http://www.germancrmforum.de/home.html\">German CRM Forum</a> </strong>vertreten<strong>.</strong> Unter dem Motto &bdquo;Make Your Customers Smile!&ldquo; erwarten die Besucher zahlreiche Keynotes und &nbsp;Vortr&auml;ge. Die Themen reichen dabei von Emotionalisierung &amp; Digitalisierung &uuml;ber Customer Experience &amp; Service Design, Datenqualit&auml;t &amp; Datenschutz bis hin zu Transformation &amp; Integration. Auch wir gestalten das Programm &ndash; u.a. mit einem interaktiven Design Thinking Workshop &bdquo;Innovation in der Kundenansprache&ldquo;.</span></p>\r\n<p><span style=\"color: black;\">Der Februar bietet uns also eine breite Kontaktfl&auml;che f&uuml;r die Markenpositionierung und Kundenansprache. Wir freuen uns darauf!</span></p>\r\n<p><span style=\"color: black;\">Kontakt: <a href=\"mailto:bettina.dinslage@soprasteria.com\">bettina.dinslage@soprasteria.com</a></span></p>\r\n<p>&nbsp;</p>','2018-02-21',0,NULL,0,7);

/*
-- Query: SELECT * FROM bapp.news_notification
LIMIT 0, 1000

-- Date: 2018-02-21 13:43
*/
INSERT INTO `bapp.news_notification` (`id`,`news_item_seen`,`date_sent`,`date_seen`,`consultant_id`,`news_item_id`) VALUES (1,1,'2018-02-12','2018-02-21',1,1);
INSERT INTO `bapp.news_notification` (`id`,`news_item_seen`,`date_sent`,`date_seen`,`consultant_id`,`news_item_id`) VALUES (2,0,NULL,NULL,1,2);
INSERT INTO `bapp.news_notification` (`id`,`news_item_seen`,`date_sent`,`date_seen`,`consultant_id`,`news_item_id`) VALUES (3,1,'2018-02-05',NULL,1,5);
INSERT INTO `bapp.news_notification` (`id`,`news_item_seen`,`date_sent`,`date_seen`,`consultant_id`,`news_item_id`) VALUES (4,1,'2018-02-21',NULL,1,6);
INSERT INTO `bapp.news_notification` (`id`,`news_item_seen`,`date_sent`,`date_seen`,`consultant_id`,`news_item_id`) VALUES (5,0,'2018-02-06',NULL,2,1);
INSERT INTO `bapp.news_notification` (`id`,`news_item_seen`,`date_sent`,`date_seen`,`consultant_id`,`news_item_id`) VALUES (6,0,NULL,NULL,2,2);
INSERT INTO `bapp.news_notification` (`id`,`news_item_seen`,`date_sent`,`date_seen`,`consultant_id`,`news_item_id`) VALUES (7,0,'2018-02-21',NULL,2,5);
INSERT INTO `bapp.news_notification` (`id`,`news_item_seen`,`date_sent`,`date_seen`,`consultant_id`,`news_item_id`) VALUES (8,1,'2018-02-04',NULL,3,4);
INSERT INTO `bapp.news_notification` (`id`,`news_item_seen`,`date_sent`,`date_seen`,`consultant_id`,`news_item_id`) VALUES (9,1,'2018-02-12',NULL,3,6);

/*
-- Query: SELECT * FROM bapp.app_configuration
LIMIT 0, 1000

-- Date: 2018-02-21 13:41
*/
INSERT INTO `bapp.app_configuration` (`id`,`app_short_name`,`app_name`) VALUES (1,'SPJ','Sopra Steria Projects');
INSERT INTO `bapp.app_configuration` (`id`,`app_short_name`,`app_name`) VALUES (2,'DNA','Consultant DNA');
INSERT INTO `bapp.app_configuration` (`id`,`app_short_name`,`app_name`) VALUES (3,'TOOL','Consultant Tools');
INSERT INTO `bapp.app_configuration` (`id`,`app_short_name`,`app_name`) VALUES (4,'NEWS','Consultant News');
INSERT INTO `bapp.app_configuration` (`id`,`app_short_name`,`app_name`) VALUES (5,'F2F','FaceToFace Integration');


/*
-- Query: SELECT * FROM bapp.app_config_item
LIMIT 0, 1000

-- Date: 2018-02-21 13:42
*/
INSERT INTO `bapp.app_config_item` (`id`,`sort_number`,`date_valid_from`,`date_valid_to`,`path_to_icon`,`display_name`,`link_to_android`,`link_to_ios`,`app_configuration_id`) VALUES (1,10,'2018-02-21',NULL,'.','Hotel','https://play.google.com/store/apps/details?id=com.hrs.android&hl=de','https://itunes.apple.com/de/app/hrs-hotel-suche-top-hotels/id332193586?mt=8',3);
INSERT INTO `bapp.app_config_item` (`id`,`sort_number`,`date_valid_from`,`date_valid_to`,`path_to_icon`,`display_name`,`link_to_android`,`link_to_ios`,`app_configuration_id`) VALUES (2,20,'2018-02-21',NULL,'.','Travel Booking','https://www.egencia.com/public/de/','https://www.egencia.com/public/de/',3);
INSERT INTO `bapp.app_config_item` (`id`,`sort_number`,`date_valid_from`,`date_valid_to`,`path_to_icon`,`display_name`,`link_to_android`,`link_to_ios`,`app_configuration_id`) VALUES (3,30,'2018-02-21',NULL,'.','Traveltime Calculator','https://parici.sopra.com/dana/home/userpass.cgi?url=%2F%2CDanaInfo%','https://parici.sopra.com/dana/home/userpass.cgi?url=%2F%2CDanaInfo%',3);
INSERT INTO `bapp.app_config_item` (`id`,`sort_number`,`date_valid_from`,`date_valid_to`,`path_to_icon`,`display_name`,`link_to_android`,`link_to_ios`,`app_configuration_id`) VALUES (4,40,'2018-02-21',NULL,'.','Choose the place you need','https://choosetheplaceyouneed.soprasteria.de/app/modLogin/login.php','https://choosetheplaceyouneed.soprasteria.de/app/modLogin/login.php',3);
INSERT INTO `bapp.app_config_item` (`id`,`sort_number`,`date_valid_from`,`date_valid_to`,`path_to_icon`,`display_name`,`link_to_android`,`link_to_ios`,`app_configuration_id`) VALUES (5,50,'2018-02-21',NULL,'.','Taxi','https://play.google.com/store/apps/details?id=taxi.android.client&hl=de','https://itunes.apple.com/de/app/mytaxi-die-taxi-app/id357852748?mt=8',3);
INSERT INTO `bapp.app_config_item` (`id`,`sort_number`,`date_valid_from`,`date_valid_to`,`path_to_icon`,`display_name`,`link_to_android`,`link_to_ios`,`app_configuration_id`) VALUES (6,60,'2018-02-21',NULL,'.','Bahn','https://play.google.com/store/apps/details?id=de.hafas.android.db&hl=de','https://itunes.apple.com/de/app/db-navigator/id343555245?mt=8',3);
INSERT INTO `bapp.app_config_item` (`id`,`sort_number`,`date_valid_from`,`date_valid_to`,`path_to_icon`,`display_name`,`link_to_android`,`link_to_ios`,`app_configuration_id`) VALUES (7,70,'2018-02-21',NULL,'.','Expenses','https://play.google.com/store/apps/details?id=com.concur.breeze&hl=de','https://itunes.apple.com/us/app/sap-concur/id335023774?mt=8',3);
INSERT INTO `bapp.app_config_item` (`id`,`sort_number`,`date_valid_from`,`date_valid_to`,`path_to_icon`,`display_name`,`link_to_android`,`link_to_ios`,`app_configuration_id`) VALUES (8,90,'2018-02-21',NULL,'.','Car','https://play.google.com/store/apps/details?id=com.sixt.reservation&hl=de','https://itunes.apple.com/de/app/sixt-autovermietung/id295079411?mt=8',3);


/*
-- Query: SELECT * FROM bapp.question
LIMIT 0, 1000

-- Date: 2018-02-21 13:39
*/
INSERT INTO `bapp.question` (`id`,`question_name`,`question_text`,`date_asked`,`date_closed`,`consultant_id`) VALUES (1,'Kleiderordnung','Mein Kunde verlangt von mir, dass ich mit Jeans und T-Shirt zu ihm komme. \r\nIch finde nicht, dass das der Berater-DNA entspricht, will aber den Kunden nicht verärgern. \r\nWas kann ich tun?','2018-02-21',NULL,1);
INSERT INTO `bapp.question` (`id`,`question_name`,`question_text`,`date_asked`,`date_closed`,`consultant_id`) VALUES (2,'Umgang miteinander','Ich habe ein Dokument von unserem BU-Manager bekommen, das ich per Mail angefragt hatte. \r\nSoll ich ihm mit „danke“ antworten oder lieber nicht. \r\nEr bekommt sicherlich sehr viele Mails am Tag.','2018-02-21',NULL,2);
INSERT INTO `bapp.question` (`id`,`question_name`,`question_text`,`date_asked`,`date_closed`,`consultant_id`) VALUES (3,'Verhalten gegenüber Kunden','Mein Kunde hat mich zu einem offside eingeladen, das er im Rahmen einer Personalentwicklungsmaßnahme durchführt.\r\n\r\nIch sehe mich als Berater und nicht Teil des Kunden. Dennoch möchte ich meine Vertrauensbasis, die ich mit dem Kunden aufgebaut habe, nicht gefährden. \r\n\r\nWie ist eurer Rat?','2018-02-21',NULL,3);

