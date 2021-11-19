@java.lang.Override
public void destroy(org.apache.wicket.Application application) {
    ru.ydn.wicket.wicketconsole.ScriptExecutorHolder.get(application).destroy(application);
}