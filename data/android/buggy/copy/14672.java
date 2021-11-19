public void createDefaultUserProfPic() {
    final models.Image image = new models.Image("img/defaultuserpic.png");
    image.setId(1L);
    image.save();
}