@org.junit.Test
public void testGetNextScoreDifficult() {
    int travelDirection = 0;
    double expResult = 50.0 / (distToGoal(kbs_rover_project.InferenceEngineTest.wtDifficult));
    double result = kbs_rover_project.InferenceEngineTest.testEngine.getNextScore(kbs_rover_project.InferenceEngineTest.wtDifficult);
    assertEquals(expResult, result, 0.0);
}