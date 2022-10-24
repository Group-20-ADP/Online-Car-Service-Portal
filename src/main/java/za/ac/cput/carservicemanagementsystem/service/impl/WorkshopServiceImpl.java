package za.ac.cput.carservicemanagementsystem.service.impl;

/*Author
  Moegamad Nur Duncan 220014442
*
*
* */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.carservicemanagementsystem.entity.Workshop;
import za.ac.cput.carservicemanagementsystem.repository.WorkshopRepository;
import za.ac.cput.carservicemanagementsystem.service.WorkshopService;

import java.util.List;
import java.util.Objects;

@Service
public class WorkshopServiceImpl implements WorkshopService {
    private final WorkshopRepository repository;

    @Autowired
    public WorkshopServiceImpl(WorkshopRepository repository) {
        this.repository = repository;
    }

    @Override
    public Workshop create(Workshop workshop) { return this.repository.save(workshop); }

    @Override
    public Workshop update(Workshop workshop, Long workshopId) {
        Workshop workshopDB
                = repository.findById(workshopId)
                .get();

        if (Objects.nonNull(workshop.getName())
                && !"".equalsIgnoreCase(
                workshop.getName())) {
            workshopDB.setName(
                    workshop.getName());
        }

        if (Objects.nonNull(
                workshop.getLocation())
                && !"".equalsIgnoreCase(
                workshop.getLocation())) {
            workshopDB.setLocation(
                    workshop.getLocation());
        }

        return repository.save(workshopDB);
    }

    @Override
    public List<Workshop> findAll() { return repository.findAll(); }

    @Override
    public Workshop findById(Long key) { return repository.findById(key).orElse(null); }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Workshop findWorkShopByLocationOrName(String Location, String name) {
        return null;
    }
}