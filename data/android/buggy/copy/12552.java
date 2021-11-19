@java.lang.Override
public void tick() {
    x += nx;
    y += ny;
    (time)++;
    if ((time) >= (life)) {
        remove();
    }
}