public void setIndices(java.util.ArrayList<java.lang.String> indices) throws java.lang.Exception {
    if ((indices.size()) == 5)
        this.indices = indices;
    else
        throw new java.lang.Exception("Il manque des indices");
    
}