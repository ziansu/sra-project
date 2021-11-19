public boolean dateAnswer(com.rr.rgem.gem.models.ConversationNode.AnswerNode answer, java.lang.String response) {
    getState().setState(JSONState.State.Correct);
    getState().sendChallenges(activity, ("You gave the date: " + response));
    return true;
}