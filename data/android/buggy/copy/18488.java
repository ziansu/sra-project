public java.lang.Double getDiscountMultiplier(java.lang.Integer discountType) {
    return (this.getGuestCost()) * (discountMultiplier.get(discountType));
}