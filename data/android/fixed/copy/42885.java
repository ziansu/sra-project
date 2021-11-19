public void switchScene(int delta) {
    currentView += delta;
    currentView = java.lang.Math.max(0, currentView);
    currentView = java.lang.Math.min(9, currentView);
    fillGraph(null, new java.util.ArrayList<>());
}