public void checkForCancel() throws jloda.util.CanceledException {
    checkTimeAndShow();
    if (this.userCancelled) {
        if (closeOnCancel)
            close();
        
        throw new jloda.util.CanceledException();
    }
}