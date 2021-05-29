package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;



public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com arquivo
		
//		OutputStream fos = new FileOutputStream("Lorem2.txt");
//		Writer osr = new OutputStreamWriter(fos);
//		BufferedWriter bw  = new BufferedWriter(osr);
//		
		
		//BufferedWriter bw  = new BufferedWriter(new FileWriter("Lorem2.txt"));
		//PrintStream ps = new PrintStream("Lorem2.txt");
		PrintWriter ps = new PrintWriter("Lorem2.txt", "UTF-8");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		ps.println();
		ps.println();
		ps.println();
		ps.println();
		ps.println("cupidatat non proident, sunt in culpa qui officia deserunt mollit anim ");
		ps.close();
		
	}

}
