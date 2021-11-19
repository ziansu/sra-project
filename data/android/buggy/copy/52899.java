private void assignIndexForFields(java.util.List<org.unicef.rapidreg.forms.childcase.CaseField> fields, int index) {
    android.util.Log.i("sjyuan", ("assignIndexForFields index= " + index));
    for (org.unicef.rapidreg.forms.childcase.CaseField field : fields) {
        field.setIndex(index);
    }
}