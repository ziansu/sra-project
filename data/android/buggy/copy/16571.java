@java.lang.Override
public final void setGoal(us.ihmc.footstepPlanning.FootstepPlannerGoal goal) {
    goalWasSet = true;
    planarRegionPotentialNextStepCalculator.setGoal(goal);
}