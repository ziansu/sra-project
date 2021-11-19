@org.junit.Test(expected = javax.validation.ValidationException.class)
public void nameWithInvalidCharactersThrowsAValidationException() throws java.lang.Exception {
    testObject.processInput(new java.lang.String[]{  }, new java.lang.String[]{  }, "wibble%", "local", "wibble", "gradle");
}