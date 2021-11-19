public static synchronized boolean addClockEntry(mine.android.api.modules.ClockEntry entry) {
    int newId = mine.android.api.ClockEntryAPI.getNextId();
    entry.setId(newId);
    mine.android.api.ClockEntryAPI.list.add(entry);
    mine.android.api.ClockEntryAPI.save();
    mine.android.api.AlarmAPI.activeClock(newId);
    return true;
}