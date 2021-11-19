public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    super.createHeaders("Milestones in:", ("Project: " + (this.mCallbacks.getSelectedProject().getName())));
    createAdapter();
}