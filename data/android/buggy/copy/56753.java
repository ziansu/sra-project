public java.util.List<java.lang.String> taskHead(int taskIndex) {
    java.lang.System.out.println(("Filtering from 0 to " + taskIndex));
    return notYetCommittedTaskUUIDs.subList(0, (taskIndex + 1));
}