@org.junit.Test
public void emptyfile_generate() {
    ru.jeene.zapretparser.controller.XLSXReportController c = new ru.jeene.zapretparser.controller.XLSXReportController();
    ru.jeene.zapretparser.models.FullReport rep = new ru.jeene.zapretparser.models.FullReport();
    c.WriteReport(rep);
}