package de.unimannheim;

import java.io.File;

public class Sample {

	public static void main(String[] args) throws Exception {

		// prints the resulting compilation unit to default system output
		// System.out.println(cu.toString());
		File projectDir = new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test");
		System.out.println(projectDir);
		
		
	}

	
}
