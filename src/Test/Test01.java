package Test;
import java.io.File;
import java.io.FileInputStream;

public class Test01 {

	public static void main(String[] args) {
		 File file = new File("C:/�����ϵ��ʦͨѶ¼20181120��73�ˣ� (1).xls");
		 testxls  test = new testxls();
		 test.xls2String(file);		
	}
	
}
