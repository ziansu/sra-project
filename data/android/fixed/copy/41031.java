public java.lang.Integer getWeight() {
    java.lang.String value = score.getText();
    return value.isEmpty() ? null : java.lang.Integer.valueOf(value);
}