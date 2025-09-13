//System.out.println
class Avantika
{
public void sam(int x)
{
System.out.println(x);
}
public void sam(char x)
{
System.out.println(x);
}
}

class University
{
public static Avantika a=new Avantika();
}
class test1
{
public static void main(String gg[])
{
University.a.sam(10);//System.out.println
University.a.sam('A');
}
}