public static void clear() {
    if ((ru.casak.whiteboard.DrawView.canvasDraw) != null)
        ru.casak.whiteboard.DrawView.canvasDraw.drawRGB(255, 255, 255);
    
    if ((ru.casak.whiteboard.DrawView.instance) != null)
        ru.casak.whiteboard.DrawView.instance.invalidate();
    
}