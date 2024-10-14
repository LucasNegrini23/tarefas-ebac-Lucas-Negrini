package br.com.lnegrini.adapter;

import java.io.File;
import java.io.IOException;

public interface IPersistenciaArquivos {

    public void gravar(File file) throws IOException;

    public File ler(String caminho);
}
