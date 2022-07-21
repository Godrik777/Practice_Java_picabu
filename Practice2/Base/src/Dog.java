public class Dog {
    String name;
    int weight;

    public  Dog(String dogName, int dogWeight){
        this.name = dogName;
        this.weight = dogWeight;
    }
public void voice() {
    System.out.println(this.name + " woof");
}
public String getName(){
        return this.name;
}
public void setName(String newName){
        this.name = newName;
}
}
