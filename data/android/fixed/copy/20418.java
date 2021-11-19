public void tap(com.badlogic.gdx.math.Vector3 screenPos, int count) {
    if (count == 1) {
        switch (state) {
            case VIEWING :
                startAiming();
                break;
            case AIMING :
                startViewing();
                break;
            default :
                break;
        }
    }
}