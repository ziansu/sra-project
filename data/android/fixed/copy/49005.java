public void registerExtensions() {
    org.asciidoctor.extension.JavaExtensionRegistry extensionRegistry = asciidoctor.javaExtensionRegistry();
    extensionRegistry.block("tabs", com.mulesoft.documentation.builder.TabProcessor.class);
}