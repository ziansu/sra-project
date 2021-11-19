@java.lang.Override
public int getFansNum(int userId) {
    return findFollowByFollowUser(userId).size();
}