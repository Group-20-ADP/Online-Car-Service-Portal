package za.ac.cput.Impl;

/*Author
  Moegamad Nur Duncan 220014442
* Report Repository.java
* Date : 10 April 2022
*
*
* */

import za.ac.cput.Entity.Report;
import za.ac.cput.Entity.Workshop;
import za.ac.cput.repository.ReportIRepository;

import java.util.Set;
import java.util.HashSet;

public class ReportRepository implements ReportIRepository {

    private static ReportRepository repository = null;
    private Set<Report> reportData = null;

    private ReportRepository() {
        reportData = new HashSet<Report>();
    }

    //Singleton
    public static ReportRepository getRepository () {

        if (repository == null) {
            repository = new ReportRepository();
        }

       return repository;
    }
//Create
    @Override
    public Report create(Report report) {
        boolean success = reportData.add(report);

        if(!success) {
            return null;
        }

        else return report;
    }
//Read
    @Override
    public Report update(Report report) {
        Report diffReport = read(report.getReportID());

        if (diffReport != null) {
           reportData.remove(diffReport);
            reportData.add(report);
            return report;
        }

        else return null;
    }
//Update
    @Override
    public Report read(Integer reportID) {
        for (Report report: reportData) {
            if (report.getReportID() == reportID)
                return report;
        }

        return null;
    }
//Delete
    @Override
    public boolean delete(Integer reportID) {
        Report reportDelete = read(reportID);
        if (reportDelete == null) {
            return false;
        }

        else reportData.remove(reportDelete);
        return true;
    }

    @Override
    public Set<Report> getAll() {
        return reportData;
    }
}
