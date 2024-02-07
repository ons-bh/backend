package TestApp.controller;

import TestApp.entities.Departement;
import TestApp.repository.DepartementRepository;
import TestApp.service.DepartementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController // pour déclarer un service web de type REST

@RequestMapping("/departement")
public class DepartementRESTController {
    @Autowired
    private DepartementServiceImpl departementService;
    @Autowired
    private DepartementRepository departementRepository;

    @GetMapping("/")
    public List<Departement> getListDepartement() {

        return departementService.getListDepartement();
    }

    @GetMapping("/{id}")
    public Departement getDepartementById(@PathVariable Long id) {
        return

                departementService.getDepartementById(id);
    }
    @PostMapping("/")
    public Departement ajoutProjet(@RequestBody Departement d) {

        return departementService.ajoutDepartement(d);
    }

    @PutMapping("/")
    public Departement updateDepartement(@RequestBody Departement d) {

        return departementRepository.save(d);
    }

    @DeleteMapping("/{id}")
    public void supprimerDepartement(@PathVariable Long id) {
        departementService.supprimerDepartement(id);

    }
}
