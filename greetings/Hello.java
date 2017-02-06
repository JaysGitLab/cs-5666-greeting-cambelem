package p1;

public class Hello{
    
    public Hello(){
    }

    public static void main(String[] args){
        Hello h = new Hello();
        h.evaluate(args);    
    }

    public void evaluate(String[] args){
        if(args.length == 1){
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, Eric!");    
        }
    }
}

