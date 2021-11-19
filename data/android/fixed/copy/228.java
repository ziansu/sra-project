private void initializeInjector() {
    this.activityComponent = getApplicationComponent().plus(new cat.xlagunas.andrtc.di.modules.ActivityModule(this));
    activityComponent.inject(this);
}