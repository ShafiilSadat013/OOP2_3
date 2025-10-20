
package com.mycompany.javalab66;

/**
 *
 * @author Gcl
 */
public class Javalab66 {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("sadat");
        s1.setId(13);
        s1.setAge(23);
        
        s2.setName("fwefoi");
        s2.setId(87);
        s2.setAge(22);
        
        Student.student_num();
        Student.uni();
        
    }
}
class Student
{

    private String name;
    private int age;
    private int id;
    private static int s_count = 0;
    private static String uni_name = "MU";
        
Student()
{
  s_count++;
}
public String  getName()
{
  return name;
}
public void setName(String name){
   
     this.name = name;
}

public int getAge()
{
  return age;
}
public void setAge(int age)
{
  this.age = age;
}

public int getId()
{
  return id;
}

public void setId(int id)
{
   this.id = id;
}

public static void student_num()
{
 System.out.println(s_count);
}
public static void uni()
{
  System.out.println(uni_name);
}

}
