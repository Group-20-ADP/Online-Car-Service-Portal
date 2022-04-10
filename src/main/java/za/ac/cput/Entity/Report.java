package za.ac.cput.Entity;

/*Author
  Moegamad Nur Duncan 220014442
* Builder Pattern for Report Entity
*
*
*
* */

public class Report {

    private int reportID;
    private String reportType;

    private Report (Report.ReportBuilder builder) {
        this.reportID = builder.reportID;
        this.reportType = builder.reportType;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    //Builder
    public static class ReportBuilder {
        private int reportID;
        private String reportType;

        public Report.ReportBuilder setReportID(int reportID) {
            this.reportID = reportID;
            return this;
        }

        public Report.ReportBuilder setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }

        public Report.ReportBuilder copy (Report report) {
            this.reportID = report.reportID;
            this.reportType = report.reportType;
            return this;
        }

        public Report build() {
            return new Report(this);
        }


        }
    @Override
    public String toString() {
        return "ReportBuilder{" +
                "reportID=" + reportID +
                ", reportType='" + reportType + '\'' +
                '}';
    }
}
