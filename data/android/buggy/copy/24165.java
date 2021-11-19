public void init(org.tellervo.desktop.sample.Sample s, org.tellervo.desktop.editor.AbstractEditor e) {
    mySample = s;
    mySample.addSampleListener(this);
    this.e = e;
    myModel = new org.tellervo.desktop.editor.UnitAwareDecadalModel(mySample);
}