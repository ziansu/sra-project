public java.math.BigDecimal getValue() {
    if (this.getText().isEmpty())
        return null;
    
    return new java.math.BigDecimal(this.getText());
}