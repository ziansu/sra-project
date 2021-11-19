@java.lang.SuppressWarnings(value = "unchecked")
public boolean getIsAirProject() {
    return (getDependency(groupId(net.flexmojos.oss.plugin.AbstractMavenMojo.AIR_GROUP_ID), artifactId(net.flexmojos.oss.plugin.AbstractMavenMojo.AIR_GLOBAL), type(net.flexmojos.oss.plugin.SWC))) != null;
}