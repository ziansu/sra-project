private static float getBlue(float factor) {
    float color = 0.0F;
    if ((factor > 0.15F) && (factor < 0.3F))
        color = 0.4F + ((0.38F * (factor - 0.15F)) / 0.15F);
    
    return color;
}