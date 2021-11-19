public static void appendSubtask(org.framework.core.runtime.Subtask task) {
    org.framework.core.runtime.TestLogger.tests.get(((org.framework.core.runtime.TestLogger.tests.size()) - 1)).addTask(task);
}