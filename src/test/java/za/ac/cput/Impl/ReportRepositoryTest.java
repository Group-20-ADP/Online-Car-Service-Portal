package za.ac.cput.Impl;

/*Author
  Moegamad Nur Duncan 220014442
* Test for Report Repository
* Date : 10 April 2022
*
*
* */

import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.Entity.Report;
import za.ac.cput.Factory.ReportFactory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)

class ReportRepositoryTest {

    private static ReportRepository repository = ReportRepository.getRepository();

    private static Report report = ReportFactory.createReport(6, "Replace engine mounting");

    @Test
    void rep_create() {
        Report generate = repository.create(report);
        assertNotNull(generate);
        System.out.println("Create: " + generate);
    }

    @Test
    void rep_read() {
        Report view = repository.read(report.getReportID());
        assertNotNull(view);
        System.out.println("Read: " + view);
    }

    @Test
    void rep_update() {
        Report change = new Report.ReportBuilder().copy(report).setReportID(45).setReportType("Oil leak")
                .build();
        assertNotNull(change);
        System.out.println("update to " + change);
    }

    @Test
    void rep_delete() {
        boolean success = repository.delete(report.getReportID());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}


