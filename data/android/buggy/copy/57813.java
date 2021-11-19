public void setTimeout(int time) {
    Settings.System.putInt(context.getContentResolver(), Settings.System.SCREEN_OFF_TIMEOUT, (time * 1000));
    return ;
}