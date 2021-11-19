public synchronized void setSourceState(int sourceID, int state) {
    for (cz.brmlab.yodaqa.flow.dashboard.AnswerSource as : sources) {
        if ((as.getSourceID()) == sourceID) {
            as.setState(state);
            (gen_sources)++;
            return ;
        }
    }
}