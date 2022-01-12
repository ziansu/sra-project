@java.lang.Override
public int compare(org.ihtsdo.otf.mapping.reports.ReportDefinition o1, org.ihtsdo.otf.mapping.reports.ReportDefinition o2) {
    return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
}