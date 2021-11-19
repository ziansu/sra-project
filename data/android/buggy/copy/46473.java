public void discuss(java.lang.String text) {
    if (currentDiscussion.equals("")) {
        currentDiscussion = text;
    }else {
        currentDiscussion = ((currentDiscussion) + "\n") + text;
    }
}