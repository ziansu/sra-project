@com.fasterxml.jackson.annotation.JsonIgnore
public void setMyImage(android.graphics.Bitmap myImage) {
    if (myImage == null)
        setMyImage(com.example.chowdi.qremind.utils.Commons.convertBase64ToBitmap(image));
    
    this.myImage = myImage;
}