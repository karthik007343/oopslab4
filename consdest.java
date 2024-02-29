import java.util.Scanner;
class consdest{
    String collegename;
    int collegecode;
    String name;
    double percentage;
    consdest(){
        collegename="mvgr";
        collegecode=33; 
    }
    consdest(String fullname,double sempercentage){
        name=fullname;
        percentage=sempercentage;
    }
    void display(){
        System.out.println("name is:"+name);
        System.out.println("percentage"+percentage);
        System.out.println("college name:"+collegename);
        System.out.println("collegecode"+collegecode);
    }
    public static void main(String args[]){
        consdest n=new consdest("karthik",89);
        consdest m=new consdest();
        System.out.println("fullname is:"+n.name+"\nsempercentage:"+n.percentage+"\ncollege name:"+m.collegename+"\ncollege code:"+m.collegecode);
    }
}
