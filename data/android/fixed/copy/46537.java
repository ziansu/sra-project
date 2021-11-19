private void setDonePrinting(boolean donePrinting) {
    this.donePrinting = donePrinting;
    this.copies = -1;
    this.notifyBrowser("qzDonePrinting");
}