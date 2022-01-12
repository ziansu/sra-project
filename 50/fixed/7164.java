@org.springframework.context.annotation.Bean
public org.opensaml.util.resource.ClasspathResource classpathResource() throws org.opensaml.util.resource.ResourceException {
    return new org.opensaml.util.resource.ClasspathResource("/metadata/federationmetadata.xml");
}