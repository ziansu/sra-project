private void weChatAction(int flag) {
    if (!(checkWXInstalled())) {
        android.widget.Toast.makeText(mContext, getString(R.string.weiChat_not_installed), Toast.LENGTH_SHORT).show();
    }else {
        weChatShare(flag);
        setVisible();
    }
}