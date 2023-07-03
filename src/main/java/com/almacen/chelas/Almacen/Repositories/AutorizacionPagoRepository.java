package com.almacen.chelas.Almacen.Repositories;

import com.almacen.chelas.Almacen.Models.AutorizacionPago;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AutorizacionPagoRepository extends CrudRepository<AutorizacionPago, Integer> {
}
