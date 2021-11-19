public void removeField(int position) {
    if ((numberFields) > (inputs.Input.MIN_FIELDS)) {
        (numberFields)--;
        this.removedField = position;
        this.updateInputPanel(false);
    }
}