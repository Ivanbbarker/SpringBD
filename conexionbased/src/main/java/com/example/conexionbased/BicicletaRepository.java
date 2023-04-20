package com.example.conexionbased;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {

}
