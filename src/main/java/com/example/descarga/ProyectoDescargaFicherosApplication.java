package com.example.descarga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.descarga.gui.JDescargaFichero.lanzador;

@SpringBootApplication
public class ProyectoDescargaFicherosApplication {

	public static void main(String[] args) {
		lanzador(args);
	}

}
