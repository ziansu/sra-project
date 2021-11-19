public java.lang.String getTemplate(de.hhu.propra16.avaders.logik.Step mode) {
    switch (mode) {
        case TEST_REFACTOR :
        case RED :
            return testTemplate;
        case CODE_REFACTOR :
        case GREEN :
            return classTemplate;
        default :
            java.lang.System.err.println("SubTask.getTemplate(...) called out of Red and Green-phase!");
            throw new java.lang.RuntimeException();
    }
}