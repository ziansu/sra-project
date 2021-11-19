public void setCourseContext(java.lang.String courseId, java.lang.String unitUrl, java.lang.String component) {
    this.properties.put(Keys.CONTEXT, getEventContext(courseId, unitUrl, component));
}