private java.lang.String getTimetableData(java.lang.String courseCode) {
    java.lang.String url = new java.lang.StringBuilder(api.service.DcuTimetableService.BASE_URL).append(courseCode).toString();
    return restTemplate.getForObject(url, java.lang.String.class);
}