import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(getSize() - 1);
    }

    public Object pop(){
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o){
        list.add(o);
    }

    @Override
    public String toString(){
        return "stack: " + list.toString();
    }


    public Object clone(){
        try{
            MyStack myStackClone = (MyStack)super.clone();
            myStackClone.list = (ArrayList)(list.clone());
            return myStackClone;
        }
        catch (CloneNotSupportedException ex){
            return null;
        }
    }
}
