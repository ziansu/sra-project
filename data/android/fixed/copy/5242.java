public void setParams(java.lang.String params) {
    if ((this.testResult) == null) {
        this.testResult = new atr.connect.dto.TestResult();
        this.status = true;
    }
    this.testResult.setParam(params);
}