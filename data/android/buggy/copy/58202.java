public void resetAndProcessLoan() {
    isProcessed = false;
    this.term = term;
    this.rate = rate;
    this.adjustedPrinciple = this.loanAmount;
    processLoan();
}