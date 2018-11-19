package file_processor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class FileLoader {

	private static Logger log = Logger.getRootLogger();
	
	private static final String conf = "src/main/resources/config/configuration_file.config";
	private List<String> records;
	private String databasePath;
	
	public FileLoader() {
		try {
			loadFile(conf);
			parseFile();
		} catch (IOException e) {
			System.out.println("test");
			log.error(e);
		}
	}
	
	public FileLoader(String dataFile) {
		// TODO Load "Database"-File
	}

	private void loadFile(String path) throws IOException{
		records = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line;
		try {
			while((line = reader.readLine()) != null){
				records.add(line);
			};
		} finally{
			if(reader != null) {
				reader.close();
			}
		}
	}

	private void parseFile() {
		// TODO trigger process file here
		//Get databasePath here if its from Config
	}

	public String getDatabasePath(){
		return databasePath;
	}
	
}
