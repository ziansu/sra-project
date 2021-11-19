private void createOpponentsList(java.util.List<java.lang.Integer> opponents) {
    if ((opponents.size()) != 0) {
        for (java.lang.Integer i : opponents) {
            addOpponentPreviewToList(i, com.quickblox.sample.videochatwebrtcnew.fragments.ConversationFragment.opponentsFromCall);
        }
    }
}