@java.lang.Override
public void onReady(java.lang.Object val) {
    if (((boolean) (val))) {
        action.state = cn.academy.ability.api.ctrl.SyncAction.State.VALIDATED;
        map.put(action.uuid, action);
        set.add(action.uuid);
    }
}