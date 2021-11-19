@java.lang.Override
public void onCommandSuccess(final org.sigmah.shared.command.result.VoidResult result) {
    eventMap.get(key).remove(next);
    calendar.refresh();
}