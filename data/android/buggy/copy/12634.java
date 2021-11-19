public void setStaticMarks(java.util.List<com.onlylemi.mapview.library.graphics.BaseMark> marks) {
    java.util.Collections.copy(this.markObjects, marks);
    if (!(proxMarks.isEmpty()))
        this.markObjects.addAll(proxMarks);
    
}