package Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import com.decision_aid.bean.testListJxl;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class testxls {
	 public static void xls2String(File file){
	      
	        try{
	            FileInputStream fis = new FileInputStream(file);   
	             
	            jxl.Workbook rwb = Workbook.getWorkbook(fis);   
	            
	            Sheet[] sheet = rwb.getSheets();   
	            for (int i = 0; i < 1; i++) {   
	                Sheet rs = rwb.getSheet(i);   
	                
	                for (int j = 2; j < rs.getRows(); j++) {   
	                   Cell[] cells = rs.getRow(j);   
	                   Cell id = rs.getCell(0,j); 
	                   String jxlid = id.getContents();
	                   Cell name = rs.getCell(1,j);
	                   String jxlname= name.getContents();
	                   testListJxl tlj = new testListJxl();
	                   tlj.setId(jxlid);
	                   tlj.setName(jxlname);
	                  
	                   List<testListJxl> list = new ArrayList<testListJxl>();
	                   
	                   list.add(tlj);
                	   System.out.println(list);
	                   
	                }   
	            }   
	            fis.close();   
	            
	        }catch(Exception e){
	            e.printStackTrace();
	        }


	        
	      
	    }
}
