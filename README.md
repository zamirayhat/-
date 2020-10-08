# 再米热·海米特 2019311573 计192

## java第一次实验
#### 实验目的<br/>
1.学习java有关知识。<br/>
2.深入理解体会有关方法、构造方法、属性等知识。<br/>
3.尝试定义属性的修饰符多样化以及类中定义方法操作属性。<br/>
4.体会在实际问题解决时，需要增加合理的逻辑判断。<br/>
5.尝试多种不同的对对象属性调用的方法。<br/>
6.接触并学会使用github，同时学会markdown语言书写实验报告。<br/>
### 实验设计<br/>
1.按照题目要求，先完成基本的对pc机的模拟，含有CPU、HardDisk、PC三个类，以及最后一个Test类。<br/>
2.在基本完成的基础上，加入CPU的新属性品牌，并加入对CPU品牌和速度的逻辑判断；加入HD的新属性类型，同时有对HD的存储容量和类型的逻辑判断。<br/>
### 核心方法<br/>
 cpu类<br/>
package zmr;<br/>
public class CPU {<br/>
	int speed;<br/>
	int getSpeed() {<br/>
		return speed;<br/>
	}<br/>
	public void setSpeed(int speed) {<br/>
		this.speed=speed;<br/>
	}<br/>
    int brand;<br/>
    int getBrand() {<br/>
    	return brand;<br/>
    }<br/>
    public void setBrand(int brand) {<br/>
    	this.brand=brand;<br/>
    }<br/>
}<br/>
HardDisk类<br/>
package zmr;<br/>
public class HardDisk {<br/>
    int amount;<br/>
    int getAmount() {<br/>
    	return amount;<br/>
    }<br/>
    public void setAmount(int amount) {<br/>
    	this.amount=amount;<br/>
    }<br/>
}<br/>
PC类<br/>
package zmr;<br/>
public class PC {<br/>
    CPU cpu;<br/>
    HardDisk HD;<br/>
    void setCPU(CPU c) {<br/>
    	cpu = c ;<br/>
        }<br/>
    void setHardDisk(HardDisk h) {<br/>
    	HD = h ;<br/>
        }<br/>
    void show() {<br/>
    	System.out.println("CPU的速度为："+ cpu.getSpeed());<br/>
    	System.out.println("硬盘的容量为："+ HD.getAmount());<br/>
    }
}<br/>
Test类<br/>
package zmr;<br/>
public class Test {<br/>
public static void main(String args[]) {<br/>
	CPU cpu=new CPU();<br/>
	HardDisk disk=new HardDisk();<br/>
	PC pc=new PC();<br/>
	cpu.setSpeed(2200);<br/>
	disk.setAmount(200);<br/>
	pc.setCPU(cpu);<br/>
	pc.setHardDisk(disk);<br/>
	pc.show();<br/>
}<br/>
}<br/>
实验结果<br/>
![](https://github.com/zamirayhat/-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201008195510.jpg)<br/>
实验感想<br/>
java这么课对我来说有一点难度，这次的实验我也做的不是很好，但是尽力的去完成了。接下来我会继续努力去学习这门课程的。
