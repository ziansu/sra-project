public static javafx.scene.shape.Shape cycle(javafx.scene.shape.Shape image) {
    return sample.Transformations.quartet(sample.Transformations.rotate90(image), sample.Transformations.rotate180(image), image, sample.Transformations.rotate270(image));
}