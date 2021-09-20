package com.example.trabajoIntegrador.entity;
import javax.persistence.*;

/**-----------ENTITY ES UNA CLASE QUE SE VA A VOLVER ENTIDAD Y SU FUTURA TABLA Y EL NAME ES EL NOMBRE DE LA TABLA EN SQL-------*/

@Entity
@Table(name="domicilios")
public class Domicilio {

    /**------------------GENERAMOS ID AUTOMATICAMENTE-----------------*///

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;


    /**---------------------------ATRIBUTOS O PROPIEDADES DE LA ENTIDAD------------*/
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;


    /**---------------SIEMPRE DEBE IR UN CONSTRUCTOR VACIO POR REQUERIMIENTO DE JPA--------*/
    public Domicilio() {
    }

    /**---------------EN EL CONSTRUCTOR NUNCA DEBE IR ID POR QUE SE GENERA AUTOMATICAMENTE--------*/
    public Domicilio(String calle, String numero, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    /**-----------------------GETTERS Y SETTERS DE TODOS , EL ID SOLO DEBE TENER EN GET POR BUENAS PRACTICAS---------*/
    public Long getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

}
