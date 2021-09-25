package com.Ejercicio01AD.AlejandroMartin.ejercicio;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MonumentoController {

    private final MonumentoRepository repository;

    @GetMapping("/monumento")
    public List<Monumento> findAll (){
        return repository.findAll();

    }
    @GetMapping("monumento/{id}")
    public Monumento findById (@PathVariable("id")Long id){
        return repository.findById(id).orElse(null);

    }

    @PostMapping("/monumento")
    public ResponseEntity<Monumento> create (@RequestBody Monumento monumento){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(repository.save(monumento));
    }
    @PutMapping("monumento/{id}")
    public Monumento edit(@RequestBody Monumento monumento, @PathVariable Long id){
        Monumento monAntiguo = repository.findById(id).orElse(monumento);
        monAntiguo.setCodigoPais(monumento.getCodigoPais());
        monAntiguo.setNombrePais(monumento.getNombrePais());
        monAntiguo.setNombreCiudad(monumento.getNombreCiudad());
        monAntiguo.setCoordenadasPais(monumento.getCoordenadasPais());
        monAntiguo.setNombreMonumento(monumento.getNombreMonumento());
        monAntiguo.setDescripcion(monumento.getDescripcion());
        monAntiguo.setUrl(monumento.getUrl());

        return repository.save(monAntiguo);
    }
    @DeleteMapping("/monumento/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
