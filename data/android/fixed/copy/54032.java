public void loadState(org.clarent.ivyidea.config.model.IvyIdeaProjectSettings state) {
    com.intellij.util.xmlb.XmlSerializerUtil.copyBean(state, this.getState());
}