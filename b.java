public class b{

    int id;
    String name;

    b(){

        id=10;
        name="akash";
    }

    void display(){
        System.out.println("the id is"+" "+id +" "+"the name is "+name);
    }

    public static void main(String[] args) {
        b ce=new b();
        ce.display();
    }

}