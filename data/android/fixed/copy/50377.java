@java.lang.Override
public void initialize(io.dropwizard.setup.Bootstrap<uk.gov.register.presentation.config.PresentationConfiguration> bootstrap) {
    bootstrap.addBundle(new io.dropwizard.views.ViewBundle(com.google.common.collect.ImmutableList.of(new thymeleaf.ThymeleafViewRenderer())));
    bootstrap.addBundle(new io.dropwizard.assets.AssetsBundle("/assets"));
}