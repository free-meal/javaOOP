import java.util.ArrayList;
import java.util.Scanner;

public class MyStack extends ArrayList {

    public int getSize(){
        return this.size();
    }

    public Object peek(){
        return this.get(this.size() - 1);
    }

    public Object pop(){
        Object o = this.get(this.size() - 1);
        this.remove(this.size() - 1);
        return o;
    }

    public void push(Object o){
        this.add(o);
    }

    public static void main(String[] args){

        MyStack testStack = new MyStack();
        Scanner inputReader = new Scanner(System.in);
        for( int i = 1; i <= 5; i++){
            System.out.println("Enter String " + i + ": ");
            testStack.add(inputReader.nextLine());
        }
        while (testStack.isEmpty() == false){
            System.out.println(testStack.pop());
        }
    }
}

