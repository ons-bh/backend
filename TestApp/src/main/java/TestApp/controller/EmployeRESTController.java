package TestApp.controller;

import TestApp.entities.Departement;
import TestApp.entities.Employe;
import TestApp.repository.DepartementRepository;
import TestApp.repository.EmployeRepository;
import TestApp.service.DepartementServiceImpl;
import TestApp.service.EmployeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController // pour déclarer un service web de type REST
@RequestMapping("/employe")
public class EmployeRESTController {
    @Autowired
    private EmployeServiceImpl employeService;
    @Autowired
    private EmployeRepository employeRepository;

    @GetMapping("/")
    public List<Employe> getListEmploye() {

        return employeService.getListEmploye();
    }

    @GetMapping("/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }
    @PostMapping("/")
    public Employe ajoutEmploye(@RequestBody Employe e) {

        return employeService.ajoutEmploye(e);
    }

    @PutMapping("/")
    public Employe updateEmploye(@RequestBody Employe e) {

        return employeRepository.save(e);
    }
    @PutMapping("/{empId}/departement/{depId}")
    public Employe ajoutEmployedepartement(
            @PathVariable Long empId,
            @PathVariable Long depId
    ){
        return employeService.ajoutEmployedepartement(empId, depId);
    }
    @PostMapping("/{depId}")
    public void ajoutEmployedepartement(@RequestBody Employe emp, @PathVariable Long iddep) {
        employeRepository.save(emp);
    }
    @DeleteMapping("/{id}")
    public void supprimerEmploye(@PathVariable Long id) {
        employeService.supprimerEmploye(id);

    }
}
