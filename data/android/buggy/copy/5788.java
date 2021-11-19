public void tellMeWhatsTheTimeIn(java.util.List<java.lang.String> locations) {
    locations.stream().map(( location) -> {
        java.lang.String time = timeRetriever.timeFor(location);
        return timeOutputRenderer.renderReport(location, time);
    });
}