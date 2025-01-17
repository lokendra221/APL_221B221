

public class Main
{
    int age;
    String name;
    
    public void setNAME(String name)
    {
        this.name = name;
    }
    
    public void setAGE(int age)
    {
        this.age = age;
    }
    
    public String getNAME()
    {
        return name;
    }
    
    public int getAGE()
    {
        return age;
    }
    
	public static void main(String[] args) {
	    Main m1 = new Main();
	    m1.setNAME("Lokendra");
	    m1.setAGE(20);
	    
	    System.out.println("Name: " + m1.getNAME());
	    System.out.println("Age: " + m1.getAGE());
	}
}
