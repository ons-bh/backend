package TestApp.service;

import TestApp.entities.Departement;

import java.util.List;

public interface DepartementServiceInterface {
    Departement ajoutDepartement(Departement d) ;
    List<Departement> getListDepartement();
    Departement getDepartementById(Long id);

    Departement updateDepartement(Long  id);
    void supprimerDepartement(Long id);

}
