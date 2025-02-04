package com.example.demoSQLServer.service;

import com.example.demoSQLServer.entities.ChangeControl;
import com.example.demoSQLServer.repositories.ChangeControlRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChangeControlService {
    private final ChangeControlRepository changeControlRepository;

    public ChangeControlService(ChangeControlRepository changeControlRepository) {
        this.changeControlRepository = changeControlRepository;
    }

    public List<ChangeControl> getLotsFiltresChange(String site, String produit) {
        return changeControlRepository.findBySiteProduitWithLogging(site, produit);
    }
}
