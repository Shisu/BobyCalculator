package controller;

import file_processor.FileLoader;
import view.Gui;

public class Main {
	public static void main(String[] args) {
		FileLoader config = new FileLoader();
		
		new Gui();
	}
}