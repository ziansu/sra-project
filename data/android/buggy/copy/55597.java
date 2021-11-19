@org.junit.Test
public void testAchievementconstructor1_twoAchievements() {
    com.github.fishio.achievements.Achievement achievetest1 = new com.github.fishio.achievements.Achievement("Testachievement", 3);
    com.github.fishio.achievements.Achievement achievetest2 = new com.github.fishio.achievements.Achievement("Testachievement", 3);
    org.junit.Assert.assertEquals(achievetest1, achievetest2);
}