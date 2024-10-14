package br.com.lnegrini.adapter;


import br.com.lnegrini.nuvem.DropBox;
import br.com.lnegrini.nuvem.GoogleDrive;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String args[]) throws IOException {
        String file = "testedropbox.txt";
        String file2 = "testegoogledrive.txt";
        DropBox drop = new DropBox();
        GoogleDrive drive = new GoogleDrive();
        IPersistenciaArquivos arquivos = new GoogleDriveAdapter(drive);
        arquivos.gravar(new File(file2));
        System.out.println(file2);

    }
}
