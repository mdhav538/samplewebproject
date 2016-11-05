package de.unimannheim;

import java.io.File;
import java.io.FileInputStream;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

public class Sample {
	
	public static void main(String[] args) throws Exception {
		
		//InputStream in = getClass().getResource("src/test/java/TestCase.java");
		
		File file = new File("C:\\Users\\D064747\\Documents\\LocalHub\\uni-MA\\uni-thesis\\coding\\eclipseworkspace\\samplewebproject\\src\\test\\java\\de\\unimannheim\\TestCase.java");
		
        // creates an input stream for the file to be parsed
        FileInputStream in = new FileInputStream(file);

        CompilationUnit cu;
        try {
            // parse the file
            cu = JavaParser.parse(in);
        } finally {
            in.close();
        }

        // prints the resulting compilation unit to default system output
        System.out.println(cu.toString());
    }
	
	
}
