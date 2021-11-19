void setScaleType(@org.vovkasm.WebImage.WebImageView.ScaleType
int scaleType) {
    if ((this.scaleType) == scaleType)
        return ;
    
    this.scaleType = scaleType;
    dirty = true;
}