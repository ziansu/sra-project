private ru.yandex.qatools.ashot.Screenshot getExpectedScreenshot() throws java.io.IOException {
    return new ru.yandex.qatools.ashot.Screenshot(javax.imageio.ImageIO.read(new java.io.File(getExpectedFilePath())));
}