public Model.GameObject.Item.Obstacle addObstacle(java.lang.String name, java.lang.String description, int x, int y) {
    id = ItemEnum.OBSTACLE;
    location = new Model.Location(x, y);
    return new Model.GameObject.Item.Obstacle(id, name, description, location);
}