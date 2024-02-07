package TestApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Departement {
    @Id
    @GeneratedValue
    private Long id;
    private String nom ;
    @JsonIgnore
    @ManyToMany(mappedBy = "departments")
    private Set<Employe> employees = new HashSet<>();
    public Departement(){

    }
    public Departement(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Employe> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employe> employees) {
        this.employees = employees;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", employees=" + employees +
                '}';
    }
}
