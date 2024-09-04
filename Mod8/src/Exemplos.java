/**
 * @author lucas.negrini
 */

public class Exemplos {

    private int codigo;

    private long codigoMaior;

    private double valorDecimal1;

    private String text;

    private boolean status;

    private final float valorDecimal = 10.0f;  //no float sempre colocar letra "f" apos

    private short codigoMenor;

    private byte codigoMenorzinho;

    public Exemplos() {

    }

    public Exemplos(int val) {
        this.codigo = val;
    }

    public String retornarText() {
        this.codigo = 0;
        return "Lucas";
    }

    public long retornaCodigo (long nun) {
        this.text = "Moreira";
        return nun;
    }

    public int retornarCodigo (int nun) {
        int val = 29;
        String texto = "Negrini";
        this.text = null;
        return val;
    }

    public boolean retornaStatus () {
        return status;
    }
}
