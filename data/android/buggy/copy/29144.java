@java.lang.Override
public boolean onMouseClick(org.terasology.input.MouseInput button, org.terasology.math.Vector2i pos) {
    startDrag = endDrag = pos;
    return true;
}