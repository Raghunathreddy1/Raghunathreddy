package day5.inheritance.assignments;
public class Employee extends Person{
 int empid=23456;
 long phnum=9515519507l;
 void work() {
	 System.out.println("He can work");
 }
 void talk() {
	 System.out.println("He can talk");
 }
 public static void main(String[] args) {
 Employee e=new Employee();
 
 e.eat();
 e.drink();
 e.work();
 e.talk();
 System.out.println(e.name);
 System.out.println(e.phnum);
 System.out.println(e.empid);
 System.out.println(e.height); 
 }
}