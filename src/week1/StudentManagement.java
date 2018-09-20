package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] s=new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup()); // xóa dòng này sau khi cài đặt
    }
    int number(){ //tổng số sinh viên
        int i=0;
        while(s[i]!=null) i++;
        return i;
    }
    void in(){//in ra danh sách theo lớp
        Student x=new Student();
        int i;
        x=s[0];
        System.out.println("Ten lop: "+s[0].getGroup());//in lớp của s[0]
        for(i=0;i<number();i++){
            if(!sameGroup(x,s[i])){
                System.out.println("Ten lop: "+s[i].getGroup());
                x=s[i];//x trỏ đến s[i]
                i--;//lùi 1 bước để getInfo()
            } else{
                s[i].getInfo();
            }
        }
        
    }
    void studentsByGroup() {
        // TODO:
        int i,j;
        Student x=new Student();
        for(i=0;i<number()-1;i++)// sắp xếp theo lớp
        {
            for(j=i+1;j<number();j++){
                if(s[i].getGroup().compareTo(s[j].getGroup())>0){
                    x=s[i];
                    s[i]=s[j];
                    s[j]=x;
                }
            }
        }
        in();
        
    }

    void removeStudent(String id) {
        // TODO:
        int i;
        for(i=0;i<number();i++){
            if(id.equals(s[i].getId())) break;//tìm vị trí của sinh viên cần xóa
        }
        int a=i;
        for(i=a;i<number()-1;i++){
            s[i]=s[i+1];//trỏ đối tượng s[i] vào s[i+1] 
        }
        s[number()-1]=null;// xóa phần tử cuối, vì phần tử này vẫn đang trỏ đến phần tử cuối của mảng sau khi xóa(2 phần tử cuối đều trỏ cùng 1 ojb)
    }

    public static void main(String[] args) {
        // TODO:
        
        Student student=new Student("Le Trung Kien","17020839","thotang19@gmail.com");
        System.out.println(student.getName());
        student.getInfo();
        Student s0=new Student("s0","0","email");
        s0.setGroup("0");
        Student s1=new Student("s1","1","email");
        s1.setGroup("1");
        Student s2=new Student("s2","2","email");
        s2.setGroup("2");
        Student s11=new Student("s11","11","email");
        s11.setGroup("1");
        Student s00=new Student("s00","00","email");
        s00.setGroup("0");
        StudentManagement sm=new StudentManagement();
        sm.s[3]=s0;
        sm.s[4]=s1;
        sm.s[0]=s2;
        sm.s[1]=s11;
        sm.s[2]=s00;
        sm.studentsByGroup();
        System.out.println("Tong so sinh vien: "+sm.number());
        System.out.println("///////");
        sm.removeStudent("1");
        sm.studentsByGroup();
        System.out.println("Tong so sinh vien: "+sm.number());
    }
}
