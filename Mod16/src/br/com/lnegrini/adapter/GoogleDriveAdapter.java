package br.com.lnegrini.adapter;

import br.com.lnegrini.nuvem.GoogleDrive;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class GoogleDriveAdapter implements IPersistenciaArquivos {

    private GoogleDrive googleDrive;

    public GoogleDriveAdapter(GoogleDrive drive) {
        this.googleDrive = new GoogleDrive();
    }

    @Override
    public void gravar(File file) {
        try {
            byte[] dados = Files.readAllBytes(file.toPath());
            googleDrive.send(dados, file.getName());
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }
    }

    @Override
    public File ler(String nomeArquivo) {
        byte[] dados = googleDrive.get(nomeArquivo);
        File arquivoLocal = new File(nomeArquivo);

        try {
            Files.write(arquivoLocal.toPath(), dados);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return arquivoLocal;
    }
}

