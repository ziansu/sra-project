public void betternews(org.bukkit.entity.Player p, int numToShow) {
    if (numToShow < 1)
        return ;
    
    p.sendMessage(com.gabezter4.Vitals.Vitals.colorize("&c[LATEST NEWS]"));
    showLatestFileEntries(p, "news.txt", numToShow);
}