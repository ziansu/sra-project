public leanderk.izou.iftt.actions.ActionFlow setConditionAction(leanderk.izou.iftt.actions.ConditionAction conditionAction) {
    return new leanderk.izou.iftt.actions.ActionFlow(sourceAction, conditionAction, targetAction);
}