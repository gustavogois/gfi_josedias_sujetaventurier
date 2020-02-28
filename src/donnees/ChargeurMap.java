package donnees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import sujetaventurier.resources.ProjetConstants;


public class ChargeurMap {
	public static char[][]chargeMap() throws IOException{
		char[][] content;
		String value = new String();
		
		ClassLoader classLoader = new ChargeurMap().getClass().getClassLoader();
		InputStream in = classLoader.getResourceAsStream(ProjetConstants.DONNEES_MAP);
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		
		String mapData;
		
		while((mapData = reader.readLine()) != null) {
			value = value + mapData + "\n";
		}
		
		String[] fileData = new String(value).split("\n");
		content = new char[fileData[0].length()][fileData.length];
		
		for(int i = 0; i < fileData.length; i++) {
			content[i] = fileData[i].toCharArray();;
		}
		return content;
	}
}
