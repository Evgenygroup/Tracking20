package com.evgeny.track.repositiory;

import com.evgeny.track.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentRepository extends JpaRepository<Shipment,Long> {

    List<Shipment> findAllShipmentsByCustomerId(Long CustomerId);
}
