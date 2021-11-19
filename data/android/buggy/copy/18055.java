private java.lang.Integer fac(java.lang.Integer i) throws java.lang.Exception {
    if ((i > 12) || (i < 1))
        throw new java.lang.Exception("out of factorial limit");
    
    return facc(i, 1);
}