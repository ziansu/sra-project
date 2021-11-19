@java.lang.Override
public boolean touchUp(int screenX, int screenY, int pointer, int button) {
    com.elementaonline.Elementa.debug("Screen main touchUp");
    if (clicked) {
        clicked = false;
        return true;
    }else {
        return false;
    }
}