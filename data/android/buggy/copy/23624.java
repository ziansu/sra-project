public void setStartTime() {
    if ((this.testResult) == null) {
        this.testResult = new atr.connect.dto.TestResult();
    }
    this.testResult.setStart(new java.util.Date());
}