public void stopDefaultBehaviour() {
    this.getCurrentActivity().setDefault(false);
    this.requestActivityFinish(this.getCurrentActivity());
}