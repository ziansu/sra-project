@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends Game.PlayerTurn> observable, Game.PlayerTurn oldValue, Game.PlayerTurn newValue) {
    moveDescription.setText(newValue.getTurnString());
}