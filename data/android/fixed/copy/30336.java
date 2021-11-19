private static void closeTheWindow() {
    StdDraw.frame.dispatchEvent(new java.awt.event.WindowEvent(StdDraw.frame, java.awt.event.WindowEvent.WINDOW_CLOSING));
}