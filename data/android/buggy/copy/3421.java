public void setKeyValue(java.math.BigDecimal keyValue) {
    if (keyValue != null) {
        this.keyValue = keyValue.setScale(2, java.math.BigDecimal.ROUND_HALF_DOWN);
    }
}