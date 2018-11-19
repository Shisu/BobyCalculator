package file_processor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {

	private static final String conf = "src/main/resources/config/configuration_file.config";
	private List<String> records;
	
	public FileLoader() {
		File confFile = new File(conf);
		try {
			loadFile(conf);
			parseFile();
		} catch (IOException e) {
			// TODO Log
		}
	}
	
	public FileLoader(String dataFile) {
		// TODO Load "Database"-File
	}

	private void loadFile(String path) throws IOException{
		records = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader(path));
		try {
			while(true){
				records.add(reader.readLine());				
			}
		} finally{
			if(reader != null) {
				reader.close();
			}
		}
	}

	private void parseFile() {
		// TODO trigger process file here
		
	}

}
