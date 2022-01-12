public void doSelectComputer(int num) {
    this.computerNum = num;
    this.computerGateway.find(getComputerNum(), getLaboratory());
}