package ada.mc2.controller;

import ada.mc2.model.Animal;
import ada.mc2.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/animal")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/select")
    public ResponseEntity<List<Animal>> list() {
        List<Animal> List = new ArrayList<>();
        List = animalRepository.findAll();
        return ResponseEntity.ok(List);
    }
}