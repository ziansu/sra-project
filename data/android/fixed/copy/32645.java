@java.lang.Override
public ro.pippo.core.WebServer setPippoFilter(ro.pippo.core.PippoFilter pippoFilter) {
    super.setPippoFilter(pippoFilter);
    application = pippoFilter.getApplication();
    return this;
}