@java.lang.Override
public java.util.Optional<com.shootoff.targets.Target> addTarget(java.io.File targetFile) {
    mirroredManager.mirrorAddTarget(targetFile);
    return super.addTarget(targetFile);
}