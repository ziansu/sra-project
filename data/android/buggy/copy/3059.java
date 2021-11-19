public itinerary.main.State clearAll() {
    itinerary.main.Command clearCommand = new itinerary.main.Command(null, CommandType.CLEAR);
    java.util.List<itinerary.main.Task> allTasks = getAllTasks();
    return new itinerary.main.State(clearCommand, clearCommand, allTasks, true);
}