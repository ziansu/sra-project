@java.lang.Override
public boolean apply(com.android.volley.Request<?> request) {
    return (request.getTag()) == tag;
}