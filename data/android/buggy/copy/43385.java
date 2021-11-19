@java.lang.Override
public void evaluate() throws java.lang.Throwable {
    de.czyrux.store.toolbox.idlingresource.RxIdlingResource rxIdlingResource = new de.czyrux.store.toolbox.idlingresource.RxIdlingResource();
    android.support.test.espresso.Espresso.registerIdlingResources(rxIdlingResource);
    io.reactivex.plugins.RxJavaPlugins.setScheduleHandler(rxIdlingResource);
    base.evaluate();
    android.support.test.espresso.Espresso.unregisterIdlingResources(rxIdlingResource);
}