public boolean dispatchTouchEvent(android.view.MotionEvent event) {
    onTouchEvent(event);
    java.lang.System.out.println("AHHHHHHHHHHHHHHHHH");
    return super.dispatchTouchEvent(event);
}