public Rational minus(Rational r) {
    return new Rational(this.plus(r.times(new Rational((-1), 1))));
}