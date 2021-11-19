@org.junit.Test
public void addMinute() {
    com.example.alexa.softwareengproject.Hour h = new com.example.alexa.softwareengproject.Hour();
    for (int i = 0; i < 71; i++)
        h.addMinute();
    
    assertEquals(h.getMinutes().length, 60);
}