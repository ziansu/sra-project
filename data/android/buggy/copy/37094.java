@java.lang.Override
public boolean touchUp(int screenX, int screenY, int pointer, int button) {
    java.lang.System.out.println(((("TouchUp: x=" + screenX) + ", y=") + screenY));
    slasher.setFinger(null);
    return true;
}