public void setHasFood(boolean hasFood) {
    this.hasFood = hasFood;
    if (hasFood) {
        this.color = java.awt.Color.GRAY;
    }else {
        this.color = java.awt.Color.BLUE;
    }
}