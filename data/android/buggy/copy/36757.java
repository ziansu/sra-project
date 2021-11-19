private void enableHeartRateAxis(java.lang.Boolean on) {
    if (!on) {
        bpmDescription.setVisibility(View.INVISIBLE);
    }else {
        bpmDescription.setVisibility(View.VISIBLE);
    }
}