package file_processor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class FileLoader {

	private static Logger log = Logger.getRootLogger();

	private static final String conf = "src/main/resources/config/configuration_file.config";
	private Map<String, String> records;
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

	private void loadFile(String path) throws IOException {
		records = new HashMap<>();
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				String[] tempArray = line.split("=");
				records.put(tempArray[0].trim(), tempArray[1].trim());
			}
			if (!records.isEmpty()) {
				databasePath = records.get("dataFolder");
			}
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}

	private void parseFile() {
		// TODO trigger process file here
		// Get databasePath here if its from Config
	}

	public String getDatabasePath() {
		return databasePath;
	}

}
