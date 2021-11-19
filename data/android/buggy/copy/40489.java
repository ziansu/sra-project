@java.lang.Override
public void invoke(long window, double xoffset, double yoffset) {
    inputs.add(new fr.delthas.javaui.Window.ScrollInput(java.lang.System.nanoTime(), (-((int) (yoffset)))));
}