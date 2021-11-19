public boolean isReady() {
    return ((tracingFormDao.getTracingForm()) != null) && ((tracingFormDao.getTracingForm().getForm()) != null);
}