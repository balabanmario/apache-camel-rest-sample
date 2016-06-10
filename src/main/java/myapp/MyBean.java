package myapp;

/**
 * Created by dev2 on 10/06/16.
 */
public class MyBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void someMethodName(){
        System.out.println("invoked someMethodName: "+name);
    }

    public void otherMethodName(){
        System.out.println("invoked otherMethodName: "+name);
    }
}
