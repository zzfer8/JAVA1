package pack1;

public class Text {
	public static void main(String args[]) {
	  //����һ��CPU����
		CPU cpu =new CPU();
	  //��cpu��speed����Ϊ2200
	    cpu.setSpeed(2200);
	  //cpu�ͺ�  
	    cpu.settype("i7-9750H");
	  //����һ��HardDisk����
	    HardDisk disk=new HardDisk();
	  //��disk��amount����Ϊ200
	    disk.setAmount(200);
	  //Ӳ�̶�д�ٶ�  
	    disk.setspeed2(500);
	  //����һ��PC����
	    PC pc=new PC();
	    pc.setCPU(cpu);
	    pc.setHardDisk(disk);
	    pc.show();
	 }
	  
	 
}
