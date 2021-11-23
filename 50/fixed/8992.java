public void addOwner(mff.mapGenereator.Room owner) {
    if ((owner != null) && (!(owners.contains(owner)))) {
        owners.add(owner);
    }
}