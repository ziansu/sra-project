private void refreshQuantity() {
    minusButton.setAbled(((availableQuantity) > 1));
    plusButton.setAbled(((availableQuantity) < (hotelRoom.totalQuantity)));
    availableQuantityLabel.setText(((availableQuantity) + ""));
}