package zmr;

public class PC {
    CPU cpu;
    HardDisk HD;
    void setCPU(CPU c) {
    	cpu = c ;
        }
    void setHardDisk(HardDisk h) {
    	HD = h ;
        }
    void show() {
    	System.out.println("CPU���ٶ�Ϊ��"+ cpu.getSpeed());
    	System.out.println("Ӳ�̵�����Ϊ��"+ HD.getAmount());
    }
}
