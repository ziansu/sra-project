private void initializeDependencyInjection() {
    mainModule = new com.devfestgrx.talks.global.di.MainModule(this);
    component = com.devfestgrx.talks.global.di.DaggerRootComponent.builder().mainModule(mainModule).build();
    component.inject(this);
}