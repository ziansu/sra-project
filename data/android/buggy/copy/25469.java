@org.junit.Before
public void before() throws java.io.IOException {
    java.io.File propfile = mil.nga.giat.geowave.core.cli.operations.config.options.ConfigOptions.getDefaultPropertyFile();
    if (propfile.exists()) {
        propfile.delete();
        propfile.createNewFile();
    }
}