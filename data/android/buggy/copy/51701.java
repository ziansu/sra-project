public void markReturned() {
    isLoanedOut = false;
    if ((loaneeUser) != null) {
        loaneeUser.notifyBookReturned(this);
    }
    if (!(isLoanedOut))
        loaneeUser = null;
    
}