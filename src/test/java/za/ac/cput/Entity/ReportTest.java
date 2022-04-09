package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.ReportFactory;

import static org.junit.jupiter.api.Assertions.*;

/*Author
  Moegamad Nur Duncan 220014442
* Builder Pattern Test for Report Entity
*
*
*
* */
class ReportTest {
    @Test
    public void testBuilder() {
        Report report = new Report.ReportBuilder()
                .setReportID(45)
                .setReportType("Turbo Leak")
                .build();

        System.out.println(report);
        assertEquals(report, report);
    }

    @Test
    public void testFactory() {

        Report report = ReportFactory.createReport(21, "Blown Head Gasket");
        System.out.println(report);
        assertNotNull(report);

    }
}
