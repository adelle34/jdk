class bank
{
int getrateofintrest()
{
return 0;
}}
class SBI extends bank
{
int getrateofintrest()
{
return 8;
}
}
class ICICI extends bank
{
int getrateofintrest()
{return 7;
}}
class AXIS extends bank
{
int getrateofintrest()
{
return 9;
}
}
class test{
public static void main(string args[])
SBI s= new SBI();
ICICI i= new ICICI;
AXIS a= new AXIS;
System.out.println ("SBI rate of intrest"+s.getrateofintrest());
System.out.println ("ICICI rate of intrest"+i.getrateofintrest());
System.out.println ("AXIS rate of intrest"+a.getrateofintrest());
}
}
