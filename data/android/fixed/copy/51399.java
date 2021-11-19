@java.lang.Override
public void execute(java.lang.String video, java.io.File file) {
    startProcess(buildProcess().command(generateArguments(video, file, ((video.indexOf('.')) == (-1)))));
}