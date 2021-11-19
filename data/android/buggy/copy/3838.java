@java.lang.Override
public void createSketch() {
    processing.core.PApplet sketch = new devel.android_everything_test.WallpaperSketch();
    java.lang.System.out.println(("created sketch " + sketch));
    setSketch(sketch);
}