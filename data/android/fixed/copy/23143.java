public void update(float deltaTime) {
    for (com.smb215team.barjis.game.objects.Dice dice : dices) {
        if (null == dice)
            return ;
        
        dice.update(deltaTime);
    }
}