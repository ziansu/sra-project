@org.jbehave.core.annotations.BeforeStory
public void setup() {
    if ((com.qait.automation.jbehavedemo.stepdefs.SetupTearDownStepDef.test) == null) {
        com.qait.automation.jbehavedemo.stepdefs.SetupTearDownStepDef.test = new com.qait.automation.TestSessionInitiator();
        com.qait.automation.jbehavedemo.stepdefs.SetupTearDownStepDef.test.launchApplication(com.qait.automation.utils.YamlReader.getData("app_url"));
    }
}