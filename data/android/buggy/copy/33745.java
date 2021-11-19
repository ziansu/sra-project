@java.lang.Override
public void callback(java.util.ArrayList<cl.smartcities.isci.transportinspector.backend.Event> response) {
    if (!(getStrategyContext().isCurrentStrategyInstance(this))) {
        android.util.Log.d(cl.smartcities.isci.transportinspector.map.strategies.TAG, "It is not the same strategy -> cancel information update for bus");
        return ;
    }
    updateElementById(response, null, getBusId());
}