@org.junit.Test
public void GIVEN_different_greater_then_or_equal_to_three_WHEN_get_score_THEN_get_score_win() {
    assertEquals("Receiver Win", com.oocl.zach.test.TennisScore.GetTennisScore(2, 4));
    assertEquals("Server Win", com.oocl.zach.test.TennisScore.GetTennisScore(5, 3));
}