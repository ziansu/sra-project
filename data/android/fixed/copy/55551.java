@java.lang.Override
public boolean remove() {
    if (pointer.remove()) {
        CardGame.instance.getTriggers().trigger(Triggers.EXIT_CREATURE_FILTER, this);
        return true;
    }else
        return false;
    
}