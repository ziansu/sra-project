protected void resumeFeedbackAndGraph() {
    android.util.Log.d("GRAPH_LIFE", "RESUME_GRAPH");
    graphFragment.resumeReceivingData();
    feedback.resumeRecievingData();
}