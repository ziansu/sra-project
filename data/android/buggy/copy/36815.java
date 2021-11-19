private void drawList() {
    this.adapter = new android.widget.ArrayAdapter<ch.hgdev.toposuite.points.Point>(this, R.layout.history_list_item, new java.util.ArrayList(this.orthoImpl.getMeasures()));
    this.measuresListView.setAdapter(this.adapter);
}