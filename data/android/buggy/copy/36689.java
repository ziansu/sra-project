@java.lang.Override
public int compare(org.glassfish.jersey.message.internal.Qualified o1, org.glassfish.jersey.message.internal.Qualified o2) {
    final int q1 = o1.getQuality();
    final int q2 = o2.getQuality();
    return -(java.lang.Integer.compare(q1, q2));
}