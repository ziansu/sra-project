@java.lang.Override
public void onCommandSuccess(final org.sigmah.shared.command.result.VoidResult result) {
    eventMap.remove(next);
    calendar.refresh();
}