private boolean isValid(java.lang.String value, java.lang.String[] validValues) {
    return ((validValues.length) == 0) || ((value != null) && (org.apache.commons.lang3.ArrayUtils.contains(validValues, value)));
}