@java.lang.Override
protected void writeChecked(java.lang.Object anEnum, com.fasterxml.jackson.core.JsonGenerator jacksonGenerator) throws java.io.IOException {
    jacksonGenerator.writeString(anEnum.toString());
}