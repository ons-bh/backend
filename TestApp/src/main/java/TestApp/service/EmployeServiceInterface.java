package TestApp.service;

import TestApp.entities.Employe;

import java.util.List;

public interface EmployeServiceInterface {
    Employe ajoutEmploye(Employe e) ;
    List<Employe> getListEmploye();
    Employe getEmployeById(Long id);
    Employe ajoutEmployedepartement(Long idemp, Long iddep) ;

    Employe updateEmploye(Long  id);
    void supprimerEmploye(Long id);

}
