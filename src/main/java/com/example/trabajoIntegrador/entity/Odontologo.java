package com.example.trabajoIntegrador.entity;
import javax.persistence.*;

/**-----------ENTITY ES UNA CLASE QUE SE VA A VOLVER ENTIDAD Y SU FUTURA TABLA Y EL NAME ES EL NOMBRE DE LA TABLA EN SQL-------*/
@Entity
@Table(name="odontologos")

public class Odontologo {

    /**------------------GENERAMOS ID AUTOMATICAMENTE-----------------*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    /**---------------------------ATRIBUTOS O PROPIEDADES DE LA ENTIDAD------------*/
    private String nombre;
    private String apellido;
    private String matricula;

    /**---------------SIEMPRE DEBE IR UN CONSTRUCTOR VACIO POR REQUERIMIENTO DE JPA--------*/
    public Odontologo() {
    }

    /**---------------EN EL CONSTRUCTOR NUNCA DEBE IR ID POR QUE SE GENERA AUTOMATICAMENTE--------*/
    public Odontologo(String nombre, String apellido, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    /**-----------------------GETTERS Y SETTERS DE TODOS , EL ID SOLO DEBE TENER EN GET POR BUENAS PRACTICAS---------*/
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
