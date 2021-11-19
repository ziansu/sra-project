public void updateListView(java.util.ArrayList<br.edu.ufcg.analytics.meliorbusao.models.SumarioRota> rotas, int typeOfOrder) {
    mBusEvalExpandableAdapter = new br.edu.ufcg.analytics.meliorbusao.adapters.RouteEvaluationExpandableAdapter(getActivity(), generateRouteSummaries(), mRecyclerView, mCallback);
    mRecyclerView.setAdapter(mBusEvalExpandableAdapter);
}