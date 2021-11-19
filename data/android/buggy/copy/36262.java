@java.lang.Override
public void networkAvailable() {
    if ((runAfterLoad) == null)
        new me.ccrama.redditslide.Authentication(this);
    
}