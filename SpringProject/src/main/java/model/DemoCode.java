// Java program to illustrate a bean
// created in the spring framework
package model;
public class DemoCode {
    public String name;

    // Create a setter method to
    // set the value passed by user
    public void setName(String name)
    {
        this.name = name;
    }

    // Create a getter method so that
    // the user can get the set value
    public String getName()
    {
        return name;
    }
}
