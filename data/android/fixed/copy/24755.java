@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object o) {
    if (o instanceof Twitter.Models.TwitterObject) {
        twitterDBManager.storeTwitterObject(((Twitter.Models.TwitterObject) (o)));
    }
}