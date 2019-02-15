package cn.crazy.face2object;

public class Client {
	public static void main(String[] args){
		//成员变量和类变量的访问
		Persion p1 = new Persion();
		p1.setAge(12);
		p1.setName("Jim");
		p1.eyeNum = 3;
		p1.info();
		Persion p2 = new Persion();
		Persion.eyeNum=2;
		p2.setAge(14);
		p2.setName("Tom");
		p2.info();
		//三种初始化方法在编译时都会放在构造器中进行初始化变量，构造函数初始化语句放在最后
		Cat cat1 = new Cat(12,"Jim");
		System.out.println(cat1);
		Cat cat2 = new Cat(13,"Tom");
		System.out.println(cat2);
		//类变量初始化
		System.out.println("count类变量的值："+Price.count);
		System.out.println("name类变量的值："+Price.name);
		
	}
}
