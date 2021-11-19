@java.lang.Override
public void execute() {
    Window.Location.assign(((Window.Location.getPath()) + (Window.Location.getQueryString())));
}