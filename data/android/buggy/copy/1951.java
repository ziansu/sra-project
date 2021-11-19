private static net.sourceforge.clonekeenplus.Settings.SdcardAppPath get() {
    if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.KITKAT))
        return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.Kitkat.Holder.sInstance;
    else
        if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.FROYO))
            return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.Froyo.Holder.sInstance;
        else
            return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.Dummy.Holder.sInstance;
        
    
}