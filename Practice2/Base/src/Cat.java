public class Cat {
    String name;
    int weight;

    public Cat(String catName, int catWeight){
        this.name = catName;
        this.weight = catWeight;
    }
    public void voice(){
        System.out.println(this.name + " meow");
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
