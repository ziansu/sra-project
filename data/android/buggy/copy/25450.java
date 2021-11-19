@java.lang.Override
public final void close(java.lang.Throwable t) {
    if ((actor) != null)
        actor.die(t);
    
    close();
}