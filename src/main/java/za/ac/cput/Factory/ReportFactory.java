package za.ac.cput.Factory;

/*Author
  Moegamad Nur Duncan 220014442
* Factory Pattern for Report Entity
* Date : 09 April 2022
*
*
* */

import za.ac.cput.Entity.Report;

public class ReportFactory {

    public static Report createReport (int reportID, String reportType) {

        return new Report.ReportBuilder()
                .setReportID(reportID)
                .setReportType(reportType)
                .build();

    }

}
