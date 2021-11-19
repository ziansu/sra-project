@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    android.util.Log.d(((TAG) + ".afterTextChanged()"), "afterTextChanged");
    com.nusclimb.live.crimp.common.BusProvider.getInstance().post(new com.nusclimb.live.crimp.common.busevent.AccumulatedScoreChange());
}