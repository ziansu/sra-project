public java.lang.String message() {
    if ((this.message) != null) {
        return this.message;
    }else {
        return this.errorCode.message();
    }
}