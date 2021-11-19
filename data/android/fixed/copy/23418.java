@java.lang.Override
public void run() {
    if (((width) != 0) && ((height) != 0)) {
        draw(width, height);
        setImageBitmap(generatedCaptcha.getBitmap());
    }
}