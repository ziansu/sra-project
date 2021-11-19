public void decrementBorrowCount(int numberOfCopiesToReturn) {
    if ((numberOfCopiesToReturn > 0) && (((this.borrowCount) + numberOfCopiesToReturn) <= (this.numberOfCopies))) {
        this.borrowCount -= numberOfCopiesToReturn;
    }
}