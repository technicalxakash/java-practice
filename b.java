//constructor
// public class b{

//     int id;
//     String name;

//     b(){//constructor

//         id=10;
//         name="akash";
//     }

//     void display(){//method
//         System.out.println("the id is"+" "+id +" "+"the name is "+name);
//     }

//     public static void main(String[] args) {
//         b ce=new b();
//         ce.display();
//     }

// }


//Access modifier = define the scope of variable and methods

//private = access within a class

// class a{
//    private int a=10;
   
//    private void main(){

//    }

// }
// public class b {

//     public static void main(String[] args) {
//         a obj=new a();
//         obj.
//     }
// }

// default = it can be acceseesd only within the package


// class a{
//      int a=10;
    
//      void main(){
 
//     }
 
//  }
//  public class b {
 
//      public static void main(String[] args) {
//          a obj=new a();
//          obj.a=10;
         
//      }
//  }

//protected=it can be accessed with the other package also but by only using sub class(protected)

//public = it can be accessed anywhere


//java packages =packages is a collection of class/interface/otherfiles


//1)built-in packages=which is already available in java
//2)user defined packages=the packages created by user





// public class b {

//     int a;
//     int b;
//     void sum(){
//         a=10;
//         b=20;
//         System.out.println(a+b);

//     }
//     public static void main(String[] args) {
//         b obj=new b();
//         obj.sum();
//     }
// }


//overloading
//overloading methods // constructor with same name but different parameters
//1)method overloading
// public class b {
//     int a;
//     int b;

//     // First method with no parameters
//     void sum() {
//         a = 10;
//         b = 20;
//         System.out.println(a + b);
//     }

//     // Overloaded method with two parameters
//     void sum(int x, int y) {
//         a = x;
//         b = y;
//         System.out.println(a + b);
//     }

//     // Overloaded method with three parameters
//     void sum(int x, int y, int z) {
//         System.out.println(x + y + z);
//     }

//     public static void main(String[] args) {
//         b obj = new b();
//         obj.sum();         // Calls sum() with no parameters
//         obj.sum(5, 15);    // Calls sum(int x, int y)
//         obj.sum(3, 6, 9);  // Calls sum(int x, int y, int z)
//     }
// }

//2)constructor overloading

// public class b {
//       int a;
//       int numb;

//       b(){
//         a=10;
//         numb=30;
//         System.out.println(a+numb);
//       }
//       b(int x,int y){
//         a=x;
//         numb=y;
//         System.out.println(a+numb);
//       }
//       b(int x, int y,int z){
        
//         System.out.println(x+y+z);
//       }
//     public static void main(String[] args) {
//         b obj = new b(10,22,90);
//     }    
// }