public class Height {
// Two instance variables(AP test uses private).
    private int feet;
    private int inches;
// 2 Constructors, 1 wiz 1, 1 wiz 2.
    public Height(int ic){
        inches = ic;
        simplify();
    }
    public Height(int ic, int ft){
        inches = ic;
        feet  = ft;
        simplify();
    }
// simplify method.
    public void simplify() {
        int fusion = feet * 12 + inches;
        feet = fusion / 12;
        inches = fusion % 12;
    }
// Another method.
    public void add(Height ht){
       feet = feet + ht.getFeet();
       inches = feet + ht.getInches();
       simplify();
    }
    public void add(int ic){
       inches = inches + in;
       simplify();
    }
    getFeet(){
        return feet
    }

}



