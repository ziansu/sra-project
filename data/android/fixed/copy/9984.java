public void addFriend(models.User friend) {
    if ((models.UserToUser.exists(this, friend)) || ((this) == friend))
        return ;
    
    models.UserToUser u2u = new models.UserToUser(this, friend);
}