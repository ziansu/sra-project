private void validateName(java.lang.String name) throws logistics.utilities.exceptions.NullParameterException {
    if ((name == null) | (name.isEmpty())) {
        throw new logistics.utilities.exceptions.NullParameterException("Facility Name cannot be Null or Empty");
    }
}