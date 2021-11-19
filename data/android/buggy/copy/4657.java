@java.lang.Override
public boolean isTagged() {
    return entity.get(Keys.DISPLAY_NAME).orElse(Text.EMPTY).isEmpty();
}