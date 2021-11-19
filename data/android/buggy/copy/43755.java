public void GenerateObject(control.Position objectPos) {
    control.Food_Drink newItem = new control.Food_Drink(objectPos.x, Position.screenHeight, new control.Food_Drink().RandomType());
    this.currGameState.addFallingObjects(newItem);
}