@java.lang.Override
public boolean log(java.util.logging.Level level, java.lang.String message) {
    log(((("[" + (level.getLocalizedName())) + "] ") + message));
    return !(open);
}