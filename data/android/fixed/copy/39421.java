public static void init(android.content.Context context) {
    main.mmwork.com.mmworklib.utils.DeviceInfo.sContext = context;
    main.mmwork.com.mmworklib.utils.DeviceInfo.MACADDRESS = main.mmwork.com.mmworklib.utils.DeviceInfo.getLocalMacAddress(context);
    main.mmwork.com.mmworklib.utils.DeviceInfo.RESOLUTION = main.mmwork.com.mmworklib.utils.DeviceInfo.getResolution(context);
}