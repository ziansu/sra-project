public void removeMoney(int money) {
    if ((this.money) >= money) {
        this.money -= money;
        MysticalAdventure.GAME.frame.getMoneyLabel().setText(((this.money) + ""));
    }
}