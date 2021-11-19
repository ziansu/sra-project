private java.lang.String getTimetableData(java.lang.String courseCode) {
    java.lang.String url = (api.service.DcuTimetableService.BASE_URL) + courseCode;
    return restTemplate.getForObject(url, java.lang.String.class);
}