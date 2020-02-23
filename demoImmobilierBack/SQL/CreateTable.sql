CREATE TABLE testdb.DBFile (
	ID BIGINT NOT NULL AUTO_INCREMENT,
	FILENAME VARCHAR(50),
	FILETYPE VARCHAR(50),
	CONTENU_LOB LONGBLOB,
	PRODUIT_IMMOBILIER_ID BIGINT,
	PRIMARY KEY (ID),
	FOREIGN KEY (PRODUIT_IMMOBILIER_ID) REFERENCES PRODUIT_IMMOBILIER(ID)
)









CREATE TABLE testdb.DOSSIER_SIMULATION (
	ID BIGINT NOT NULL AUTO_INCREMENT,
	LOYER_MAXIMUM_6 DOUBLE,
	REDUCTION_IMPOTS_6 DOUBLE,
	MONTANT_EMPRUNT_6 DOUBLE,
	ECONOMY_IMPOTS_6 DOUBLE,
	MENSUALITE_CREDIT_6 DOUBLE,
	FRAIS_ANNEXE_6 DOUBLE,
	EFFORT_EPARGNE_6 DOUBLE,
	LOYER_MAXIMUM_9 DOUBLE,
	REDUCTION_IMPOTS_9 DOUBLE,
	MONTANT_EMPRUNT_9 DOUBLE,
	ECONOMY_IMPOTS_9 DOUBLE,
	MENSUALITE_CREDIT_9 DOUBLE,
	FRAIS_ANNEXE_9 DOUBLE,
	EFFORT_EPARGNE_9 DOUBLE,
	LOYER_MAXIMUM_12 DOUBLE,
	REDUCTION_IMPOTS_12 DOUBLE,
	MONTANT_EMPRUNT_12 DOUBLE,
	ECONOMY_IMPOTS_12 DOUBLE,
	MENSUALITE_CREDIT_12 DOUBLE,
	FRAIS_ANNEXE_12 DOUBLE,
	EFFORT_EPARGNE_12 DOUBLE,
	LOYER_ANNUEL_R DOUBLE,
	AMMORTISSEMENT_IMMOBILIER_R DOUBLE,
	AMMORTISSEMENT_MOBILIER_R DOUBLE,
	INTERET_EMPRUNT_R DOUBLE,
	AUTRES_CHARGES_R DOUBLE,
	ABBATEMENT_R DOUBLE,
	IMPOTS_R DOUBLE,
	TOTAL_CHARGES_R DOUBLE,
	TOTAL_IMPOTS_R DOUBLE,
	RESULTAT_R DOUBLE,
	EFFORT_R DOUBLE,
	LOYER_ANNUEL_M DOUBLE,
	AMMORTISSEMENT_IMMOBILIER_M DOUBLE,
	AMMORTISSEMENT_MOBILIER_M DOUBLE,
	INTERET_EMPRUNT_M DOUBLE,
	AUTRES_CHARGES_M DOUBLE,
	ABBATEMENT_M DOUBLE,
	IMPOTS_M DOUBLE,
	TOTAL_CHARGES_M DOUBLE,
	TOTAL_IMPOTS_M DOUBLE,
	RESULTAT_M DOUBLE,
	EFFORT_M DOUBLE,
	MONTANT_LOYER DOUBLE,
	MONTANT_TVA_IMMOBILIER DOUBLE,
	MONTANT_RECUPERE DOUBLE,
	COUT_FINAL_INVESTISSEMENT DOUBLE,
	PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO testdb.DOSSIER_SIMULATION (ID, LOYER_MAXIMUM_6, REDUCTION_IMPOTS_6, MONTANT_EMPRUNT_6, ECONOMY_IMPOTS_6, MENSUALITE_CREDIT_6, FRAIS_ANNEXE_6, EFFORT_EPARGNE_6, LOYER_MAXIMUM_9, REDUCTION_IMPOTS_9, MONTANT_EMPRUNT_9, ECONOMY_IMPOTS_9, MENSUALITE_CREDIT_9, FRAIS_ANNEXE_9, EFFORT_EPARGNE_9, LOYER_MAXIMUM_12, REDUCTION_IMPOTS_12, MONTANT_EMPRUNT_12, ECONOMY_IMPOTS_12, MENSUALITE_CREDIT_12, FRAIS_ANNEXE_12, EFFORT_EPARGNE_12,LOYER_ANNUEL_R, AMMORTISSEMENT_IMMOBILIER_R, AMMORTISSEMENT_MOBILIER_R, INTERET_EMPRUNT_R, AUTRES_CHARGES_R, ABBATEMENT_R,  IMPOTS_R, TOTAL_CHARGES_R, TOTAL_IMPOTS_R, RESULTAT_R, EFFORT_R, LOYER_ANNUEL_M, AMMORTISSEMENT_IMMOBILIER_M, AMMORTISSEMENT_MOBILIER_M, INTERET_EMPRUNT_M, AUTRES_CHARGES_M, ABBATEMENT_M,  IMPOTS_M, TOTAL_CHARGES_M, TOTAL_IMPOTS_M, RESULTAT_M, EFFORT_M, MONTANT_LOYER, MONTANT_TVA_IMMOBILIER, MONTANT_RECUPERE, COUT_FINAL_INVESTISSEMENT)
VALUES                                (1,       600,              200,               200000      ,     30000,               1000,              3000,         1000,                 800,              300,               250000      ,     35000,               1100,              3500,         1500,               900,              350,               300000      ,         40000,               1200,              4000,            2000,              2000,               15,                            18,                    450,              150,              17,          200,        350,              350,         500,        600,       2500,               20,                            23,                    500,              200,              20,          250,        400,              450,         600,        700,      3000,                 15,                600,                  180000);

INSERT INTO testdb.DOSSIER_SIMULATION (ID, LOYER_MAXIMUM_6, REDUCTION_IMPOTS_6, MONTANT_EMPRUNT_6, ECONOMY_IMPOTS_6, MENSUALITE_CREDIT_6, FRAIS_ANNEXE_6, EFFORT_EPARGNE_6, LOYER_MAXIMUM_9, REDUCTION_IMPOTS_9, MONTANT_EMPRUNT_9, ECONOMY_IMPOTS_9, MENSUALITE_CREDIT_9, FRAIS_ANNEXE_9, EFFORT_EPARGNE_9, LOYER_MAXIMUM_12, REDUCTION_IMPOTS_12, MONTANT_EMPRUNT_12, ECONOMY_IMPOTS_12, MENSUALITE_CREDIT_12, FRAIS_ANNEXE_12, EFFORT_EPARGNE_12,LOYER_ANNUEL_R, AMMORTISSEMENT_IMMOBILIER_R, AMMORTISSEMENT_MOBILIER_R, INTERET_EMPRUNT_R, AUTRES_CHARGES_R, ABBATEMENT_R,  IMPOTS_R, TOTAL_CHARGES_R, TOTAL_IMPOTS_R, RESULTAT_R, EFFORT_R, LOYER_ANNUEL_M, AMMORTISSEMENT_IMMOBILIER_M, AMMORTISSEMENT_MOBILIER_M, INTERET_EMPRUNT_M, AUTRES_CHARGES_M, ABBATEMENT_M,  IMPOTS_M, TOTAL_CHARGES_M, TOTAL_IMPOTS_M, RESULTAT_M, EFFORT_M, MONTANT_LOYER, MONTANT_TVA_IMMOBILIER, MONTANT_RECUPERE, COUT_FINAL_INVESTISSEMENT)
VALUES                                (2,       900,              350,               300000      ,         40000,               1200,              4000,            2000,           800,              300,               250000      ,     35000,               1100,              3500,         1500,               600,              200,               200000      ,     30000,               1000,                   3000,            1000,              2500,               20,                            23,                    500,              200,              20,          250,        400,              450,         600,        700,       2000,               15,                            18,                    450,              150,              17,          200,        350,              350,         500,        600,      2000,                 20,                700,                  200000);

INSERT INTO testdb.DOSSIER_SIMULATION (ID, LOYER_MAXIMUM_6, REDUCTION_IMPOTS_6, MONTANT_EMPRUNT_6, ECONOMY_IMPOTS_6, MENSUALITE_CREDIT_6, FRAIS_ANNEXE_6, EFFORT_EPARGNE_6, LOYER_MAXIMUM_9, REDUCTION_IMPOTS_9, MONTANT_EMPRUNT_9, ECONOMY_IMPOTS_9, MENSUALITE_CREDIT_9, FRAIS_ANNEXE_9, EFFORT_EPARGNE_9, LOYER_MAXIMUM_12, REDUCTION_IMPOTS_12, MONTANT_EMPRUNT_12, ECONOMY_IMPOTS_12, MENSUALITE_CREDIT_12, FRAIS_ANNEXE_12, EFFORT_EPARGNE_12,LOYER_ANNUEL_R, AMMORTISSEMENT_IMMOBILIER_R, AMMORTISSEMENT_MOBILIER_R, INTERET_EMPRUNT_R, AUTRES_CHARGES_R, ABBATEMENT_R,  IMPOTS_R, TOTAL_CHARGES_R, TOTAL_IMPOTS_R, RESULTAT_R, EFFORT_R, LOYER_ANNUEL_M, AMMORTISSEMENT_IMMOBILIER_M, AMMORTISSEMENT_MOBILIER_M, INTERET_EMPRUNT_M, AUTRES_CHARGES_M, ABBATEMENT_M,  IMPOTS_M, TOTAL_CHARGES_M, TOTAL_IMPOTS_M, RESULTAT_M, EFFORT_M, MONTANT_LOYER, MONTANT_TVA_IMMOBILIER, MONTANT_RECUPERE, COUT_FINAL_INVESTISSEMENT)
VALUES                                (3,       800,              300,               250000      ,     35000,               1100,              3500,         1500,               600,              200,               200000      ,     30000,               1000,              3000,         1000,                 900,              350,               300000      ,         40000,               1200,              4000,            2000,            1000,                    20,                            23,                    500,              200,              20,          250,        400,              450,         600,        700,       2000,               15,                            18,                    450,              150,              17,          200,        350,              350,         500,        600,      2000,                 20,                700,                  200000);

CREATE TABLE testdb.PRODUIT_IMMOBILIER (
    ID BIGINT NOT NULL AUTO_INCREMENT,
    TYPE1 VARCHAR(25),
    TELEPHONE VARCHAR(15),
    DESCRIPTION VARCHAR(2000),
    NOMBRE_LOTS INTEGER,
    PARKING BIT(1),
    BOX BIT(1),
    CAVE BIT(1),
    BALCON BIT(1),
    TERASSE BIT(1),
    LOGGIA BIT(1),
    SURFACE_ANNEXE BIT(1),
    DUPLEX BIT(1),
    TRIPLEX BIT(1),
    ASCENCEUR BIT(1),
    GARDIEN BIT(1),
    CHEMINEE BIT(1),
    INTERPHONE BIT(1),
    DIGICODE BIT(1),
    ORIENTATION VARCHAR(2),
    DPE CHAR(1),
    ETAGE INTEGER,
    NOMBRE_ETAGE INTEGER,
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
    SURFACE_HABITABLE DOUBLE,
    SURFACE_LOI_QUAREZ DOUBLE,
    SURFACE_BALCON DOUBLE,
    SURFACE_TERRASSE DOUBLE,
    SURFACE_VERANDAS DOUBLE,
    SURFACE_CAVE DOUBLE,
    SURFACE_LOGGIA DOUBLE,
    AUTRE_SURFACE_ANNEXE DOUBLE,
    LOYERMAXIMUM DOUBLE,
    SALE_RENT CHAR(1),
	PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;; 

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

    BOX BIT(1),
    CAVE BIT(1),
    BALCON BIT(1),
    TERASSE BIT(1),
    LOGGIA BIT(1),
    SURFACE_ANNEXE BIT(1),
    DUPLEX BIT(1),
    TRIPLEX BIT(1),

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1,         TELEPHONE,            DESCRIPTION,                                                                                                                                        NOMBRE_LOTS, PARKING, BOX, CAVE,  BALCON,  TERASSE, LOGGIA,  SURFACE_ANNEXE,  DUPLEX,  TRIPLEX,  ASCENCEUR, GARDIEN, CHEMINEE, INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE,  NOMBRE_ETAGE, NOMBRE_PIECE, NOMBRE_CHAMBRE, SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,  DATE_MISE_EN_LIGNE,                ADRESSE,     CODE_POSTAL, VILLE , ZONE1, PRIX, SURFACE_HABITABLE, SURFACE_LOI_QUAREZ, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_CAVE, SURFACE_LOGGIA, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, SALE_RENT)
VALUES                                (1, 'Appartement', '0102030405',  'C’est idéalement situé au 27 quai de Grenelle que Flatlooker vous propose aujourd’hui ce trois pièces d’exception au 5ème étage'                            ,  1,         0,      0,    1,     0,        1,      0,         1  ,           0,        1,         0,       1,       0,        1,          0,          'S',     'A'   , 5,      10,             4,              2,             1          ,   1,            1,                0,                  100      ,    101    ,        '2008-7-04',       '2019-10-15',          '27 quai de Grenelle',   '75015'  , 'Paris','A',  102,    103 ,                103,                 104,              105,             106,              108,           109,             110,                1000,      'V'   );  

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1,         TELEPHONE,   DESCRIPTION,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          NOMBRE_LOTS, PARKING, BOX, CAVE,  BALCON,  TERASSE, LOGGIA,  SURFACE_ANNEXE,  DUPLEX,  TRIPLEX, ASCENCEUR,GARDIEN, CHEMINEE, INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_ETAGE, NOMBRE_PIECE,NOMBRE_CHAMBRE,SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,    DATE_MISE_EN_LIGNE,            ADRESSE,          CODE_POSTAL, VILLE, ZONE1, PRIX, SURFACE_HABITABLE, SURFACE_LOI_QUAREZ, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_CAVE, SURFACE_LOGGIA, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, SALE_RENT)
VALUES                                (2, 'Appartement', '0202030405',  'Proprioo, l’agence nouvelle génération, vous propose à la vente cet appartement de 2 pièces de 43 m² localisé Rue de l’Abbé Groult, Paris 15ème. Ce bien se situe au 4ème étage avec ascenseur d’un immeuble des années 1960. Il se compose d’une grand pièce à vivre avec séjour, salle à manger et cuisine US, une chambre / coin nuit, et une salle de bain avec WC. Ce T2 dispose également d’un balcon. Les caractéristiques du bien: Simple vitrage. Orientation: Sud / Ouest. 1 cave. Charges de copropriété: 150 € par mois L’appartement est situé dans un quartier vivant, en plein coeur du 15ème, à 3 min à pieds du métro Convention. Ce bien est commercialisé par Proprioo.',             2,         1,     1,    0,     1,        0,      1,          0,             1,      0,        0  ,       0,        0,        0,          1,       'E',      'B',  6 ,     11,              5  ,             3,          1,            2,            1,               1,                   200      ,    201    ,           '2008-7-05',  '2019-10-16',             '2 Rue de l’Abbé Groult',   '75015','Paris','Abis',202,    203 ,                203,                204,              205,             206,            208,           209,           210,                900,            'L'   ); 

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE,   DESCRIPTION,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   NOMBRE_LOTS, PARKING, BOX, CAVE,  BALCON,  TERASSE, LOGGIA,  SURFACE_ANNEXE,  DUPLEX,  TRIPLEX, ASCENCEUR, GARDIEN,   CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_ETAGE,  NOMBRE_PIECE,NOMBRE_CHAMBRE,SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,   DATE_MISE_EN_LIGNE,            ADRESSE,           CODE_POSTAL, VILLE,  ZONE1,  PRIX, SURFACE_HABITABLE, SURFACE_LOI_QUAREZ, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_CAVE, SURFACE_LOGGIA, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, SALE_RENT)
VALUES                                (3, 'Maison', '0302030405',   'IAD France - Thierry CARTIGNY vous propose: Superbe appartement situé au 2 étage d’une belle copropriété de 5 lots, séjour, salon, coin cuisine, chambre, salle de bain, le tout sur 40 m² environ (loi carrez), surface au sol 101 m² environ, 2 places de parking. La présente annonce immobilière vise 1 lot principal situé dans une copropriété formant 5 lots au total ne faisant l’objet d’aucune procédure en cours et d’un montant de charges d’environ 50 euros par mois (soit 600 euros annuel) déclaré par le vendeur.Honoraires d’agence à la charge du vendeur. Information d’affichage énergétique sur ce bien: DPE VI indice 0 et GES VI indice 0. La présente annonce immobilière a été rédigée sous la responsabilité éditoriale de M. Thierry CARTIGNY (ID 34376), Agent Commercial mandataire en immobilier immatriculé au Registre Spécial des Agents Commerciaux (RSAC) du Tribunal de Commerce de Valenciennes sous le numéro 844424465.'                             ,3,         0,     0,    1,     0,        1,      0,         1,             0,       1,        1  ,        0,         1,           1,         0,         '',    'C',   2    ,   4,                6,            3,        2,            1,             2,                 1,                300      ,    301    ,       '2008-7-06',   '2019-10-17',           '1 rue du Maréchal Joffre.',    '59530', 'Le Quesnoy', 'B',   302,    303 ,              303,                  304,              305,             306,             308,           309,             310,                800,          'V'  );

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE, DESCRIPTION,                                                                                                                                                                  NOMBRE_LOTS, PARKING, BOX, CAVE,  BALCON,  TERASSE, LOGGIA,  SURFACE_ANNEXE,  DUPLEX,  TRIPLEX, ASCENCEUR, GARDIEN , CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_ETAGE, NOMBRE_PIECE,NOMBRE_CHAMBRE,SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,     DATE_MISE_EN_LIGNE,                ADRESSE,       CODE_POSTAL, VILLE  ,  ZONE1, PRIX, SURFACE_HABITABLE, SURFACE_LOI_QUAREZ,  SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_CAVE, SURFACE_LOGGIA, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, SALE_RENT)
VALUES                                (4, 'Appartement', '0402030405', 'Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cr' ,                                                            4,             1,    1,    0,     1,        0,       1,          0,            1,       0,         0  ,       0,       0,           1,         0,         'O',   'D',   5   ,  10,            4,                 2,          1,           1,             1,                1,                 400      ,    401    ,           '2008-7-07',   '2019-10-18',      '84, Boulevard Maxime Gorki',       '94800', 'Villejuif', 'B1',  402,    403 ,               403,                  404,              405,             406,            408,           409,             410,                700,         'L'   );

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE,      DESCRIPTION                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ,  NOMBRE_LOTS, PARKING, BOX, CAVE,  BALCON,  TERASSE, LOGGIA,  SURFACE_ANNEXE,  DUPLEX,  TRIPLEX, ASCENCEUR,GARDIEN,  CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_ETAGE, NOMBRE_PIECE, NOMBRE_CHAMBRE,SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,   DATE_MISE_EN_LIGNE,   ADRESSE,               CODE_POSTAL, VILLE, ZONE1,   PRIX, SURFACE_HABITABLE, SURFACE_LOI_QUAREZ, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_CAVE, SURFACE_LOGGIA, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM,  SALE_RENT )
VALUES                                (5, 'Maison', '0502030405', 'EN EXCLUSIVITÉ à ORSINVAL (59530): Vous souhaitez faire un placement dans un secteur très prisé du Valenciennois, acquérir un bien valorisant votre patrimoine, dans une résidence de standing sécurisée ? Ce type 2 en rez-de-jardin est idéal, avec une place parking privative sans oublier 40 m² de jardin clos sans vis à vis. Un locataire sérieux et fidèle vous garantit un loyer annuel de 4830 euros. 59000/59300/59990 Nombre de lots de la copropriété: 114, Montant moyen annuel de la quote-part de charges (budget prévisionnel): 624 euros soit 52 euros par mois. Les honoraires sont à la charge du vendeur. Réseau Immobilier CAPIFRANCE - Votre agent commercial Delphine VANACKER Plus d’informations sur le site de CAPIFRANCE'     ,5,              0,    0,    1,      0,       1,      0,          1,             0,      1,          1  ,     0,         1,          0   ,       1,        '',    'E'   ,1,      2,               5,              3,          1,          1,             1,                0  ,                 500      ,    501    ,           '2008-7-08', '2019-10-19',      '17 rue du petit Neuilly', '59530' , 'ORSINVAL','B2',     502,    503 ,                 503,                504,              505,             506,            508,           509,                 510,                800,      'V' );

INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE, DESCRIPTION,                                                                                                                                                                  NOMBRE_LOTS, PARKING, BOX, CAVE,  BALCON,  TERASSE, LOGGIA,  SURFACE_ANNEXE,  DUPLEX,  TRIPLEX, ASCENCEUR, GARDIEN,CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_ETAGE, NOMBRE_PIECE, NOMBRE_CHAMBRE, SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION, DATE_MISE_EN_LIGNE,            ADRESSE,          CODE_POSTAL, VILLE,  ZONE1, PRIX, SURFACE_HABITABLE, SURFACE_LOI_QUAREZ, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_CAVE, SURFACE_LOGGIA, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM,  SALE_RENT)
VALUES                                (6, 'Maison', '0602030405', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cr',           6,          1,     1,    0,      1,       0,       1,         0,             1,       0,        0  ,     0,      0,           1,         0,       '',       'F'   ,2,       4,               3,            1,             1,           0,             1,                0,                 600      ,    601    ,           '2008-7-09',      '2019-10-19' ,     '6, boulevard Dubreuil',     '91400',     'Orsay', 'C', 602,    603 ,                603,                 604,              605,             606,           608,           609,             610,                750,           'L'); 


INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1,         TELEPHONE,             DESCRIPTION,                                                  NOMBRE_LOTS, PARKING, BOX, CAVE,  BALCON,  TERASSE, LOGGIA,  SURFACE_ANNEXE,  DUPLEX,  TRIPLEX, ASCENCEUR, GARDIEN, CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE, NOMBRE_ETAGE, NOMBRE_PIECE, NOMBRE_CHAMBRE, SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,     DATE_MISE_EN_LIGNE,             ADRESSE,         CODE_POSTAL, VILLE,   ZONE1, PRIX, SURFACE_HABITABLE, SURFACE_LOI_QUAREZ,  SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_CAVE, SURFACE_LOGGIA, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM,  SALE_RENT)
VALUES                                (7, 'Appartement', '0702030405', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus',   7,           0,    0,    1,      0,        1,      0,          1,            0,       1,        1  ,    1,       0,          0,          1,        'N',       'G',   10,     15,               4,            2,                1,            0,             0,                 1          ,   700      ,    701    ,           '2008-7-10',           '2019-10-20',   '20, rue du Docteur Pinel', '94800', 'Villejuif', 'A',   702,    703 ,               703,                   704,              705,             706,           708,           709,             710,                650,          'V');


INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE, DESCRIPTION,   NOMBRE_LOTS, PARKING, BOX, CAVE,  BALCON,  TERASSE, LOGGIA,  SURFACE_ANNEXE,  DUPLEX,  TRIPLEX, ASCENCEUR, GARDIEN, CHEMINEE, INTERPHONE, DIGICODE, ORIENTATION,DPE, ETAGE, NOMBRE_ETAGE, NOMBRE_PIECE, NOMBRE_CHAMBRE, SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,  DATE_MISE_EN_LIGNE,        ADRESSE,        CODE_POSTAL, VILLE, ZONE1,  PRIX, SURFACE_HABITABLE, SURFACE_LOI_QUAREZ,   SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_CAVE, SURFACE_LOGGIA, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, SALE_RENT)
VALUES                                (8, 'Maison', '0802030405',   '',       8,            1,     1,    0,     1,         0,      1,         0,             1,       0,         0  ,       0,        1,          0,         0,        '',  'H'   ,2,      4,               3,            1,             1,           1,              1,                 0,                800      ,    801    ,           '2008-7-11',   '2019-10-21',               '7 rue du stade', '91400', 'Saclay', 'Abis',802,    803 ,               803,                    804,              805,             806,            808,           809,             810,                650,         'L');


INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE, DESCRIPTION,  NOMBRE_LOTS, PARKING, BOX, CAVE,  BALCON,  TERASSE, LOGGIA,  SURFACE_ANNEXE,  DUPLEX,  TRIPLEX, ASCENCEUR, GARDIEN,CHEMINEE, INTERPHONE, DIGICODE, ORIENTATION,DPE,ETAGE, NOMBRE_ETAGE, NOMBRE_PIECE, NOMBRE_CHAMBRE, SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,  DATE_MISE_EN_LIGNE,          ADRESSE,     CODE_POSTAL, VILLE,    ZONE1, PRIX, SURFACE_HABITABLE, SURFACE_LOI_QUAREZ, SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_CAVE, SURFACE_LOGGIA, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, SALE_RENT)
VALUES                                (9, 'Appartement', '0902030405', '',        9,       0,     0,    1,      0,       1,       0,          1,            0,       1,        1  ,      1,      0,         1,          0,        'E',     'I',11   ,    15,             4,              1,              1,         1,                 1,                1,                900      ,    901    ,           '2008-7-12',   '2019-10-22',    '102 Rue Jean Jaurès', '94800', 'Villejuif', 'B',   902,    903 ,                903,                  904,              905,             906,           908,           909,             910,                500,         'V'); 


INSERT INTO testdb.PRODUIT_IMMOBILIER (ID, TYPE1, TELEPHONE, DESCRIPTION,                                                                       NOMBRE_LOTS, PARKING, BOX, CAVE,  BALCON,  TERASSE, LOGGIA,  SURFACE_ANNEXE,  DUPLEX,  TRIPLEX, ASCENCEUR, GARDIEN,CHEMINEE,  INTERPHONE, DIGICODE, ORIENTATION, DPE, ETAGE,NOMBRE_ETAGE, NOMBRE_PIECE,NOMBRE_CHAMBRE,SALLE_BAIN, SALLE_DOUCHE, TOILETTE_SEPARE, TOILETTE_NON_SEPARE, CHARGES_COPROP, TAXES_FONCIAIRES, ANNEE_CONSTRUCTION,   DATE_MISE_EN_LIGNE,         ADRESSE,         CODE_POSTAL, VILLE,    ZONE1, PRIX, SURFACE_HABITABLE, SURFACE_LOI_QUAREZ,   SURFACE_BALCON, SURFACE_TERRASSE, SURFACE_VERANDAS, SURFACE_CAVE, SURFACE_LOGGIA, AUTRE_SURFACE_ANNEXE, LOYERMAXIMUM, SALE_RENT)
VALUES                               (10, 'Appartement', '1002030405',  'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus',  10,         1,      1,    0,      1,       0,       1,          0,            1,       0,        0  ,     0,       0,           0,         1,        'S',     'J',    3   ,  5  ,          5,                 3,           1,            0,               0,                  1,               1000      ,    1001    ,         '2008-7-13',    '2019-10-23', '38 Rue Georges Lebigot', '94800', 'Villejuif', 'B1',  1002,      1003 ,             1003,                   1004,              1005,           1006,         1008,          1009,             1010,              700,          'L' );
