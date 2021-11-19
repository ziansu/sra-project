protected void putMandatoryParameter(java.lang.String name, java.lang.String description, java.lang.String value) throws com.sixsq.slipstream.exceptions.ValidationException {
    S parameter = createParameter(name, value, description, true);
    assignParameter(parameter);
}