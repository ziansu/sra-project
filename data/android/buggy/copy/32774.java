public void setAdditiveToChoose(foodselector.domain.DishAdditive additiveToChoose) {
    this.additiveToChoose = additiveToChoose;
    if ((pickedAdditive) instanceof foodselector.domain.Potato) {
        setPickedAdditive(additiveToChoose);
    }
}