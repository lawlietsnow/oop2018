package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name,id,group,email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public void setName(String s) {
        name=s;
    }
    public void setId(String s) {
        id=s;
    }
    public void setGroup(String s) {
        group=s;
    }
    public void setEmail(String s) {
        email=s;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public String getGroup(){
        return group;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name="Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name=n;
        id=sid;
        email=em;
        group="INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name=s.name;
        id=s.id;
        group=s.group;
        email=s.email;
    }

    String getInfo() {
        // TODO:
        System.out.println(name+"\n"+id+"\n"+group+"\n"+email);
        return null; // xóa dòng này sau khi cài đặt
    }
}
