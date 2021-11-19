@org.junit.Test
public void testLoadFaculties() {
    for (model.Faculty ¢ : cr.loadFaculties())
        java.lang.System.out.println((((¢.getId()) + "---") + (¢.getName())));
    
}