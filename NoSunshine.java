public class NoSunshine{
public static void main(String[] args)
{
String b="Ain't no sunshine when she's gone";
String c="Anytime she goes away"+"\n";
String d="I know, ";
String e=d.repeat(4)+"\n";
String f=d.repeat(5)+"\n";
String g=f.repeat(4);
a(b);
a("It's not warm when she's away");
a(b);
a("And she's always gone too long\n"+c);
a("Wonder this time where she's gone");
a("Wonder if she's gone to stay");
a(b);
a("And this house just ain't no home\n"+c);
a("And "+e+g+d+d+"\n");
a("Hey, I ought to leave young thing alone\n"+"But ain't no sunshine when she's gone, whoa-whoa\n"+b+"\nOnly darkness every day\n\n"+b+"\nAnd this house just ain't no home\n\n"+c+c+c+"Anytime she goes away");
}
public static void a(String h)
{
System.out.println(h);
}
}