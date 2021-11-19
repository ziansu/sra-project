@java.lang.Override
public double logPdf(java.lang.Object x) {
    if (x instanceof dr.inference.distribution.Parameter)
        return logPdf(((dr.inference.distribution.Parameter) (x)).getParameterValues());
    else
        return 0;
    
}