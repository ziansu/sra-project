@java.lang.Override
public void onResponse(org.cleantalk.app.model.RequestModel request) {
    toast_.show();
    adapter.updateItem(request);
}