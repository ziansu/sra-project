@java.lang.Override
public Area.Shape reduce(Area.Shape reduced, Area.Shape value) {
    Area.Shape res = new Area().new Shape();
    res.rgba = new float[4];
    AreaPixel.convexCombine(value.rgba, reduced.rgba, res.rgba);
    return res;
}