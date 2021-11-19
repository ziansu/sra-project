@java.lang.Override
public int getCount() {
    int count = ((adapter) != null) ? adapter.getCount() : 0;
    return count == 0 ? 0 : count + (com.votingsystem.tsiro.adapters.FirmNamesSpnrNothingSelectedAdapter.EXTRA);
}