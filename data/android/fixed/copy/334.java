@java.lang.Override
public void onItemClick(org.spinsuite.util.contribution.QuickAction quickAction, int pos, int actionId) {
    org.spinsuite.util.ActionItemList actionItem = ((org.spinsuite.util.ActionItemList) (quickAction.getActionItem(pos)));
    updateDisplay(actionItem);
    setValue(actionItem.getValue());
}