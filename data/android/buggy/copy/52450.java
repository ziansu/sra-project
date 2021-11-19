public static boolean existsLocally(java.lang.String planId) {
    java.util.TreeMap<java.lang.String, pt.lsts.neptus.types.mission.plan.PlanType> plansList = Preflight.CONSOLE.getMission().getIndividualPlansList();
    return plansList.containsKey(planId);
}