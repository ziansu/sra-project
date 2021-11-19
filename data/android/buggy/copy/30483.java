private void assertLabel(org.activityinfo.model.form.FormInstance instance, java.lang.String expectedLabel) {
    org.junit.Assert.assertEquals(org.activityinfo.model.form.FormInstanceLabeler.getLabel(instance), expectedLabel);
}