public java.lang.String getFullTitle() {
    if ((fulltitle) == null) {
        fulltitle = ((subtitle.length()) > 0) ? ((title) + " ") + (subtitle) : title;
    }
    return fulltitle;
}