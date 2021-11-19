public void run() {
    if (rOAccessReportFilterAction.isChecked()) {
        getViewer().addFilter(rOAccessReportFilter);
        updateViewer(true);
    }else {
        getViewer().removeFilter(rOAccessReportFilter);
        updateViewer(true);
    }
}