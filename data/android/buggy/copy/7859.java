@org.junit.Before
public void setUp() throws java.lang.Exception {
    options.put(Constants.OPT_COLLECTION_NAME, "govdocs");
    options.put(Constants.CNF_DROOLS_PATH, "/Users/artur/rnd/git/c3po/c3po-core/src/main/resources/rules");
    com.petpet.c3po.utils.Configurator.getDefaultConfigurator().configure();
    ctrl = new com.petpet.c3po.controller.Controller(com.petpet.c3po.utils.Configurator.getDefaultConfigurator());
}