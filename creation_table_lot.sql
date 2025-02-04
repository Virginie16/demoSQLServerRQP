CREATE TABLE lot (
    numero_lot VARCHAR(50) PRIMARY KEY,
    synthetiseur_utilise VARCHAR(10),
    date_reception_cq DATE,
    site VARCHAR(100),
    date_realisation DATE,
	numero_flacon VARCHAR(20),
	jour_reception_cq DATE,
	rapport_icare DATE,
	DDL_date_transmission DATE,
	date_reception_PHR DATE,
	statut VARCHAR(10),
	signature_PHR DATE,
	reception_SM DATE
);
