CREATE TABLE testdb.PRODUIT_IMMOBILIER (
    ID BIGINT NOT NULL AUTO_INCREMENT,
    TYPE1 VARCHAR(25),
    TELEPHONE VARCHAR(15),
    DESCRIPTION VARCHAR(2000),
    NOMBRE_LOTS INTEGER,
    PARKING BIT(1),
    ASCENCEUR BIT(1),
    GARDIEN BIT(1),
    CHEMINEE BIT(1),
    INTERPHONE BIT(1),
    DIGICODE BIT(1),
    ORIENTATION VARCHAR(2),
    DPE CHAR(1),
    ETAGE INTEGER,
    NOMBRE_PIECE INTEGER,
    NOMBRE_CHAMBRE INTEGER,
    SALLE_BAIN INTEGER,
    SALLE_DOUCHE INTEGER,
    TOILETTE_SEPARE INTEGER,
    TOILETTE_NON_SEPARE INTEGER,
    CHARGES_COPROP DOUBLE,
    TAXES_FONCIAIRES DOUBLE,
    ANNEE_CONSTRUCTION DATE,
    DATE_MISE_EN_LIGNE DATE,
    ADRESSE VARCHAR(100),
    CODE_POSTAL CHAR(5),
    VILLE VARCHAR(25),
    ZONE1 VARCHAR(5), 
    PRIX DOUBLE,
    SURFACE DOUBLE,
    SURFACE_BALCON DOUBLE,
    SURFACE_TERRASSE DOUBLE,
    SURFACE_VERANDAS DOUBLE,
    SURFACE_SOUS_SOL DOUBLE,
    SURFACE_CAVE DOUBLE,
    SURFACE_LOGIAS DOUBLE,
    AUTRE_SURFACE_ANNEXE DOUBLE,
    LOYERMAXIMUM DOUBLE,
    REDUCTIONIMPOTS6ANS DOUBLE,
    REDUCTIONIMPOTS9ANS DOUBLE,
    REDUCTIONIMPOTS12ANS DOUBLE,
	PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB3;; 

CREATE TABLE testdb.USER (
    USER_ID BIGINT NOT NULL AUTO_INCREMENT,
    GENDER CHAR(1) NOT NULL,
    LASTNAME VARCHAR(20) NOT NULL,
    FIRSTNAME VARCHAR(20) NOT NULL,
    EMAIL VARCHAR(20) NOT NULL,
    PASSWORD VARCHAR(20) NOT NULL,
    MOBILE_TELEPHONE VARCHAR(15),
    FIXED_TELEPHONE VARCHAR(15),
    ADRESS VARCHAR(100),
    POSTAL_CODE CHAR(5),
    TOWN VARCHAR(25),
    PROFESSION VARCHAR(25),
    PROFILE VARCHAR(25),
    MARITAL_SITUATION VARCHAR(25),
    CHILDREN_NUMBER INTEGER,
    DEPENDANT INTEGER,
    ACCOMODATION VARCHAR(10),
    MONTHLY_NET_SALARY INTEGER,
    RENT_AMOUNT INTEGER,
    BANK_LOAN BIT(1),
    CAPITAL_CONTRIBUTION INTEGER,
    CREDIT_AMOUNT INTEGER,
    MONTHLY_PAYMENT INTEGER,
    CREDIT_TERMINATION_DATE DATE,
	SIRET_NUMBER VARCHAR(10),
	PRIMARY KEY (`USER_ID`),
	CONSTRAINT uc_email UNIQUE (EMAIL)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB3;

ALTER TABLE testdb.USER ADD UNIQUE (EMAIL)

ALTER TABLE Persons
ADD UNIQUE (P_Id)

CREATE TABLE testdb.USER_PRODUIT_IMMOBILIER (
  `USER_ID` BIGINT NOT NULL,
  `PRODUIT_IMMOBILIER_ID` BIGINT NOT NULL,
  PRIMARY KEY (`USER_ID`,`PRODUIT_IMMOBILIER_ID`),
  KEY `USER_ID` (`USER_ID`),
  CONSTRAINT `user_produit_immobilier_ibfk_1` 
   FOREIGN KEY (`USER_ID`) REFERENCES `USER` (`USER_ID`),
  CONSTRAINT `user_produit_immobilier_ibfk_2` 
   FOREIGN KEY (`PRODUIT_IMMOBILIER_ID`) REFERENCES `PRODUIT_IMMOBILIER` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB3;

ALTER TABLE testdb.PRODUIT_IMMOBILIER ADD PRIMARY KEY(ID);

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1,         TELEPHONE,            DESCRIPTION,                                                                                                                                        NOMBRE_LOTS, PARKING, ASCENCEUR, GARDIEN, CHEMINEE, INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE,  NOMBRE_PIECE, NOMBRE_CHAMBRE, SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,  DATE_MISE_EN_LIGNE,                ADRESSE,     CODE_POSTAL, VILLE , ZONE1, PRIX, SURFACE, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_SOUS_SOL, SURFACE_CAVE, SURFACE_LOGIAS, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, REDUCTIONIMPOTS6ANS, REDUCTIONIMPOTS9ANS, REDUCTIONIMPOTS12ANS)
VALUES                                (1, 'Appartement', '0102030405',  'C’est idéalement situé au 27 quai de Grenelle que Flatlooker vous propose aujourd’hui ce trois pièces d’exception au 5ème étage'                            ,  1,         0,        1  ,         1,       0,        1,          0,          'S',  'A'   , 5,        4,              2,             1          ,   1,            1,                0,                  100      ,    101    ,        '2008-7-04',       '2019-10-15',          '27 quai de Grenelle',   '75015'  , 'Paris','A',  102,    103 ,    104,              105,             106,              107,              108,           109,             110,                1000,             30,                20,                 10            );  

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1,         TELEPHONE,   DESCRIPTION,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          NOMBRE_LOTS, PARKING, ASCENCEUR,GARDIEN, CHEMINEE, INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_PIECE,NOMBRE_CHAMBRE,SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,    DATE_MISE_EN_LIGNE,            ADRESSE,          CODE_POSTAL, VILLE, ZONE1, PRIX, SURFACE, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_SOUS_SOL, SURFACE_CAVE, SURFACE_LOGIAS, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, REDUCTIONIMPOTS6ANS, REDUCTIONIMPOTS9ANS, REDUCTIONIMPOTS12ANS)
VALUES                                (2, 'Appartement', '0202030405',  'Proprioo, l’agence nouvelle génération, vous propose à la vente cet appartement de 2 pièces de 43 m² localisé Rue de l’Abbé Groult, Paris 15ème. Ce bien se situe au 4ème étage avec ascenseur d’un immeuble des années 1960. Il se compose d’une grand pièce à vivre avec séjour, salle à manger et cuisine US, une chambre / coin nuit, et une salle de bain avec WC. Ce T2 dispose également d’un balcon. Les caractéristiques du bien: Simple vitrage. Orientation: Sud / Ouest. 1 cave. Charges de copropriété: 150 € par mois L’appartement est situé dans un quartier vivant, en plein coeur du 15ème, à 3 min à pieds du métro Convention. Ce bien est commercialisé par Proprioo.',             2,         1,      0  ,       0,        0,        0,          1,       'E',      'B',     6 ,    5  ,             3,          1,            2,            1,               1,                   200      ,    201    ,           '2008-7-05',  '2019-10-16',             '2 Rue de l’Abbé Groult',   '75015',   'Paris', 'Abis',202,    203 ,    204,              205,             206,              207,              208,           209,           210,                900,             25,                15,                 7          ); 

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE,   DESCRIPTION,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   NOMBRE_LOTS, PARKING, ASCENCEUR, GARDIEN,   CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_PIECE,NOMBRE_CHAMBRE,SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,   DATE_MISE_EN_LIGNE,            ADRESSE,           CODE_POSTAL, VILLE,  ZONE1,  PRIX, SURFACE, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_SOUS_SOL, SURFACE_CAVE, SURFACE_LOGIAS, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, REDUCTIONIMPOTS6ANS, REDUCTIONIMPOTS9ANS, REDUCTIONIMPOTS12ANS)
VALUES                                (3, 'Maison', '0302030405',   'IAD France - Thierry CARTIGNY vous propose: Superbe appartement situé au 2 étage d’une belle copropriété de 5 lots, séjour, salon, coin cuisine, chambre, salle de bain, le tout sur 40 m² environ (loi carrez), surface au sol 101 m² environ, 2 places de parking. La présente annonce immobilière vise 1 lot principal situé dans une copropriété formant 5 lots au total ne faisant l’objet d’aucune procédure en cours et d’un montant de charges d’environ 50 euros par mois (soit 600 euros annuel) déclaré par le vendeur.Honoraires d’agence à la charge du vendeur. Information d’affichage énergétique sur ce bien: DPE VI indice 0 et GES VI indice 0. La présente annonce immobilière a été rédigée sous la responsabilité éditoriale de M. Thierry CARTIGNY (ID 34376), Agent Commercial mandataire en immobilier immatriculé au Registre Spécial des Agents Commerciaux (RSAC) du Tribunal de Commerce de Valenciennes sous le numéro 844424465.'                             ,3,         0,      1  ,        0,         1,           1,         0,         '',        'C',   2       , 6,               3,        2,            1,             2,                 1,                300      ,    301    ,       '2008-7-06',   '2019-10-17',       '1 rue du Maréchal Joffre.',    '59530', 'Le Quesnoy', 'B',   302,    303 ,    304,              305,             306,              307,              308,           309,             310,                800,             27,                17,                 9          );

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE, DESCRIPTION,                                                                                                                                                                  NOMBRE_LOTS, PARKING, ASCENCEUR, GARDIEN , CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_PIECE,NOMBRE_CHAMBRE,SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,     DATE_MISE_EN_LIGNE,                ADRESSE,       CODE_POSTAL, VILLE  ,  ZONE1, PRIX, SURFACE, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_SOUS_SOL, SURFACE_CAVE, SURFACE_LOGIAS, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, REDUCTIONIMPOTS6ANS, REDUCTIONIMPOTS9ANS, REDUCTIONIMPOTS12ANS)
VALUES                                (4, 'Appartement', '0402030405', 'Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cr' ,                                                            4,             1,      0  ,       0,       0,           1,         0,         'O',      'D',   5   ,  4,                 2,          1,           1,             1,                1,                 400      ,    401    ,           '2008-7-07',   '2019-10-18',      '84, Boulevard Maxime Gorki',       '94800', 'Villejuif', 'B1',  402,    403 ,    404,              405,             406,              407,              408,           409,             410,                700,             22,                13,                 7          );

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE,      DESCRIPTION                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ,  NOMBRE_LOTS, PARKING, ASCENCEUR,GARDIEN,  CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_PIECE, NOMBRE_CHAMBRE,SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,   DATE_MISE_EN_LIGNE,   ADRESSE,               CODE_POSTAL, VILLE, ZONE1,   PRIX, SURFACE, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_SOUS_SOL, SURFACE_CAVE, SURFACE_LOGIAS, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, REDUCTIONIMPOTS6ANS, REDUCTIONIMPOTS9ANS, REDUCTIONIMPOTS12ANS)
VALUES                                (5, 'Maison', '0502030405', 'EN EXCLUSIVITÉ à ORSINVAL (59530): Vous souhaitez faire un placement dans un secteur très prisé du Valenciennois, acquérir un bien valorisant votre patrimoine, dans une résidence de standing sécurisée ? Ce type 2 en rez-de-jardin est idéal, avec une place parking privative sans oublier 40 m² de jardin clos sans vis à vis. Un locataire sérieux et fidèle vous garantit un loyer annuel de 4830 euros. 59000/59300/59990 Nombre de lots de la copropriété: 114, Montant moyen annuel de la quote-part de charges (budget prévisionnel): 624 euros soit 52 euros par mois. Les honoraires sont à la charge du vendeur. Réseau Immobilier CAPIFRANCE - Votre agent commercial Delphine VANACKER Plus d’informations sur le site de CAPIFRANCE'     ,5,              0,      1  ,     0,         1,          0   ,       1,        '',       'E'   ,1,         5,              3,          1,          1,             1,                0  ,                 500      ,    501    ,           '2008-7-08', '2019-10-19',      '17 rue du petit Neuilly', '59530' , 'ORSINVAL','B2',     502,    503 ,    504,              505,             506,              507,              508,           509,                 510,                800,             24,                16,                 8          );

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE, DESCRIPTION,                                                                                                                                                                  NOMBRE_LOTS, PARKING, ASCENCEUR, GARDIEN,CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_PIECE, NOMBRE_CHAMBRE, SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION, DATE_MISE_EN_LIGNE,            ADRESSE,          CODE_POSTAL, VILLE,  ZONE1, PRIX, SURFACE, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_SOUS_SOL, SURFACE_CAVE, SURFACE_LOGIAS, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, REDUCTIONIMPOTS6ANS, REDUCTIONIMPOTS9ANS, REDUCTIONIMPOTS12ANS)
VALUES                                (6, 'Maison', '0602030405', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cr',           6,          1,         0  ,     0,      0,           1,         0,       '',       'F'   ,2,         3,            1,             1,           0,             1,                0,                 600      ,    601    ,           '2008-7-09',      '2019-10-19' ,     '6, boulevard Dubreuil',     '91400',     'Orsay', 'C',   602,    603 ,    604,              605,             606,              607,              608,           609,             610,                750,             29,                18,                 9          ); 


INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1,         TELEPHONE,             DESCRIPTION,                                                  NOMBRE_LOTS, PARKING, ASCENCEUR, GARDIEN, CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_PIECE, NOMBRE_CHAMBRE, SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,     DATE_MISE_EN_LIGNE,             ADRESSE,         CODE_POSTAL, VILLE,   ZONE1, PRIX, SURFACE, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_SOUS_SOL, SURFACE_CAVE, SURFACE_LOGIAS, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, REDUCTIONIMPOTS6ANS, REDUCTIONIMPOTS9ANS, REDUCTIONIMPOTS12ANS)
VALUES                                (7, 'Appartement', '0702030405', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus',   7,           0,          1  ,    1,       0,          0,          1,        'N',     'G',   10,    4,            2,                1,            0,             0,                 1          ,   700      ,    701    ,           '2008-7-10',           '2019-10-20',       '20, rue du Docteur Pinel', '94800', 'Villejuif', 'A',   702,    703 ,    704,              705,             706,              707,              708,           709,             710,                650,             27,                16,                 9          );


INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE, DESCRIPTION,   NOMBRE_LOTS, PARKING, ASCENCEUR, GARDIEN, CHEMINEE, INTERPHONE, DIGICODE, ORIENTATION,DPE, ETAGE, NOMBRE_PIECE, NOMBRE_CHAMBRE, SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,  DATE_MISE_EN_LIGNE,        ADRESSE,        CODE_POSTAL, VILLE, ZONE1,  PRIX, SURFACE, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_SOUS_SOL, SURFACE_CAVE, SURFACE_LOGIAS, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, REDUCTIONIMPOTS6ANS, REDUCTIONIMPOTS9ANS, REDUCTIONIMPOTS12ANS)
VALUES                                (8, 'Maison', '0802030405',   '',       8,            1,      0  ,       0,        1,          0,         0,        '',     'H'   ,2,         3,            1,             1,           1,              1,                 0,                800      ,    801    ,           '2008-7-11',   '2019-10-21',               '7 rue du stade', '91400', 'Saclay', 'Abis',802,    803 ,    804,              805,             806,              807,              808,           809,             810,                650,             30,                20,                 10          );


INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE, DESCRIPTION,  NOMBRE_LOTS, PARKING, ASCENCEUR, GARDIEN,CHEMINEE, INTERPHONE, DIGICODE, ORIENTATION,DPE,ETAGE, NOMBRE_PIECE, NOMBRE_CHAMBRE, SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,  DATE_MISE_EN_LIGNE,          ADRESSE,     CODE_POSTAL, VILLE,    ZONE1, PRIX, SURFACE, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_SOUS_SOL, SURFACE_CAVE, SURFACE_LOGIAS, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, REDUCTIONIMPOTS6ANS, REDUCTIONIMPOTS9ANS, REDUCTIONIMPOTS12ANS)
VALUES                                (9, 'Appartement', '0902030405', '',        9,       0,        1  ,      1,      0,         1,          0,        'E',     'I',11   ,    4,              1,              1,         1,                 1,                1,                900      ,    901    ,           '2008-7-12',   '2019-10-22',       '102 Rue Jean Jaurès', '94800', 'Villejuif', 'B',   902,    903 ,    904,              905,             906,              907,              908,           909,             910,                500,             24,                14,                 7          ); 


INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE, DESCRIPTION,                                                                       NOMBRE_LOTS, PARKING, ASCENCEUR, GARDIEN,CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE,NOMBRE_PIECE,NOMBRE_CHAMBRE,SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,   DATE_MISE_EN_LIGNE,         ADRESSE,         CODE_POSTAL, VILLE,    ZONE1, PRIX, SURFACE, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_SOUS_SOL, SURFACE_CAVE, SURFACE_LOGIAS, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, REDUCTIONIMPOTS6ANS, REDUCTIONIMPOTS9ANS, REDUCTIONIMPOTS12ANS)
VALUES                               (10, 'Appartement', '1002030405',  'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus',  10,         1,         0  ,     0,       0,           0,         1,        'S',     'J',3   ,  5,                 3,           1,            0,               0,                  1,               1000      ,    1001    ,         '2008-7-13',    '2019-10-23',      '38 Rue Georges Lebigot', '94800', 'Villejuif', 'B1',  1002,  1003 ,   1004,              1005,           1006,              1007,            1008,          1009,             1010,              700,            28,                     17,               9         );
