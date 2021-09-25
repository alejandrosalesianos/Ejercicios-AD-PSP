<<<<<<< HEAD
package com.Ejercicio01AD.AlejandroMartin.ejercicio;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class InitData {

    private final MonumentoRepository repository;

    @PostConstruct
    public void init(){
        repository.saveAll(Arrays.asList(
          new Monumento("US","Estados Unidos","Nueva York","40°41′21″N 74°02′40″O","La estatua de la libertad","Se encuentra en Manhattan","https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Statue_of_Liberty_7.jpg/250px-Statue_of_Liberty_7.jpg"),
          new Monumento("IT","Italia","Toscana","43°43′23″N 10°23′48″E","Torre de Pisa","Esta inclinada","https://upload.wikimedia.org/wikipedia/commons/6/66/The_Leaning_Tower_of_Pisa_SB.jpeg"),
          new Monumento("CH","China","Jinshanling","40°25′00″N 116°05′00″E","Gran Muralla China","Es muy grande y extensa","https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/The_Great_Wall_of_China_at_Jinshanling-edit.jpg/255px-The_Great_Wall_of_China_at_Jinshanling-edit.jpg")
                )
        );
    }
}
=======
package com.Ejercicio01AD.AlejandroMartin.ejercicio;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class InitData {

    private final MonumentoRepository repository;

    @PostConstruct
    public void init(){
        repository.saveAll(Arrays.asList(
          new Monumento("US","Estados Unidos","Nueva York","40°41′21″N 74°02′40″O","La estatua de la libertad","Se encuentra en Manhattan","https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Statue_of_Liberty_7.jpg/250px-Statue_of_Liberty_7.jpg"),
          new Monumento("IT","Italia","Toscana","43°43′23″N 10°23′48″E","Torre de Pisa","Esta inclinada","https://upload.wikimedia.org/wikipedia/commons/6/66/The_Leaning_Tower_of_Pisa_SB.jpeg"),
          new Monumento("CH","China","Jinshanling","40°25′00″N 116°05′00″E","Gran Muralla China","Es muy grande y extensa","https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/The_Great_Wall_of_China_at_Jinshanling-edit.jpg/255px-The_Great_Wall_of_China_at_Jinshanling-edit.jpg")
                )
        );
    }
}
>>>>>>> c473e3275d316e81b5230bd4a36b0158bc62b33f
