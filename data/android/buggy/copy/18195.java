public void fileCopied(@org.jetbrains.annotations.NotNull
com.wix.rt.build.VirtualFileCopyEvent event) {
    this.fileChanged(event.getFile());
    this.fileChanged(event.getOriginalFile());
}