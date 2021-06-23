 class CPU
{
int price=5000;
 class Processor
{
int cores=5;
String manufacture="hp";
}
protected class Ram
{
int memory=124;
String manufacture="intel";
}
}
public class CpuProcessor
{
public static void main(String[]args)
{
CPU cpu=new CPU();
CPU.Processor processor=cpu.new Processor();
CPU.Ram ram=cpu.new Ram();
System.out.println("processor details:\n"+processor.cores+ " "+processor.manufacture);
System.out.println("RAM details:\n"+ram.memory+" "+ ram.manufacture);
}
}