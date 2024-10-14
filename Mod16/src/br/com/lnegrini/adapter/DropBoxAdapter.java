package br.com.lnegrini.adapter;

import br.com.lnegrini.nuvem.DropBox;
import br.com.lnegrini.nuvem.DropBoxFile;

import java.io.File;

public class DropBoxAdapter implements IPersistenciaArquivos{

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropbox) {
        this.dropBox = dropbox;
    }

    @Override
    public void gravar(File file) {
        dropBox.upload(file.getAbsolutePath());
    }

    @Override
    public File ler(String caminho) {
        DropBoxFile file = dropBox.download(caminho);
        return new File(file.getLocalPath());
    }
}
