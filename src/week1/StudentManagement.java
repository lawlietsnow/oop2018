package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] s=new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup()); // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
        int i,j;
        Student x;
        for(i=0;s[i]!=null;i++)
        {
            for(j=i+1;s[j]!=null;j++){
                if(s[i].getGroup().compareTo(s[j].getGroup())<0){
                    x=s[i];
                    s[i]=s[j];
                    s[j]=x;
                }
            }
        }
        System.out.println("Ten Lop: "+s[0].getGroup());
        for(i=1;s[i]!=null;i++){
        s[i].getInfo();    
        if(!s[i].getGroup().equals(s[i+1].getGroup())) System.out.println("Ten Lop: "+s[i+1].getGroup());
        }
    }

    void removeStudent(String id) {
        // TODO:
        
    }

    public static void main(String[] args) {
        // TODO:
        Student student=new Student();
        student.setName("Le Trung Kien");
        student.setId("17020839");
        student.setGroup("INT22041");
        student.setEmail("thotang19@gmail.com");
        System.out.println(student.getName());
        student.getInfo();
        Student s0=new Student("s0","0","em");
        s0.setGroup("0");
        Student s1=new Student("s1","1","em");
        s1.setGroup("1");
        Student s2=new Student("s2","2","em");
        s0.setGroup("2");
        StudentManagement sm=new StudentManagement();
        sm.s[0]=s0;
        sm.s[1]=s1;
        sm.s[2]=s2;
        sm.studentsByGroup();
    }
}
