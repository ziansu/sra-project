public android.graphics.Rect draw(android.graphics.Canvas canvas) {
    android.graphics.Rect srcRect = getSrcRect();
    if ((mScrRect) != null)
        canvas.drawBitmap(bm, srcRect, mScrRect, null);
    
    return mScrRect;
}