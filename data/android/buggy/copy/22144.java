private void setHelp() {
    java.lang.String help = org.roda.rodain.core.ConfigurationManager.getHelpFile();
    webView.getEngine().load(org.roda.rodain.core.ConfigurationManager.getHelpFile());
}