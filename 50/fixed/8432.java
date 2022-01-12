@org.junit.Before
public void setUp() throws java.lang.Exception {
    test.TestEditTaskCommand.storageControllerInstance = storage.api.StorageController.getInstance();
    test.TestEditTaskCommand.testTaskList = repopulateTask();
    test.TestEditTaskCommand.taskControllerInstance = task.api.TaskController.getInstance();
    test.TestEditTaskCommand.commandParserInstance = new parser.api.CommandParser();
}