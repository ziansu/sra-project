public static kittens.cats.swhatsappinvaders.Stats getStats(kittens.cats.swhatsappinvaders.util.DoubleVector location) {
    if ((kittens.cats.swhatsappinvaders.Stats.stats) == null) {
        kittens.cats.swhatsappinvaders.Stats.stats = new kittens.cats.swhatsappinvaders.Stats(location);
    }
    return kittens.cats.swhatsappinvaders.Stats.stats;
}