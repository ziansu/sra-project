@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    for (com.blockhalde.input.VirtualController virtualController : controllers) {
        virtualController.touchDown(screenX, screenY, button);
    }
    return true;
}