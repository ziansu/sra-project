public void enableTexCoordPointer() {
    if ((texCoordID) != (-1))
        enableVertexPointer(texCoordID);
    
    glUniform1i(enableTextureID, 1);
}