public void run() {
    this.compare();
    writerOne = new Writer(pathOne, firstList);
    writerOne.write();
    writerTwo = new Writer(pathTwo, secondList);
    writerTwo.write();
}