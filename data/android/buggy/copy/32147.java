public void sendFileWP(java.lang.String user, long timeout, studyproject.API.Core.File.FileInfo fileInfo) {
    studyproject.API.Lvl.Mid.SendFileWPThread sendFileWPThread = new studyproject.API.Lvl.Mid.SendFileWPThread(getUserConnectionInfo(user), timeout, fileInfo);
    sendFileWPThread.run();
}