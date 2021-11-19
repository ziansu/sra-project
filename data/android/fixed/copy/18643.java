@java.lang.Override
public boolean isUseless() {
    return ((id) != null) && (getBoolean(((id) + (KEY_USELESS)), false));
}