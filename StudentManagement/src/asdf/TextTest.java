package asdf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  File inFile = new File("C:\\\\Users\\\\BomSeol\\\\Desktop\\\\JAVA_Porject\", \"test.txt");
	        File outFile = new File("C:\\\\Users\\\\BomSeol\\\\Desktop\\\\JAVA_Porject\", \"test.txt");
	       
	        //==========================//
	        // �ؽ�Ʈ ���� ����
	        //==========================//
	        BufferedWriter bw = null;
	        try {
	            bw = new BufferedWriter(new FileWriter(outFile));
	            bw.write("�׽�Ʈ �մϴ�.");
	            bw.newLine();
	            bw.write("�׽�Ʈ �մϴ�.1");
	            bw.flush();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally {
	            if(bw != null) try {bw.close(); } catch (IOException e) {}
	        }
	       
	        //==========================//
	        // �ؽ�Ʈ ���� �б�
	        //==========================//
	        BufferedReader br = null;
	        try {
	            br = new BufferedReader(new FileReader(inFile));
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally {
	            if(br != null) try {br.close(); } catch (IOException e) {}
	        }

		
		
	}

}
