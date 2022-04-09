package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;

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
    public void test() {
        Report report = new Report.ReportBuilder()
                .setReportID(45)
                .setReportType("Turbo Leak")
                .build();

        System.out.println(report);
        assertEquals(report, report);
    }
}
