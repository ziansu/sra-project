public void run() {
    if (rOAccessReportFilterAction.isChecked()) {
        getViewer().addFilter(rOAccessReportFilter);
        updateViewer(false);
    }else {
        getViewer().removeFilter(rOAccessReportFilter);
        updateViewer(false);
    }
}