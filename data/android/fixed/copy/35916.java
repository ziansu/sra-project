public void setBase(model.Base newBase) {
    base = newBase;
    processEvent(new java.awt.event.ActionEvent(this, java.awt.event.ActionEvent.ACTION_PERFORMED, "changed base"));
}