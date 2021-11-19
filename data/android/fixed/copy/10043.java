public itinerary.main.State addTask(itinerary.main.Command command) {
    return new itinerary.main.State(command, new itinerary.main.Command(command.getTask(), CommandType.DELETE, null), null, true);
}