@java.lang.Override
public java.lang.String getDisplayedTitle() {
    switch (getType()) {
        case COMMENT_TYPE :
            return text;
        case JOB_TYPE :
        case STORY_TYPE :
        case POLL_TYPE :
        default :
            return title;
    }
}