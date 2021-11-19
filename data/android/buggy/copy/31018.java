@java.lang.Override
public int getItemCount() {
    int temp = 0;
    if ((allPosts.getList()) != null) {
        temp = allPosts.getList().size();
    }
    return temp;
}