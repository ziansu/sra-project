@java.lang.Override
public java.lang.String getDisplayedTitle() {
    switch (getType()) {
        case COMMENT_TYPE :
            return text;
        default :
            return title;
    }
}