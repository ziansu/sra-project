public void addEntity(me.grantammons.rogueEngine.core.entities.AnimatedEntity e) {
    java.lang.System.out.println(("Adding entity " + e));
    repeat.add(e);
    queue.add(e, e.getSpeed());
}