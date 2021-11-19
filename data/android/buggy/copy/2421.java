@java.lang.Override
public components.Sphere translateBy(components.Vector p) {
    return new components.Sphere(center.plus(p), radius, motion, mass, color);
}