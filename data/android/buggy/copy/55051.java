protected void addDDMFormFieldValue(java.lang.String name, java.lang.Object value, com.liferay.dynamic.data.mapping.storage.DDMFormValues ddmFormValues) {
    com.liferay.dynamic.data.mapping.storage.DDMFormFieldValue ddmFormFieldValue = createDDMFormFieldValue(name);
    setDDMFormFieldValueLocalizedValue(java.lang.String.valueOf(value), ddmFormFieldValue);
    ddmFormValues.addDDMFormFieldValue(ddmFormFieldValue);
}