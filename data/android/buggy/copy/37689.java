public static double getMaxMoneyReward() {
    ninja.leaping.configurate.ConfigurationNode valueNode = io.github.hsyyid.votifierlistener.config.Configs.getConfig(io.github.hsyyid.votifierlistener.utils.Utils.rewardsConfig).getNode("rewards", "money", "maximum");
    return valueNode.getDouble();
}