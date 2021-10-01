package myownread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class MyReader extends BufferedReader {
	//el constructor esta epecficando de donde va a obtener su entrada
	public MyReader(Reader in) {
		super(in);
	}
	//Cuando a MyReader se le llama sin parametros dentro
	//del constructor, automáticamente enlaza a la entrada del teclado
	public MyReader () {
		super(new InputStreamReader(System.in));
	}
	public Integer readInt() throws NumberFormatException, IOException {
			return  Integer.parseInt(this.readLine()) ;
	}
	public Double readDouble( ) throws NumberFormatException, IOException {
		return Double.parseDouble(this.readLine());
	}
}
