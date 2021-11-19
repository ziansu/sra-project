@org.springframework.context.annotation.Bean
public org.thymeleaf.spring4.SpringTemplateEngine templateEngine() {
    org.thymeleaf.spring4.SpringTemplateEngine templateEngine = new org.thymeleaf.spring4.SpringTemplateEngine();
    templateEngine.setTemplateResolver(templateResolver());
    templateEngine.setEnableSpringELCompiler(true);
    templateEngine.addDialect("shiro", new at.pollux.thymeleaf.shiro.dialect.ShiroDialect());
    return templateEngine;
}