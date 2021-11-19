public void save(com.triadsoft.properties.model.PropertiesFile template) throws java.io.IOException, org.eclipse.core.runtime.CoreException {
    storeFile(template.getFile(), file, null, false);
}