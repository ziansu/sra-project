public void removeSubview(se.wiklund.haderengine.View view) {
    if (!(subviews.contains(view))) {
        java.lang.System.err.println(((Engine.NAME_PREFIX) + "Tried to remove a subview that isn't added!"));
        return ;
    }
    subviews.add(view);
}