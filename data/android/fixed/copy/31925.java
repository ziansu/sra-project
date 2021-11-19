public void checkout(User u, org.joda.time.LocalDate dateOfLoan) {
    loaneeUser = u;
    isLoanedOut = true;
    loanedOutDate = dateOfLoan;
}