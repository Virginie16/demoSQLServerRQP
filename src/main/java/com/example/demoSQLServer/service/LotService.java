package com.example.demoSQLServer.service;

import com.example.demoSQLServer.entities.Lot;
import com.example.demoSQLServer.repositories.LotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LotService {

    private final LotRepository lotRepository;

    public LotService(LotRepository lotRepository) {
        this.lotRepository = lotRepository;
    }

    public List<Lot> getLotsFiltrés(String site, String produit) {
        return lotRepository.findBySiteProduitAndPeriodeWithLogging(site, produit);
    }
}

