public void save(tomdrever.timetable.data.Timetable timetable) {
    tomdrever.timetable.utils.FileUtils.writeToFile(directory, ((timetable.getName()) + ".txt"), tomdrever.timetable.utils.TimetableFileManager.gson.toJson(timetable));
}