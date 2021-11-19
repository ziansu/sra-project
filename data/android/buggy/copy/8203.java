@java.lang.Override
public void removeSociety(model.societies.Society society) {
    societies.remove(society);
    societiesMap.remove(society.getName());
}