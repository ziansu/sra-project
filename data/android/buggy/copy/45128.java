private void fetchPrescriptions() {
    ng.softworks.unorthodox.medstrackr.Helpers.PrescriptionsDBHelper dbHelper = ng.softworks.unorthodox.medstrackr.Helpers.PrescriptionsDBHelper.getInstance(this.getActivity());
    pList = dbHelper.getAllPrescriptions();
    pAdapter.notifyDataSetChanged();
}