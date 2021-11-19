public void setCurrentLoan(tk.comixloan.controller.Loan currentLoan) {
    this.currentLoan = currentLoan;
    this.putSessionVariable("currentLoan", this.currentLoan);
}