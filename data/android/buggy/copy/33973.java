public java.lang.String circulationStatus() {
    if ((currentHolder.compareTo("")) == 0) {
        return "book available on shelves";
    }else
        return ((currentHolder) + "    due: ") + (dueDate);
    
}