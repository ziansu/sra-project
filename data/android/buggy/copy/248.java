public void updatePassword(cdio3.shared.OperatoerDTO operatingOperator) {
    this.operatingOperator = operatingOperator;
    this.serviceClientImpl.updatePassword(this.operatingOperator);
}