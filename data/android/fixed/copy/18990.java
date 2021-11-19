public static void main(java.lang.String[] args) {
    io.brooklyn.camp.brooklyn.spi.creation.BrooklynAssemblyTemplateInstantiator.TARGET_LOCATION = "localhost";
    io.brooklyn.camp.brooklyn.YamlLauncher l = new io.brooklyn.camp.brooklyn.YamlLauncher();
    l.launchAppYaml("playing.yaml");
}