boolean pixelWithinArea(com.example.m.divis.Shape s, android.graphics.Point px) {
    if (s == null)
        return false;
    
    return pixelWithinArea(s.center, s.radius, px);
}