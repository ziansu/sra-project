private void buildListReport(java.lang.String param, org.springframework.ui.Model uiModel) {
    java.util.List<net.test.model.Report> reports = reportDao.search(null);
    uiModel.addAttribute("reports", reports);
}