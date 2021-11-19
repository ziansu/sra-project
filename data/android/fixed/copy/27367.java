private android.graphics.drawable.Drawable getUserPic() {
    try {
        return menuService.findUserByEmail(this.userId).getImageRounded(getResources());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}