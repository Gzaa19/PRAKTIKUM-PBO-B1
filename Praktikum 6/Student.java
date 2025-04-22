public class Student extends Person{
    public Student (String name){
        super(name);
    }

    @Override
    public boolean isASleep(int hr){
        return hr > 2 && hr < 8;
    }
}
