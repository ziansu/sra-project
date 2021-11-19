@java.lang.Override
protected void validate() {
    com.hjwylde.rivers.util.Preconditions.requireTrue(com.hjwylde.rivers.db.models.ImageDocument.TYPE.equals(type()));
    java.util.Objects.requireNonNull(mProperties.get(com.hjwylde.rivers.db.models.ImageDocument.PROPERTY_DATA));
}