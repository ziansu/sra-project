@java.lang.Override
public void onNewInput(java.lang.String input) {
    suggestionsView.removeAllViews();
    trigger.exec(input, mTerminalAdapter.getCurrentOutputId());
}