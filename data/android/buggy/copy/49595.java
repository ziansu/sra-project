@java.lang.Override
public java.util.Optional<com.shootoff.targets.Target> addTarget(java.io.File targetFile, boolean playAnimations) {
    mirroredManager.mirrorAddTarget(targetFile, playAnimations);
    return super.addTarget(targetFile, playAnimations);
}