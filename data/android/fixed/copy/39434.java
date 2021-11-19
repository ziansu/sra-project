@javafx.fxml.FXML
public void useExpPotion() {
    if (!(expCount.getText().equals("0"))) {
        game.useItem(ItemType.EXPERIENCE);
        updateInventory();
    }
}