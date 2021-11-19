public java.util.List<bms.player.beatoraja.IRScoreData> readScoreDatas(java.lang.String sql, int lnmode) {
    return scoredb.getScoreDatas(player, ((("mode = " + lnmode) + " AND ") + sql));
}