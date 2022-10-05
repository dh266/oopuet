public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array
    //  chua cac doi tuong thuoc lop Student (max. 100)
    Student[] students = new Student[100];
    int n = 0;

    /**
     * so sanh thuoc tinh group 2 student.
     * @param s1 - student 2
     * @param s2 - student 1
     * @return - tra ve
     */
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
        // xoa dong nay sau khi cai dat
    }

    /**
     * add student.
     * @param newStudent - newstudent
     */
    public void addStudent(Student newStudent) {
        // TODO:
        /*if(students.length == (int)null)   students[0] = newStudent;
        else*/
        students[this.n] = newStudent;
        n++;
    }

    /**
     * in liststudent theo group.
     * @return - tra ve
     */
    public String studentsByGroup() {
        boolean[] flag = new boolean[this.n];
        for (int i = 0; i < this.n; i++) {
            if (!flag[i]) {
                flag[i] = true;
                System.out.printf("%s\n%s - %s - %s - %s\n",
                        students[i].getGroup(), students[i].getName(),
                        students[i].getId(), students[i].getGroup(),
                        students[i].getEmail());
            }
            for (int j = 1; j < this.n; j++) {
                if (sameGroup(students[i], students[j])) {
                    if (!flag[j]) {
                        System.out.printf("%s - %s - %s - %s\n",
                                students[j].getName(), students[j].getId(),
                                students[j].getGroup(), students[j].getEmail());
                        flag[j] = true;
                    }
                }
            }
        }
        return ;
    }

    /**
     * remove 1 student tu list.
     * @param id - id student muon remove
     */
    public void removeStudent(String id) {
        // TODO:
        for (int i = 0; i < this.n; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < this.n; j++) {
                    students[j] = students[j + 1];
                }
            }
        }
    }
/*
    public static void main(String[] args) {
        // TODO:
        Student a = new Student();
        a.setName("Nguyen Van An");
        a.setId("17020001");
        a.setGroup("K62CC");
        a.setEmail("1702001@vnu.edu.vn");
        Student a1 = new Student();
        a1.setName("Nguyen Van B");
        a1.setId("17020002");
        a1.setGroup("K62CC");
        a1.setEmail("1702002@vnu.edu.vn");
        Student a2 = new Student();
        a2.setName("Nguyen Van C");
        a2.setId("17020003");
        a2.setGroup("K62CB");
        a2.setEmail("1702003@vnu.edu.vn");
        Student a3 = new Student();
        a3.setName("Nguyen Van D");
        a3.setId("17020004");
        a3.setGroup("K62CB");
        a3.setEmail("1702004@vnu.edu.vn");
        StudentManagement s = new StudentManagement();
        s.addStudent(a);
        s.addStudent(a1);
        s.addStudent(a2);
        s.addStudent(a3);
        s.studentsByGroup();

        K62CC
        Nguyen Van An - 17020001 – K62CC – 17020001@vnu.edu.vn
        Nguyen Van B - 17020002 – K62CC – 17020002@vnu.edu.vn
        K62CB
        Nguyen Van C - 17020003 – K62CB – 17020003@vnu.edu.vn
        Nguyen Van D - 17020004 – K62CB – 17020004@vnu.edu.vn

    }*/
}