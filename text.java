
// //normal program
// class A {
//     int a;
//     int b;
    
//     public void display() {
//         System.out.println("The value of a and b are " + (a + b));
//     }
// }

// class B {
//     int x;
//     int y;
    
//     public void show() {
//         System.out.println("The value of x and y are " + (x + y));
//     }
// }

// public class text { 
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.a = 100;
//         obj.b = 300;
//         obj.display();
//     }
// }
//to run the above program
// javac text.java   # Compiles the file
// java text         # Runs the compiled bytecode

//single inheritence

// class A {
//     int a;
//     int b;
    
//     public void display() {
//         System.out.println("The value of a and b are " + (a + b));
//     }
// }

// class B extends A{
//     int x;
//     int y;
    
//     public void show() {
//         System.out.println("The value of x and y are " + (x + y));
//     }
// }

// class C extends B{
//     int m;
//     int n;
    
//     public void add() {
//         System.out.println("The value of x and y are " + (m + n));
//     }
// }

// public class text { 
//     public static void main(String[] args) {
//        C obj=new C();
//        obj.a=100;
//        obj.b=400;
//        obj.x=300;
//        obj.y=90;
//        obj.m=340;
//        obj.n=35;
//        obj.display();
//        obj.show();
//        obj.add();
//     }
// }


//2)hirechial inheritence                
// class A {
//     int a;
//     int b;
    
//     public void display() {
//         System.out.println("The value of a and b are " + (a + b));
//     }
// }

// class B extends A{
//     int x;
//     int y;
    
//     public void show() {
//         System.out.println("The value of x and y are " + (x + y));
//     }
// }

// class C extends A{
//     int m;
//     int n;
    
//     public void add() {
//         System.out.println("The value of x and y are " + (m + n));
//     }
// }

// public class text { 
//     public static void main(String[] args) {
//        C obj=new C();
//        obj.a=100;
//        obj.b=400;
       
//        obj.m=340;
//        obj.n=35;
//        obj.display();
      
//        obj.add();

//        //c method tagondre bari a tagotivi
//        //b method tagondre bari a tagotivi
//        //yak andre a parent class
//     }
// }


//this keyword
// public class text {

//     int a,b;//class variable
//     void getvalues(int a,int b){ //method varibales
//         this.a=a;//used at a time 
//         this.b=b;
//     }
//     void show(){
//         System.out.println("the value of a is "+a);
//         System.out.println("the value of b is "+b);
//         System.out.println("The value of a and b are " + (a + b));
//     }
//     public static void main(String[] args) {
//         text thisk=new text();
//         thisk.getvalues(12, 40);
//         thisk.show();
//     }
// }

//system.out.println=why it is taken, it is combination of classname,variable,method
// system=classname
// out=variable
// println=method
// class system{
//     static Printstream out
// }//static is a keyword it should never change

 //final keyword
//  public class text {
 
//     final int a=10;
//     public static void main(String[] args) {
//         text obj=new text();
//         obj.a=20;//we can't change the initial a value because we use final keyword itcausing error
//         //variable=cannot be changed the value of variables
//         //method=method can be overridden in child class
//         //class=class can not be extended into other class 
//     }
//  }



//static =it is applicable for both methods and variables
//static variables and methods can directly accessthrough class name
//variables herbeku method static herbeku

// public class text {

//     int a;//non static
//     static int b;//static
//     static void m1(){
//         System.out.println("this is static method");
//     }
//     void m2(){
//         System.out.println("this is non static method");
//     }
//     public static void main(String[] args) {
//         b=100;
//         m1();   //m1 ge object tagondilla direct access madtaidhivi
//         text obj=new text();
//         obj.a=1000;
//         obj.m2();      //m2 static alla aduke obj create madhidivi
//     }
// }

//interface contains static and final keyword by default
//interface contains abstract method conatins defination but not the body
//methods in inheritance are public by default
//we can interface with interface keyword
//a class can be extened to another class
//interface to class we use implement
//class to interface is not posiible 
//interface to interface is possible

//interface in java is a blue print of class

// interface testint{
//     int a=10;
//     void m1(); //abstract method by default public
// }

// public class text implements testint{



//     public void m1(){
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         text obj=new text();
//         obj.m1();
//     }
// }


// interface one{
//     int a=100;
//     void m1();
// }


// interface two{
//     int b=300;
//     void m2();
// }

// public class text implements one,two{
//     public void m1(){
//         System.out.println(a);
//     }


//     public void m2(){
//         System.out.println(b);
//     }

//     public static void main(String[] args) {
//         text obj=new text();
//         obj.m1();
//         obj.m2();
//     }
// }



