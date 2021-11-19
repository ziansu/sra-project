private void setInnerSortingLayer(float value) {
    if (value < 0)
        value = 0;
    
    if (value > 0.95F)
        value = 0.95F;
    
    _innerSortingLayer = value;
}