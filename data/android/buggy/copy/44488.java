@org.testng.annotations.Test(expectedExceptions = com.yahoo.sketches.SketchesArgumentException.class)
public void checkUpdateException() {
    com.yahoo.sketches.frequencies.ItemsSketch<java.lang.Long> sk1 = new com.yahoo.sketches.frequencies.ItemsSketch<java.lang.Long>((1 << (com.yahoo.sketches.frequencies.Util.LG_MIN_MAP_SIZE)));
    sk1.update(java.lang.Long.valueOf(1), (-1));
}