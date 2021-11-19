private static Models.Map.Direction rotateEnum(int i, Models.Map.Direction direction) {
    Models.Map.Direction d = direction.values()[(((direction.ordinal()) + i) % 5)];
    return d;
}