
package maquina;


public class Func {
    private String estAtual;
    private String leSimb;
    private String proxEst;
    private String escSimb;
    private String movFita;

    public Func(){    
    }
    
    public Func(String estAtual, String leSimb, String proxEst, String escSimb, String movFita){   
        this.estAtual = estAtual;
        this.leSimb = leSimb;
        this.proxEst = proxEst;
        this.escSimb = escSimb;
        this.movFita = movFita;
    }
    
    public String getEstAtual() {
        return estAtual;
    }

    public void setEstAtual(String estAtual) {
        this.estAtual = estAtual;
    }

    public String getLeSimb() {
        return leSimb;
    }

    public void setLeSimb(String leSimb) {
        this.leSimb = leSimb;
    }

    public String getProxEst() {
        return proxEst;
    }

    public void setProxEst(String proxEst) {
        this.proxEst = proxEst;
    }

    public String getEscSimb() {
        return escSimb;
    }

    public void setEscSimb(String escSimb) {
        this.escSimb = escSimb;
    }

    public String getMovFita() {
        return movFita;
    }
    
    public void setMovFita(String movFita) {
        this.movFita = movFita;
    }
    
    public String getFuncao() {
        return "(" + estAtual + "," + leSimb + ") = (" + proxEst + "," + escSimb+ "," + movFita +")";
    }
    
}
