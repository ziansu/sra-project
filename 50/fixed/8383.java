@java.lang.Override
public int getFansNum(int userId) {
    int i = findFollowByFollowUser(userId).size();
    return i;
}