@org.junit.Ignore
@org.junit.Test
public void listAll() {
    clocks.Sprawl s = new clocks.Sprawl();
    for (clocks.Campaign cur : s.getCampaigns()) {
        java.lang.System.out.println(cur.toString());
    }
    s.close();
}