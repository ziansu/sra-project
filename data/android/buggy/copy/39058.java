@org.junit.Before
public void setup() {
    javafx.geometry.Point2D topleft = new javafx.geometry.Point2D(0, 0);
    vertex = new nl.tudelft.lifetiles.graph.view.VertexView("ATCG", topleft, 10, 10, 1, 40, javafx.scene.paint.Color.RED);
}