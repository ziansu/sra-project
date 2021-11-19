@java.lang.Override
public void onResult(boolean isMatched) {
    if (isMatched) {
        setCardMatched(true);
    }else {
        setCardFaceDown(true);
    }
}