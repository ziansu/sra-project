@org.kohsuke.stapler.DataBoundSetter
public void setParserName(java.lang.String parserName) {
    this.parserName = (parserName == null) ? "HTML" : parserName;
    this.markupParser = org.korosoft.jenkins.plugin.rtp.pipeline.RichTextPublisherStep.DescriptorImpl.markupParsers.get(parserName);
}