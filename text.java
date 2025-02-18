
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