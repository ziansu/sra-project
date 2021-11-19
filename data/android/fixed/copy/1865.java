protected void addDDMFormFieldValues(java.lang.String name, java.lang.String[] values, com.liferay.dynamic.data.mapping.storage.DDMFormValues ddmFormValues) {
    for (int i = 0; i < (values.length); i++) {
        addDDMFormFieldValue(name, values[i], ddmFormValues);
    }
}