public void editMood(int position, com.example.moodly.Models.Mood m) {
    com.example.moodly.Controllers.MoodController.instance.moodList.set(position, m);
    com.example.moodly.Controllers.MoodController.AddMoodTask addMoodTask = new com.example.moodly.Controllers.MoodController.AddMoodTask();
    addMoodTask.execute(m);
}