@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    java.lang.System.out.println("CLICKED RIGHT");
    if (availableDirections.contains(CardinalDirection.EAST)) {
        chosenDirection = shared.enums.CardinalDirection.EAST;
        MenuScreenView.modelThread.resume();
    }
}