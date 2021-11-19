public void stashDataEntry(com.codebrig.jvmmechanic.agent.stash.DataEntry dataEntry) throws java.io.IOException {
    fileChannel.position(fileChannel.size());
    fileChannel.write(dataEntry.toByteBuffer());
}