public void setExpiresIn(java.lang.Long expiresIn) {
    this.expiresIn = expiresIn;
    expiresAt = (expiresIn != null) ? (expiresIn * 1000) + (LiSystemClock.INSTANCE.getCurrentTimeMillis()) : null;
}