@java.lang.Override
public void onNext(com.scala.exp.android.sdk.model.Thing thing) {
    java.lang.Object zones = thing.get("location.zones");
    android.util.Log.e("Response", thing.toString());
}