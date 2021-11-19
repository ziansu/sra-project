@java.lang.Override
public void onSuccess(java.lang.String result) {
    java.lang.System.out.println(("replace::" + result));
    Window.Location.replace(result);
}