# 再米热·海米特 2019311573 计192

## java第一次实验
#### 实验目的
1.学习java有关知识。<br/>
2.深入理解体会有关方法、构造方法、属性等知识。<br/>
3.尝试定义属性的修饰符多样化以及类中定义方法操作属性。<br/>
4.体会在实际问题解决时，需要增加合理的逻辑判断。<br/>
5.尝试多种不同的对对象属性调用的方法。<br/>
6.接触并学会使用github，同时学会markdown语言书写实验报告。<br/>
### 实验设计
1.按照题目要求，先完成基本的对pc机的模拟，含有CPU、HardDisk、PC三个类，以及最后一个Test类。<br/>
2.在基本完成的基础上，加入CPU的新属性品牌，并加入对CPU品牌和速度的逻辑判断；加入HD的新属性类型，同时有对HD的存储容量和类型的逻辑判断。<br/>
### 核心方法
 cpu类
package zmr;

public class Test {
public static void main(String args[]) {
	CPU cpu=new CPU();
	HardDisk disk=new HardDisk();
	PC pc=new PC();
	cpu.setSpeed(2200);
	disk.setAmount(200);
	pc.setCPU(cpu);
	pc.setHardDisk(disk);
	pc.show();
}
}
HardDisk类
package zmr;

public class HardDisk {
    int amount;
    int getAmount() {
    	return amount;
    }
    public void setAmount(int amount) {
    	this.amount=amount;
    }
}
PC类
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
    	System.out.println("CPU的速度为："+ cpu.getSpeed());
    	System.out.println("硬盘的容量为："+ HD.getAmount());
    }
}
Test类
package zmr;

public class Test {
public static void main(String args[]) {
	CPU cpu=new CPU();
	HardDisk disk=new HardDisk();
	PC pc=new PC();
	cpu.setSpeed(2200);
	disk.setAmount(200);
	pc.setCPU(cpu);
	pc.setHardDisk(disk);
	pc.show();
}
}
实验结果
![](https://github.com/zamirayhat/-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201008195510.jpg)
实验感想
java这么课对我来说有一点难度，这次的实验我也做的不是很好，但是尽力了
