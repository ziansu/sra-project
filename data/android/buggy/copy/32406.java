public void testClearDatabase() throws java.lang.Exception {
    v4.dao.NGramDao nGramDao = new v4.dao.NGramDao(2, "bigram", "bigram_pos_frequency", "pos_bigram_index");
    nGramDao.clearDatabase();
}