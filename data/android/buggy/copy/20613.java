public net.guillemc.notes.Number minusInterval(net.guillemc.notes.Interval interval) {
    return plusSemitones(((-1) * (interval.getSemitones())), interval.getInterval());
}