public com.hearthsim.model.PlayerSide convertPlayerSide(com.hearthsim.model.PlayerSide side) {
    switch (side) {
        case CURRENT_PLAYER :
            return com.hearthsim.model.PlayerSide.CURRENT_PLAYER;
        case WAITING_PLAYER :
            return com.hearthsim.model.PlayerSide.WAITING_PLAYER;
    }
    return com.hearthsim.model.PlayerSide.WAITING_PLAYER;
}