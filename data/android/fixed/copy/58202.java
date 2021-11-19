public void resetAndProcessLoan() {
    isProcessed = false;
    this.adjustedPrinciple = this.loanAmount;
    processLoan();
}