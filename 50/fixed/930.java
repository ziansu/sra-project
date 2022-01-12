private java.text.DateFormat getFormat() {
    return (this.format.get()) != null ? this.format.get() : createDateFormat();
}