private static void deleteContact() {
    java.lang.System.out.println("������� ����� (id) �������� ��� ��������");
    ua.skillsup.java0.phonebook.TestDrive.PhoneManagerTest.sc = new java.util.Scanner(java.lang.System.in);
    int id = ua.skillsup.java0.phonebook.TestDrive.PhoneManagerTest.sc.nextInt();
    ua.skillsup.java0.phonebook.TestDrive.PhoneManagerTest.pm.deleteContact(id);
}