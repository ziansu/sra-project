@java.lang.Override
public float getWidth() {
    return (getBBox()) == null ? 0 : (getBBox().getAsNumber(2).floatValue()) - (getBBox().getAsNumber(0).floatValue());
}