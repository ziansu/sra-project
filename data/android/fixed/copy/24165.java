public void init(org.tellervo.desktop.sample.Sample s) {
    mySample = s;
    mySample.addSampleListener(this);
    myModel = new org.tellervo.desktop.editor.UnitAwareDecadalModel(mySample);
}