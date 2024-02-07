package TestApp.service;

import TestApp.entities.Departement;
import TestApp.entities.Employe;
import TestApp.repository.DepartementRepository;
import TestApp.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service

public class EmployeServiceImpl implements EmployeServiceInterface {
    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private DepartementRepository departementRepository;

    @Override
    public Employe ajoutEmploye(Employe e) {

        return employeRepository.save(e);
    }
@Override
public Employe ajoutEmployedepartement(Long idemp, Long iddep) {
  Set<Departement> departements = null;
    Employe employe = employeRepository.findById(idemp).get();
    Departement departement= departementRepository.findById(iddep).get();
    departements =  employe.getDepartments();
        departements.add(departement);
        employe.setDepartments(departements);
        return employeRepository.save(employe);
}





    public Employe getEmployeById(Long id) {

        return employeRepository.findById(id).orElse(null);
    }
    @Override
    public List<Employe> getListEmploye(){

        return employeRepository.findAll();
    }

    @Override
    public Employe updateEmploye(Long  id) {
        Employe employe=employeRepository.findById(id).orElse(null);
        return employeRepository.save(employe);
    }

    public void supprimerEmploye(Long id) {

        employeRepository.deleteById(id);
    }
}

