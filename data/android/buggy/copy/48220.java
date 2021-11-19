final void destroy() {
    mIsBeingDestroyed = true;
    for (com.bluelinelabs.conductor.ChildControllerTransaction child : mChildControllers) {
        child.controller.destroy();
    }
    if (!(mAttached)) {
        removeViewReference();
    }
}