public void setLoiterRadius(double radius) {
    reference.radius = ((float) (radius));
    reference.flags.add(FLAGS.FLAG_RADIUS);
}