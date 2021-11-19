@java.lang.Override
public void run() {
    if ((listener) != null) {
        listener.onPartialResult(result, request.getCardType());
    }
}