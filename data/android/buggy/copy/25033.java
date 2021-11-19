private void prepareAdapter(android.view.View rootView) {
    adapter = new org.upv.ccupeiro.contadroid.main.view.adapter.MainCardAdapter(mockListCards());
    rvPaidExpenses.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    rvPaidExpenses.setAdapter(adapter);
}