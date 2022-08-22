package com.assignment;

import java.util.Comparator;
import java.util.PriorityQueue;

/*class Student{
    String Name;
    int age;
    public Student(String Name , int age) {
        this.Name = Name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" + "Name='" + Name + '\'' + ", age=" + age + '}';
    }
    public Object age() {
        return age;
    }


class StudentDeatils implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
    }

}*/
public class PriorityQueueD {
  //  private static int comp;
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        PriorityQueue<String> pq2= new PriorityQueue<>();
        pq1.add("Pratiksha");
        pq1.add("nano");
        pq1.add("divya");
        pq1.add("Ishi");
        System.out.println(" First Priority list:" + pq1);
        pq2.add("Ishi");
        pq2.add("ayushi");
        pq2.add("nano");
        pq2.add("krutika");
        System.out.println("Second Priority List:" + pq2);

        for(String i : pq1){
            System.out.println(pq2.contains(i) ? "True" : "False" );
        }



}
}

