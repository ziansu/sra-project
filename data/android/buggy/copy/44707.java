public void deleteBonus() {
    deleteArray(foodInBonus);
    matrix[xFood][yFood].setBackground(this.instanceGame.getBackgroundGame());
    matrix[xFood][yFood].setIcon(null);
    createFood();
}