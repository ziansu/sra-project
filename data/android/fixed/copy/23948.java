@java.lang.Override
public void onServiceReady(com.amazon.ags.api.AmazonGamesClient amazonGamesClient) {
    com.gcex.GameCircle.agsClient = amazonGamesClient;
    android.util.Log.i(com.gcex.GameCircle.TAG, "GameCircle: initialize Successful");
}