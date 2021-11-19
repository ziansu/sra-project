@java.lang.Override
public void run() {
    listener.onPartialResult(result, request.getCardType());
}