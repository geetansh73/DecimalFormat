class DecimalFormat
{
public static void main(String geetu[])
{
float x=3.1467235;
DecimalFormat df=new DecimalFormat();
System.out.print(df.format(x));
System.out.print(String.format("1.2f",x));
}
}
