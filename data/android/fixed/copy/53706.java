public itinerary.main.UserInterfaceContent executeUserInput(java.lang.String userInput) {
    itinerary.main.Task task = new itinerary.main.Task(1, "Test", null, false, false);
    itinerary.main.Command userCommand = new itinerary.main.Command(task, CommandType.ADD, null);
    return determineActions(userCommand, userInput);
}