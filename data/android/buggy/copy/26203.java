public android.graphics.Paint currentStyle() {
    if (shouldErase) {
        return milespeele.canvas.paint.PaintStyles.eraserPaint(currentBackgroundColor, milespeele.canvas.view.ViewCanvas.STROKE_WIDTH);
    }else {
        shouldRedraw = false;
        return new android.graphics.Paint(curPaint);
    }
}