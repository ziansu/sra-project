@java.lang.Override
public void addFormatters(org.springframework.format.FormatterRegistry registry) {
    registry.addConverter(roleToUserProfileConverter);
}