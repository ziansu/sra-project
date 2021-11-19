@java.lang.Override
public final void close() {
    if (ctx.channel().isOpen())
        ctx.close();
    
    actor.die(null);
}