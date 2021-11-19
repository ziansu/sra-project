public static org.openmrs.module.chartsearch.api.ChartSearchService getChartSearchService() {
    try {
        org.openmrs.module.chartsearch.GeneratingJson.chartSearchService = org.openmrs.api.context.Context.getService(org.openmrs.module.chartsearch.api.ChartSearchService.class);
    } catch (org.openmrs.api.APIAuthenticationException e) {
        java.lang.System.out.println("Not Authenticated!!!");
    }
    return org.openmrs.module.chartsearch.GeneratingJson.chartSearchService;
}