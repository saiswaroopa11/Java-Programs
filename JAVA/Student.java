class Student{
    String name;
    int age; 
    
    Student(){
        name = "swaroopa";
        age = 18;
}

public static void main(String[] args){
    Student s = new Student();

    System.out.println(s.name);
    System.out.println(s.age);
   }
}