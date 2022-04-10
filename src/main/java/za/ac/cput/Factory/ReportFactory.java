package za.ac.cput.Factory;

import za.ac.cput.Entity.Report;

public class ReportFactory {

    public static Report createReport (int reportID, String reportType) {

        return new Report.ReportBuilder()
                .setReportID(reportID)
                .setReportType(reportType)
                .build();

    }

}
