@org.junit.Test
public void resolveSampleTemplate() throws java.lang.Exception {
    java.net.URL url = this.configurer.resolveTemplate(getClass().getClassLoader(), ((org.springframework.web.reactive.result.view.groovy.GroovyMarkupConfigurerTests.TEMPLATE_PREFIX) + "test.tpl"));
    org.junit.Assert.assertNotNull(url);
}