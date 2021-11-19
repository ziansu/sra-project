@java.lang.Override
public com.flyingrain.translate.plan.api.response.Plan getUserPlan(int userId, int planId) {
    return transferPlanModel(planMapper.getPlan(planId, userId));
}