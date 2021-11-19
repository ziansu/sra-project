public static void main(java.lang.String[] args) {
    org.springframework.boot.SpringApplication.run(org.application.schooldiary.SchoolDiaryApplication.class, args);
    org.application.schooldiary.database.CreateSchoolDiaryDB createSchoolDiaryDB = new org.application.schooldiary.database.CreateSchoolDiaryDB();
    createSchoolDiaryDB.main(args);
}