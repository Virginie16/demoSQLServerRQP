package com.example.demoSQLServer.repositories;



import com.example.demoSQLServer.entities.Lot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LotRepository extends JpaRepository<Lot, String> {
    Logger logger = LoggerFactory.getLogger(LotRepository.class);
    @Query("SELECT l FROM Lot l JOIN SiteCorrespondance sc ON l.site = sc.trigrammeSite " +
            "WHERE sc.nomSite = :site " +
            "AND l.produit = :produit ")
    List<Lot> findBySiteProduitAndPeriode(
            @Param("site") String site,
            @Param("produit") String produit

    );
    default List<Lot> findBySiteProduitAndPeriodeWithLogging(String site, String produit) {
        logger.info("Executing query with site: {} and produit: {}", site, produit);
        return findBySiteProduitAndPeriode(site, produit);
    }
}
