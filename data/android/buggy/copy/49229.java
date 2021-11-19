@java.lang.Override
public void setSize(int w, int h) {
    deprecationWarning("setSize");
    surface.setLocation(w, h);
}