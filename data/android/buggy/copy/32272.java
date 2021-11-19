public void setUserID(java.lang.String value) {
    value = java.lang.String.valueOf(this.getBank().getNextID());
    java.lang.String oldValue = this.UserID;
    this.UserID = value;
    this.firePropertyChange(User.PROPERTY_USERID, oldValue, value);
}