boolean hasEnoughResources(io.github.teamfractal.entity.enums.ResourceType type, int amount) throws io.github.teamfractal.exception.InvalidResourceTypeException {
    int resource = getResource(type);
    return amount <= resource;
}