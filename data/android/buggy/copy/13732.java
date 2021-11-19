public void showBurndownSprintPoints() {
    softwaremanagementtool.agile.charts.BacklogChartData chartData = new softwaremanagementtool.agile.charts.BacklogChartData(agilePrj.sprintList());
    classController.setLineData(chartData.getPointsBurndownData());
}