private void fromXML(java.lang.String xmlFileName) {
    fntd.io.ReadXML optionXML = new fntd.io.ReadXML(xmlFileName);
    this.runOptions = new fntd.options.RunOptions(optionXML);
    this.correctionOptions = new fntd.options.CorrectionOptions(optionXML);
}