package za.ac.cput.carservicemanagementsystem.service;

/*Author
  Moegamad Nur Duncan 220014442
*
*
* */

import za.ac.cput.carservicemanagementsystem.entity.Workshop;
import za.ac.cput.carservicemanagementsystem.service.IService;

public interface WorkshopService extends IService<Workshop, Long> {
    Workshop findWorkShopByLocationOrName(String Location, String name);
}