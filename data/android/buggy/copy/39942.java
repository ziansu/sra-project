public static void startTrainingCognitiv(EmoState.EE_CognitivAction_t cognitivAction, com.sun.jna.Pointer eEvent) {
    UpgradedEdk.INSTANCE.IEE_MentalCommandSetTrainingAction(0, cognitivAction.ToInt());
    UpgradedEdk.INSTANCE.IEE_MentalCommandSetTrainingControl(0, UpgradedEdk.IEE_MentalCommandTrainingControl_t.MC_START.getType());
}