package pack1;

public class PC {
	 CPU cpu;
	 HardDisk disk;
	 void setCPU(CPU cpu){
	  this.cpu=cpu;
	 }
	 void setHardDisk(HardDisk disk){
	  this.disk=disk; 
	 }
	 void show(){
	  System.out.println("CPU�ٶ�"+cpu.getSpeed());
	  System.out.println("CPU�ͺ�"+cpu.gettype());
	  System.out.println("Ӳ������"+disk.getAmount());
	  System.out.println("Ӳ���ٶ�"+disk.getspeed2());
	 }
	 
}
