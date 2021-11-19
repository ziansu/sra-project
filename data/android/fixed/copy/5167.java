private void _setAdapter(java.util.ArrayList<com.qi.xiaohui.dingdang.model.table.Result> results) {
    mNewsAdapter = new com.qi.xiaohui.dingdang.adapter.NewsAdapter(results, getContext(), getActivity());
    mRecycleView.setAdapter(mNewsAdapter);
}