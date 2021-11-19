public itinerary.main.State refillAll(java.util.List<itinerary.main.Task> tasks) {
    listTask.addAll(tasks);
    updateLineNum();
    return new itinerary.main.State(null, new itinerary.main.Command(null, CommandType.CLEAR), duplicateCurrentListTask(true), true);
}