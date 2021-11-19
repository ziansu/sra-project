public static void main(java.lang.String[] args) {
    org.projectforge.start.ProjectForgeApplication.initLogging();
    java.util.TimeZone.setDefault(DateHelper.UTC);
    new org.springframework.boot.builder.SpringApplicationBuilder().sources(org.projectforge.start.ProjectForgeApplication.class).run(args);
}