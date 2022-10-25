package za.ac.cput.carservicemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.carservicemanagementsystem.entity.Employee;
import za.ac.cput.carservicemanagementsystem.entity.Workshop;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,  Long> {
}
