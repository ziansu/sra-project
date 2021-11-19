@org.junit.Before
public void initTest() {
    owner = new org.istic.taa.todoapp.domain.Owner();
    owner.setName(org.istic.taa.todoapp.web.rest.OwnerResourceTest.DEFAULT_NAME);
}