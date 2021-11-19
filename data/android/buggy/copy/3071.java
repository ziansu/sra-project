private void completeSignInProcess(boolean finish) {
    this.loginRequest_ = null;
    this.hideProgress();
    if (finish)
        this.onLoginFragmentListener_.onLoginComplete(this);
    
}