@org.junit.Test
public void a_template_does_create_per_default_a_content_transformer_factory_which_does_create_a_transformer() {
    java.util.Properties p = new java.util.Properties();
    templateToTest = new de.jcup.egradle.template.FileStructureTemplate("name", contentRootFolder, "description");
    assertNotNull(templateToTest.contentTransformerFactory);
    de.jcup.egradle.template.TemplateContentTransformer transformer = templateToTest.contentTransformerFactory.createTemplateContentTransformer(p);
    assertNotNull(transformer);
}