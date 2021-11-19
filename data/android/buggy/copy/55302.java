@java.lang.Override
public int getCount() {
    int count = adapter.getCount();
    return count == 0 ? 0 : count + (com.votingsystem.tsiro.adapters.FirmNamesSpnrNothingSelectedAdapter.EXTRA);
}