private void setFinishTime() throws Model.UnchangeableException {
    if (changeFlag) {
        this.finishTime = new java.util.Date();
    }else {
        throw new Model.UnchangeableException("Manipulation already finished.");
    }
}