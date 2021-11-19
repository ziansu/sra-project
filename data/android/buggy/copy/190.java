public static void main(java.lang.String[] args) {
    org.springframework.context.ConfigurableApplicationContext configurableApplicationContext = com.nanuvem.metagui.server.MetaGuiEntryPoint.run(args);
    com.nanuvem.metagui.server.MetaGuiEntryPoint.initDB(configurableApplicationContext);
}