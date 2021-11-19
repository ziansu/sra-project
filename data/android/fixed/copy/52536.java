private void getThread(java.lang.String threadNo, java.lang.String boardName) {
    if ((getActivity()) != null) {
        getThreadJson(getActivity(), boardName, threadNo);
    }
}