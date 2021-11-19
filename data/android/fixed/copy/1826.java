public Rational minus(Rational r) {
    return this.plus(r.times(new Rational((-1), 1)));
}