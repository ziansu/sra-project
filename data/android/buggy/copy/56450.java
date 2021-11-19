void setOneTypeOfHeroOnly() {
    if ((Items.Item.generateRandomNumber()) > 95) {
        oneTypeOfHeroOnly = true;
        setWhichTypeOfHeroOnly();
    }
}