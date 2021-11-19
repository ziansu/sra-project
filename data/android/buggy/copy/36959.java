public void onReceiving(java.io.File f) {
    java.lang.String fileName = (f.getPath()) + ".jpg";
    f.renameTo(new java.io.File(fileName));
    org.cocos2dx.cpp.jniFacade.JniCppFacade.onReceivingPhoto(((f.getPath()) + ".jpg"));
}