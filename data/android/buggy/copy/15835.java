@org.junit.Test
public void stringToJSON() {
    org.junit.Assert.assertEquals(ru.otus.homework_08.JSON.toJSON("abc"), gson.toJson("abc"));
}