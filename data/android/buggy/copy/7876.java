@java.lang.Override
public void run() {
    if (isFireHeldDown) {
        if (!(shootLaser())) {
            isFireHeldDown = false;
        }
    }else
        if (!(isFireHeldDown)) {
            cancel();
        }
    
}