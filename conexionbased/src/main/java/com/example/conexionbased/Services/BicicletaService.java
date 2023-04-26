package com.example.conexionbased.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.conexionbased.Modelo.Bicicleta;
import com.example.conexionbased.Repositorios.BicicletaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BicicletaService {

    @Autowired
    private BicicletaRepository bicicletaRepository;

    // Encontrar todas las bicicletas
    public List<Bicicleta> findAll() {
        return bicicletaRepository.findAll();
    }

    // Encontrar una bicicleta por ID
    public Bicicleta findById(Long id) {
        Optional<Bicicleta> bicicleta = bicicletaRepository.findById(id);
        if (bicicleta.isPresent()) {
            return bicicleta.get();
        } else {
            throw new RuntimeException("Bicicleta no encontrada con el ID: " + id);
        }
    }

    // Guardar una bicicleta
    public Bicicleta save(Bicicleta bicicleta) {
        return bicicletaRepository.save(bicicleta);
    }

    // Actualizar una bicicleta existente
    public Bicicleta update(Long id, Bicicleta bicicletaDetails) {
        Bicicleta bicicleta = findById(id);

        bicicleta.setModelo(bicicletaDetails.getModelo());
        bicicleta.setMarca(bicicletaDetails.getMarca());
        bicicleta.setId(bicicletaDetails.getId());
        //bicicleta.setCliente(bicicletaDetails.getCliente());

        return bicicletaRepository.save(bicicleta);
    }

    // Eliminar una bicicleta por ID
    public void delete(Long id) {
        Bicicleta bicicleta = findById(id);
        bicicletaRepository.delete(bicicleta);
    }
}
