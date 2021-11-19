protected boolean isEditable(org.unicef.rapidreg.forms.Field field) {
    return field.isMarkForMobileField() ? false : field.isEditable();
}