public static java.lang.String createQueryNameForField(final org.bonitasoft.engine.bdm.model.field.Field field) {
    if (field == null) {
        throw new java.lang.IllegalArgumentException("field cannot be null");
    }
    return org.bonitasoft.engine.bdm.BDMQueryUtil.getQueryName(field.getName());
}