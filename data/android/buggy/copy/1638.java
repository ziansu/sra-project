public application.entity.GCurveModel findCurveByDate(java.lang.String date) {
    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
    application.entity.GCurveModel result = repository.findCurveByDate(date);
    return result;
}