public void updateGoalPeriodHit(@org.springframework.web.bind.annotation.RequestParam
java.util.Map<java.lang.String, java.lang.Object> map) throws java.lang.Exception {
    java.lang.System.out.println(("띠바 왜 > " + map));
    update("front.updateGoal", map);
}