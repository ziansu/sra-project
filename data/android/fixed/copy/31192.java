public void send(com.Ben12345rocks.AdvancedCore.Objects.User user) {
    com.Ben12345rocks.AdvancedCore.Objects.RewardHandler.getInstance().giveReward(user, prefix, data, path, online, giveOffline, placeholders);
}