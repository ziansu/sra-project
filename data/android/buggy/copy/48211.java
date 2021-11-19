public void setDescription(java.lang.String description) {
    if ((description.equals("")) || (description.equals(" ")))
        throw new java.lang.IllegalArgumentException("Description cannot be blank!");
    
    this.myDescription = description;
}