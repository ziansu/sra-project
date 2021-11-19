public java.lang.String getBrief() {
    if ((story.length()) < (bLeng)) {
        return story;
    }else {
        return (story.substring(0, bLeng)) + " ...";
    }
}