public boolean passwordAnswer(com.rr.rgem.gem.models.ConversationNode.AnswerNode answer, java.lang.String response) {
    getState().setState(JSONState.State.Correct);
    getState().sendChallenges(activity, "Saved");
    return true;
}