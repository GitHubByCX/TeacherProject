package Test;
import java.io.File;
import java.io.FileInputStream;

public class Test01 {

	public static void main(String[] args) {
		 File file = new File("C:/计算机系教师通讯录20181120（73人） (1).xls");
		 testxls  test = new testxls();
		 test.xls2String(file);		
	}
	
}
