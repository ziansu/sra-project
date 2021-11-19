public static org.catrobat.catroid.content.bricks.BrickBaseType getInstanceOfJumpingSumoBrick(org.catrobat.catroid.drone.jumpingsumo.JumpingSumoBrickFactory.JumpingSumoBricks brick) {
    switch (brick) {
        case JUMPING_SUMO_JUMP_HIGH :
            return new org.catrobat.catroid.content.bricks.JumpingSumoJumpHighBrick();
        case JUMPING_SUMO_JUMP_LONG :
            return new org.catrobat.catroid.content.bricks.JumpingSumoJumpLongBrick();
        default :
            return null;
    }
}