public void unselectCurrentSelectedPixel() {
    if ((currentPixelSelection) == null)
        return ;
    
    undoPixelSelection(currentPixelSelection);
    imageListener.onPixelUnselected();
    currentPixelSelection = null;
}