private void validateName(java.lang.String name) throws logistics.utilities.exceptions.NullParameterException {
    if ((name == null) | (name == "")) {
        throw new logistics.utilities.exceptions.NullParameterException("Facility Name cannot be Null or Empty");
    }
}