package cn.crazy.test;

public class SQLinsert {
	public static void main(String[] args) {
		for(int i=0;i<=10000;i++){
			System.out.println("INSERT INTO app_client (client_name, client_version, remak, time, app_http) VALUES ('°²×¿"+i+"', '1.5.0', null, '2017-02-23 14:23:21', 'http://139.196.88.32/oss/GlobalVisa.apk');");
		}
	}
}
