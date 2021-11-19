public void run() {
    this.compare();
    writerOne = new Writer(pathOne, firstList);
    writerOne.write();
}