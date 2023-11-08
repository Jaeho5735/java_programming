class PersonalComputer {
    private Monitor monitor;
    private Computer computer;
    public PersonalComputer(Computer computer, Monitor monitor){
        this.computer = computer;
        this.monitor = monitor;
    }
    public String printInfo() {
        return computer.turnOn()+ "\n"+ monitor.turnOn() +
                "\nThe spec of the computer "+ computer.printInfo() +
                "\nThe spec of the monitor " + monitor.printInfo();
    }
}
class Monitor{
    private String monitorSize;
    private String color;
    private String power;
    public Monitor(String monitorSize, String color, String power){
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }
    public String turnOn(){
        return "Turning on the monitor.";
    }
    public String printInfo(){
        return "\nMonitor size : " + monitorSize + "\nColor : " + color + "\nPower : " + power;
    }
}
class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;
    public Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }
    public String turnOn(){
        return "Turning on the computer.";
    }
    public String printInfo(){
        return "\nCPU : " + cpu + "\nMemory : " + memory + "\nHDD : " + hd + "\nColor : " + color + "\nPower : " + power;
    }
}
public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer(new Computer("Core i7", "32GB",
                "2TB", "흰색", "700W"),
                new Monitor("32인치", "검은색", "45W"));
        System.out.println();
        System.out.println(pc.printInfo());
    }
}
