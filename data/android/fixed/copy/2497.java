@java.lang.Override
public boolean apply(by.dalex.roomfinder.model.Room room) {
    return (latestDate.compareTo(room.getCreatDate())) <= 0;
}