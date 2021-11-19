@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent arg1) {
    if (com.tropicgame.data.HelperFactory.getObjectsHelper().getProfileOfShowHelper().getProfileOfShow().isBoxReboot())
        com.tropicgame.common.Utils.AutoStartShow(context);
    
}