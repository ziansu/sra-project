@util.annotations.Row(value = 0)
@util.annotations.Column(value = 5)
@util.annotations.ComponentWidth(value = 100)
public void live() {
    setCurrentFeatureIndex(((counter) - 1));
    setStart(((counter) - 1));
}