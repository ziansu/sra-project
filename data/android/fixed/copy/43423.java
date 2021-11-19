@java.lang.Override
protected void endPass(int n) {
    super.endPass(n);
    if (n == (com.badlogic.gdx.tests.g3d.shadows.system.FirstPassBaseShadowSystem.FIRST_PASS))
        endPass1();
    
}