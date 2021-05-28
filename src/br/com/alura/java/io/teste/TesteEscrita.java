package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com arquivo
		
		OutputStream fos = new FileOutputStream("Lorem2.txt");
		Writer osr = new OutputStreamWriter(fos);
		BufferedWriter bw  = new BufferedWriter(osr);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine();
		bw.newLine();
		bw.write("cupidatat non proident, sunt in culpa qui officia deserunt mollit anim ");
		
		bw.close();
		

	}

}
