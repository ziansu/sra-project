private void checkValidDefaultValue(java.lang.String name, java.lang.String[] validValues, java.lang.String defaultValue) {
    if (!(isValid(defaultValue, validValues))) {
        throw new java.lang.IllegalArgumentException(((("The default value '" + defaultValue) + "' is not valid for argument ") + name));
    }
}