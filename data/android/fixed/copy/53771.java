@org.junit.Test
public void reflectOn2() throws java.lang.Exception {
    de.beuth.cg1.dogeraytracer.vecmatlib.Vector3 resV = v8.reflectOn(n1);
    assertEquals(new de.beuth.cg1.dogeraytracer.vecmatlib.Vector3(0.707, (-0.707), 0.0), resV);
}