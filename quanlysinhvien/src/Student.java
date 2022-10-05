public class Student {
    //name (tên sinh viên), id (mã số sinh viên),
    // group (lớp học), email (địa chỉ email).
    //TODO: khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    //Thêm các phương thức get/set cho các thuộc tính (gọi là getter/setter).
    // Ví dụ, với thuộc tính “name”,
    // hai phương thức cần thêm gồm “public String getName()”
    // và “public void setName(String n)”.
    //TODO: khai bao cac phuong thuc getter, setter cho Student

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*
     * Constructor 1
     */

    Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /*
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /*
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
    }

    String getInfo() {
        // TODO:
        System.out.printf("%s - %s - %s - %s",
                this.getGroup(), this.getName(), this.getId(),
                this.getGroup(), this.getEmail());
        return null; // xoa dong nay sau khi cai dat
    }
}