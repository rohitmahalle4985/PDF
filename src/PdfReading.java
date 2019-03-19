import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import junit.framework.Assert;

public class PdfReading {
public static void main(String[] args) throws IOException {
	
	Object o=new Object();
	
	File file= new File("C:\\Users\\Nishant\\Desktop\\Rohit Automation REsume\\RohitResume(2.5).pdf");
	
	FileInputStream fis=new FileInputStream(file);
	System.out.println("1");
	
	PDFParser parser=new PDFParser(fis);
	parser.parse();
	System.out.println("2");
	
	COSDocument cosdoc= new COSDocument();
	PDDocument pddoc=new PDDocument(cosdoc);
	System.out.println("3");
	
	PDFTextStripper strip=new PDFTextStripper();
	System.out.println("4");
	String data=strip.getText(pddoc);
	System.out.println("4");
	
	System.out.println(data);

	
}
	
	
}
