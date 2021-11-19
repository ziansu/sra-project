@java.lang.Override
public void undo(org.geepawhill.contentment.core.Context context) {
    for (org.geepawhill.contentment.actor.Actor actor : actors) {
        context.add(actor);
    }
    actors.clear();
}