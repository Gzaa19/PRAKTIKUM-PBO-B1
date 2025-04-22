public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean isASleep(int hr){
        return hr > 22  || hr < 7;
    }

    public String toString(){
        return name;
    }

    public void status(int hr){
        if (this.isASleep(hr)){
            System.out.println("Now offline " + this);
        } else {
            System.out.println("Now online " + this);
        }
    }
}
