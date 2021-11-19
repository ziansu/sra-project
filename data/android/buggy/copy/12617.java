@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    java.lang.System.out.println("moveAll");
    int armyCount = gameField.get(index).getSoldiers();
    move(index, targetIndex, armyCount);
}