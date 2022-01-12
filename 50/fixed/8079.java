public void setPrice(java.math.BigDecimal price) {
    this.price = price.setScale(2, java.math.RoundingMode.CEILING);
}