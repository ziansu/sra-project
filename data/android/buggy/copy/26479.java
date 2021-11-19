public static final <T extends ch.njol.skript.log.LogHandler> T startLogHandler(final T h) {
    ch.njol.skript.log.SkriptLogger.handlers.add(h);
    return h;
}