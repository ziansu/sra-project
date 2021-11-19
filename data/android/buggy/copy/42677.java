public void write() {
    for (int i = 0; i < (this.reg.length); i++)
        this.setBufferRow(i, this.reg[i]);
    
    this.writeDisplay();
}