public boolean isExpired() {
    return expiryDate.after(new java.util.Date());
}