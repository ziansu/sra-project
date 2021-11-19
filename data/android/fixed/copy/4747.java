public java.util.List<cz.tomkren.fishtron.ugen.data.Ts1Res> ts1(cz.tomkren.fishtron.types.Type t_NF, int n) {
    return opts.isCachingUsed() ? cache.ts1(t_NF, n) : ts1_compute(t_NF, n);
}