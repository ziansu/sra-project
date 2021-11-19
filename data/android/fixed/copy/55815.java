private int getFreePointer() {
    for (int i = 0; i < (touchDown.length); i++) {
        if ((touchDown[i]) == null)
            return i;
        
    }
    throw new com.badlogic.gdx.utils.GdxRuntimeException("Couldn't find free pointer id!");
}