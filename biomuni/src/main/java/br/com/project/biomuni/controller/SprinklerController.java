package br.com.project.biomuni.controller;

import br.com.project.biomuni.model.Sprinkler;
import br.com.project.biomuni.repository.SprinklerRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activate-sprinkler")
@CrossOrigin("*")
public class SprinklerController {

    @Autowired
    private SprinklerRepository sprinklerRepository;

    @PostMapping
    public ResponseEntity<Sprinkler> postSprinkler(@RequestBody Sprinkler sprinkler){
        return ResponseEntity.status(HttpStatus.CREATED).body(sprinklerRepository.save(sprinkler));
    }

    @GetMapping("/{ìd}")
    public ResponseEntity<Sprinkler> getSprinklerById(@PathVariable long id){
        return sprinklerRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Sprinkler>> getAllSprinklers(){
        return ResponseEntity.ok(sprinklerRepository.findAll());
    }

    @PutMapping
    public ResponseEntity<Sprinkler> putSprinkler (@RequestBody Sprinkler sprinkler){
        return ResponseEntity.status(HttpStatus.OK).body(sprinklerRepository.save(sprinkler));
    }

    @DeleteMapping("/{id}")
    public void deleteSprinkler(@PathVariable long id){
        sprinklerRepository.deleteById(id);
    }


}
