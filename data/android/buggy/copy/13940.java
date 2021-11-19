private boolean isValid(java.lang.String value, java.lang.String[] validValues) {
    return (value != null) && (((validValues.length) == 0) || (org.apache.commons.lang3.ArrayUtils.contains(validValues, value)));
}