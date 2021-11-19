public java.util.List<java.lang.String> taskHead(int taskIndex) {
    return notYetCommittedTaskUUIDs.subList(0, (taskIndex + 1));
}