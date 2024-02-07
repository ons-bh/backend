package TestApp.service;

import TestApp.entities.Departement;
import TestApp.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DepartementServiceImpl implements DepartementServiceInterface{
    @Autowired
    private DepartementRepository departementRepository;
    @Override
    public Departement ajoutDepartement(Departement d) {

        return departementRepository.save(d);
    }

    public Departement getDepartementById(Long id) {

        return departementRepository.findById(id).orElse(null);
    }
    @Override
    public List<Departement> getListDepartement(){

        return departementRepository.findAll();
    }

    @Override
    public Departement updateDepartement(Long  id) {
        Departement departement=departementRepository.findById(id).orElse(null);
        return departementRepository.save(departement);
    }

    public void supprimerDepartement(Long id) {
        departementRepository.deleteById(id);
    }
}

