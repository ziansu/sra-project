@org.junit.Test
public void toStringDefaultObjectStringReturned() {
    java.lang.String defaultConfigAsString = "App title : Dueue App\n" + ((("Current log level : INFO\n" + "Preference file Location : preferences.json\n") + "Local data file location : data/dueue.xml\n") + "TaskManager name : MyTaskManager");
    org.junit.Assert.assertEquals(defaultConfigAsString, seedu.address.commons.core.Config.getStub());
}