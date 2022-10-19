/**
 Author: Kurtney Jantjies (218138105)
 */
package za.ac.cput.carservicemanagementsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.carservicemanagementsystem.service.VehicleService;
import za.ac.cput.carservicemanagementsystem.entity.Vehicle;
import za.ac.cput.carservicemanagementsystem.repository.VehicleRepository;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository repository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public Vehicle create(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    @Override
    public Vehicle update(Vehicle vehicle, Long aLong) {
        return null;
    }

    @Override
    public List<Vehicle> findAll() { return repository.findAll(); }

    @Override
    public Vehicle findById(Long key) {
        return repository.findById(key).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
