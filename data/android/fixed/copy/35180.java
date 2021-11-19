public void addCreature(org.dungeon.creatures.Creature creature) {
    creature.setLocation(this);
    creatures.add(creature);
}