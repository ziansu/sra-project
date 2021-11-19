public static com.emrahdayioglu.bean.ImageBean getUserImage(int userId, boolean withBase64, com.emrahdayioglu.constants.ImageStatus status) {
    com.emrahdayioglu.bean.ImageBean image = com.emrahdayioglu.utils.ImageUtil.getImageFromDB(ImageType.USER, userId, status, 0);
    com.emrahdayioglu.utils.ImageUtil.fillImageData(ImageType.USER, withBase64, 0, image);
    return image;
}