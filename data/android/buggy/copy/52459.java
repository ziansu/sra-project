@java.lang.Override
public void configurePathMatch(org.springframework.web.servlet.config.annotation.PathMatchConfigurer matcher) {
    com.vincent.SSHProject.configuration.AppConfig.logger.info("AppConfig - configurePathMatch");
    matcher.setUseRegisteredSuffixPatternMatch(true);
}