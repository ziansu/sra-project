private com.github.reflectoring.infiniboard.quartermaster.dashboard.domain.Dashboard getSupportDashboardMock(int id) {
    com.github.reflectoring.infiniboard.quartermaster.dashboard.domain.Dashboard dashboard = new com.github.reflectoring.infiniboard.quartermaster.dashboard.domain.Dashboard(id, "Development", "Just what you need");
    dashboard.setWidgetConfigs(widgetConfigService.loadWidgets());
    return dashboard;
}