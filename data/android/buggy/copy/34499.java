@java.lang.Override
public final void close(java.lang.Throwable t) {
    co.paralleluniverse.comsat.webactors.netty.WebActorHandler.log.error("Exception while closing HTTP adapter", t);
    if ((actor) != null)
        actor.die(t);
    
}