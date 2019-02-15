package cn.crazy.face2object;
/*类变量初始化*/
public class Price {
	//定义时初始化
	static int count = 2;
	//静态初始化块
	static {
		System.out.println("-----静态初始化块------");
		name = "Java编程"; 
	}
	static String name = "疯狂Java讲义";
}
