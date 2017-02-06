//package p1;

public class Hello{
   
    String uname;
    String compName;
    
    public Hello(String[] names){
        if(names.length == 3){
            this.uname = names[2];
            this.compName = names[1];
        } else if (names.length == 1 && !(names[0].equals("-me"))){
            this.uname = names [0];
            this.compName = null;
        } else {
            this.uname = "Eric";
        }
    }

    public static void main(String[] args){
        Hello h = new Hello(args);
        h.evaluate();    
    }

    public void evaluate(){
        String name = uname.substring(0,1).toUpperCase() + uname.substring(1);
       
        if(compName != null){ 
            System.out.println("Hello " + name + ". My name is " + compName + ". How are you today, " + name +  "?");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}

