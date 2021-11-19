private void drawList() {
    this.adapter = new ch.hgdev.toposuite.calculation.activities.axisimpl.ArrayListOfMeasuresAdapter(this, R.layout.axis_implantation_list_item, this.axisImpl.getMeasures());
    this.measuresListView.setAdapter(this.adapter);
}