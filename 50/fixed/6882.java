@java.lang.Override
public void handlerNotification(android.content.Context context, boolean binded, com.yy.httpproxy.service.PushedNotification pushedNotification) {
    if (!binded) {
        showNotification(context, pushedNotification);
    }else {
        sendArrived(context, pushedNotification);
    }
}