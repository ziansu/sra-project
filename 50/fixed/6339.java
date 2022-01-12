public boolean logout() {
    Account usersAccount = this.getAccount().get(0);
    this.LoggedIn = false;
    return true;
}