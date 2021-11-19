public void run(android.view.View view) {
    wireController.redrawWires();
    circuitController.run(this);
    ((android.widget.GridView) (findViewById(R.id.circuit))).invalidateViews();
    checkScenarioComplete();
}