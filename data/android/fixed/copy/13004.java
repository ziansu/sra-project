public void setRed(int red) {
    if (red < 0) {
        this.red = 0;
    }else
        if (red > 255) {
            this.red = 255;
        }else {
            this.red = red;
        }
    
}