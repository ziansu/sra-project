@java.lang.Override
public double distortion() {
    double rv = 0.0;
    for (int i = 0; i < (size()); i++)
        rv += java.lang.Math.pow(medoid.distance(get(i)), 2.0);
    
    return rv;
}