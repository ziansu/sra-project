public static void setFirstTime() {
    if (null != (com.junyou.hbks.TimeManager.editor))
        com.junyou.hbks.TimeManager.editor.putString(com.junyou.hbks.TimeManager.FIRST_TIME, ("" + (com.junyou.hbks.TimeManager.getSystemTime())));
    
    com.junyou.hbks.TimeManager.editor.apply();
}