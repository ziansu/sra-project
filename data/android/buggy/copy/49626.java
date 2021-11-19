public void setDefaultSelector(android.graphics.drawable.Drawable d) {
    mDefaultBackground = d;
    if (!(mStacked))
        setStacked(true, true);
    
}