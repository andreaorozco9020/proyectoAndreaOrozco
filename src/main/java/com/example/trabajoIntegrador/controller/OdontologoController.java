package com.example.trabajoIntegrador.controller;
import com.example.trabajoIntegrador.entity.Odontologo;
import com.example.trabajoIntegrador.service.OdontologoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    private final OdontologoService odontologoService;
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;//inyeccion de independencias
    }

    /**------------------------METODOS--------------------------------*/

    @GetMapping
    public List<Odontologo> obtenerTodos(){
        return odontologoService.obtenerTodos();
    }


    @GetMapping(path = "{id}")
    public Odontologo obtener(@PathVariable("id") Long id) {
        return odontologoService.obtener(id);
    }


    @PostMapping //depende del lo que vamos hacer verbos de HTTP y por eso usamos Post
    public ResponseEntity<Odontologo>agregar(@RequestBody Odontologo odontologo){
        odontologoService.agregar(odontologo);
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }//NOS DICE QUE TOME EL BODY DEL CLIENTE Y NO PONGA NE EL PARAMETRO

    @PutMapping("{id}")// metodo para modificar informacion
    public ResponseEntity<Odontologo>modificar(@RequestBody Odontologo odontologo, @PathVariable Long id){
        odontologoService.modificar(odontologo, id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
