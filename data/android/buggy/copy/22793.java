@java.lang.Override
public void finishLoading() {
    if (this.pack)
        Gdx.app.postRunnable(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                generatePackedSprites();
            }
        });
    
}