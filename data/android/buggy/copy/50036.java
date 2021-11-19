public void setSize(int width, int heigth) {
    writer.println(heigth);
    writer.println(width);
    this.widht = width;
    this.height = heigth;
    fileSizeSet = true;
}