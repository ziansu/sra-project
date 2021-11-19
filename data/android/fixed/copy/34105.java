public void setPdf(byte[] pdf) {
    if (pdf == null) {
        this.pdf = null;
    }else {
        this.pdf = pdf.clone();
    }
}