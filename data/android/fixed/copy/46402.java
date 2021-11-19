public com.realexpayments.remote.sdk.domain.Card addCvn(java.lang.String cvn) {
    if (null == (this.cvn)) {
        this.cvn = new com.realexpayments.remote.sdk.domain.Cvn().addNumber(cvn);
    }else {
        this.cvn.addNumber(cvn);
    }
    return this;
}