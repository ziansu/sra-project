public void setSearchN15Isotopes(boolean searchN15Isotopes) {
    if ((searchN15Isotopes == true) & (!(isPrecursorHighResolution())))
        throw new java.lang.IllegalArgumentException("Can't search N15 isotopes in low res mode");
    
    this.searchN15Isotopes = searchN15Isotopes;
}