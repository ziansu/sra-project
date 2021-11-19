@org.junit.Test
public void testMoodEventMarker() {
    java.lang.String trigger = "trigger";
    com.example.moodswing.moodswing_000.EmotionalState emotionalState = new com.example.moodswing.moodswing_000.EmotionalState("happy", "somewhere", android.graphics.Color.BLACK);
    com.example.moodswing.moodswing_000.MoodEvent moodEvent = new com.example.moodswing.moodswing_000.MoodEvent("username1", emotionalState, trigger, null, null, null);
}