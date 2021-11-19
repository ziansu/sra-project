public java.lang.Boolean addUser(jfs.data.dataobjects.UserDO user) {
    if (user != null) {
        return (this.insert(user, user._id)) != null;
    }else {
        throw new java.lang.NullPointerException("UserDO user parameter is null");
    }
}