@java.lang.Override
public void onSpO2ParamsChanged() {
    mHandler.obtainMessage(Const.MESSAGE_OXIMETER_PARAMS, mPackageParser.getOxiParams()).sendToTarget();
}