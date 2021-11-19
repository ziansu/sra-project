@java.lang.Override
public java.lang.String getValue() {
    if (com.Ben12345rocks.AdvancedCore.Objects.RewardHandler.getInstance().hasRewards(com.Ben12345rocks.VotingPlugin.Config.Config.getInstance().getData(), com.Ben12345rocks.VotingPlugin.Config.Config.getInstance().getAnySiteRewardsPath())) {
        return "False";
    }else {
        return "True";
    }
}