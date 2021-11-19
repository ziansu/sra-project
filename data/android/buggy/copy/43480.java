@java.lang.Override
public void setup() {
    contour = ((net.imglib2.roi.geometric.Polygon) (ops.run(net.imagej.ops.geom.geom2d.DefaultContour.class, net.imagej.ops.geom.GeomTest.region2D, true, true)));
    mesh = ((net.imagej.ops.geom.geom3d.mesh.Mesh) (ops.run(net.imagej.ops.geom.geom3d.DefaultMarchingCubes.class, net.imagej.ops.geom.GeomTest.region3D)));
}