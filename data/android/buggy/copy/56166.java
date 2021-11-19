public void bounce(float surfaceTangent) {
    removeImage(jig.ResourceManager.getImage(BounceGame.BALL_BALLIMG_RSC));
    addImageWithBoundingBox(jig.ResourceManager.getImage(BounceGame.BALL_BROKENIMG_RSC));
    countdown = 500;
    velocity = velocity.bounce(surfaceTangent);
}