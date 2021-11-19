public boolean isChecked(com.example.nicco.inspectionReviewManager.DatabaseWriter.UIComponentInputValue key) {
    java.lang.String value = getValue(key);
    return (value != null) && (value.equals(com.example.nicco.inspectionReviewManager.Model.SpecialValue.YES.toString()));
}