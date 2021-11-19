@java.lang.Override
public void draw(android.graphics.Canvas canvas) {
    if ((count) != (-1)) {
        canvas.restore();
    }else {
        canvas.restoreToCount(count);
    }
}