public java.lang.String formatExcRate(float l) {
    if (l < 1) {
        ExcRateFormat.applyPattern("#,###.########");
    }else {
        ExcRateFormat.applyLocalizedPattern("#,###.##");
    }
    return ExcRateFormat.format(l);
}