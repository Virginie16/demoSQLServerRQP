CREATE TABLE change_control
(
    id uniqueidentifier NOT NULL DEFAULT NEWID(),
    avancement nvarchar(max),
    date_lancement date,
    reference nvarchar(max),
    titre nvarchar(max),
    site nvarchar(max),
    produit nvarchar(max),
    type_cc nvarchar(max),
    classification nvarchar(max),
    date_cloture date,
    CONSTRAINT change_control_pkey PRIMARY KEY (id)
);
