@java.lang.Override
public final void flush(hcm.ssj.core.stream.Stream[] stream_in, hcm.ssj.core.stream.Stream stream_out) {
    if ((ssi_object) > 0)
        hcm.ssj.mobileSSI.SSI.transformFlush(ssi_object, stream_in[0], stream_out);
    
}