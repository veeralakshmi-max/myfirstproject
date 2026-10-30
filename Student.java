public class Student{
    String name;
    int age;
    String department;
    void insert(String n,int a,String d){
        name = n;
        age = a;
        department = d;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("department:"+department);
    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.insert("veeralakshmi",20,"cse");
        s1.display();
    }

}