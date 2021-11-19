@java.lang.Override
public void dataPacketReceived() {
    long s = ttftcuts.physis.common.file.PhysisWorldSavedData.getWorldTag(ttftcuts.physis.common.story.StoryEngine.STORYTAG).getLong("seed");
    ttftcuts.physis.common.story.StoryEngine.reload(s, true);
    Physis.logger.info("Loaded story seed from packet");
}