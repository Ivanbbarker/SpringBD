package com.example.conexionbased.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//¿Como hago para agregar una nueva bicicleta a la base de datos de mysql?

import com.example.conexionbased.Modelo.Bicicleta;
import com.example.conexionbased.Services.BicicletaService;

import java.util.List;

@Controller //se utiliza para construir aplicaciones web y devuelve vistas.
//@RestController // es una versión especializada de @Controller que se utiliza para construir servicios RESTful y devuelve directamente objetos JSON. incompatible con @Controller
@RequestMapping("/bicicletas")
public class BicicletaController {


    @Autowired
    private BicicletaService bicicletaService;


    // Obtener todas las bicicletas (GET)
    @GetMapping
    public ResponseEntity<List<Bicicleta>> getAllBicicletas() {
        List<Bicicleta> bicicletas = bicicletaService.findAll();
        return new ResponseEntity<>(bicicletas, HttpStatus.OK);
    }


    // Obtener una bicicleta por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Bicicleta> getBicicletaById(@PathVariable Long id) {
        Bicicleta bicicleta = bicicletaService.findById(id);
        return new ResponseEntity<>(bicicleta, HttpStatus.OK);
    }


    // Crear una nueva bicicleta (POST)
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
public ResponseEntity<Bicicleta> createBicicleta(@ModelAttribute Bicicleta bicicleta) {
    Bicicleta newBicicleta = bicicletaService.save(bicicleta);
    return new ResponseEntity<>(newBicicleta, HttpStatus.CREATED);
}  

    // Actualizar una bicicleta existente (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Bicicleta> updateBicicleta(@PathVariable Long id, @RequestBody Bicicleta bicicleta) {
        Bicicleta updatedBicicleta = bicicletaService.update(id, bicicleta);
        return new ResponseEntity<>(updatedBicicleta, HttpStatus.OK);
    }


    // Eliminar una bicicleta por ID (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBicicleta(@PathVariable Long id) {
        bicicletaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    // Creando la interfaz web
    public BicicletaController(BicicletaService bicicletaService) {
        this.bicicletaService = bicicletaService;
    }

    @RequestMapping("/listadobicicletas")
    public String listarBicicletas(Model model) {
        List<Bicicleta> bicicletas = bicicletaService.findAll();
        model.addAttribute("bicicletas", bicicletas);
        model.addAttribute("bicicleta", new Bicicleta()); // Añade esta línea
        return "listado-bicicletas";
    }
}
