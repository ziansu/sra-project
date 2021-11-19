@java.lang.Override
public void onError(java.lang.Integer errorCode, java.lang.String description) {
    java.lang.System.out.println("Channel Error");
    java.lang.System.out.println(((("Error Occured: " + description) + " Error Code:") + errorCode));
    java.lang.System.out.println("This is the \"Defualt Class\" You Should Realy Implement Your Own Version of \"ChannelService\" :-)");
}