package com.Ejercicio01AD.AlejandroMartin.ejercicio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    public long id;

    public String codigoPais;

    public String nombrePais;

    public String nombreCiudad;

    public String coordenadasPais;

    public String nombreMonumento;

    public String descripcion;

    public String url;

    public Monumento(String codigoPais, String nombrePais, String nombreCiudad, String coordenadasPais, String nombreMonumento, String descripcion, String url) {
        this.codigoPais = codigoPais;
        this.nombrePais = nombrePais;
        this.nombreCiudad = nombreCiudad;
        this.coordenadasPais = coordenadasPais;
        this.nombreMonumento = nombreMonumento;
        this.descripcion = descripcion;
        this.url = url;
    }
}
