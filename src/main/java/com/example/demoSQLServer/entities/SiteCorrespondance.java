package com.example.demoSQLServer.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "site_correspondance")
public class SiteCorrespondance {

    @Id
    @Column(name = "trigramme_site", length = 10)
    private String trigrammeSite;

    @Column(name = "nom_site", length = 100, nullable = false)
    private String nomSite;

    // Constructeurs
    public SiteCorrespondance() {
    }

    public SiteCorrespondance(String trigrammeSite, String nomSite) {
        this.trigrammeSite = trigrammeSite;
        this.nomSite = nomSite;
    }
    public String getTrigrammeSite() {
        return trigrammeSite;
    }
    public void setTrigrammeSite(String trigrammeSite) {
        this.trigrammeSite = trigrammeSite;
    }
    public String getNomSite() {
        return nomSite;
    }
    public void setNomSite(String nomSite) {
        this.nomSite = nomSite;
    }
}