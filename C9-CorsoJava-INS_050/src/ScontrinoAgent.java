
import it.corsojava.scontrino.Riga;
import it.corsojava.scontrino.tipidati.specifici.Iva;
import it.corsojava.scontrino.tipidati.specifici.Sconto;

public class ScontrinoAgent {

    private TerminalUI ui;

    public ScontrinoAgent(TerminalUI ui){
        this.ui=ui;
    }

    public Riga recuperaRiga(){
        Riga r=new Riga();
        r.setPrezzoUnitario(ui.askDouble("Importo unitario"));
        r.setQuantita(ui.askInt("Quantita"));
        try {
            r.setSconto(new Sconto(ui.askDouble("Sconto")));
        }catch (Exception ex){

        }
        ui.write("Selezionare l'aliquota: A = 22%, B = 10%, C=4%, D=nessuna >");
        String s=ui.read();
        switch (s){
            case "A":
                r.setIva(Iva.IVA_22);
                break;
            case "B":
                r.setIva(Iva.IVA_10);
                break;
            case "C":
                r.setIva(Iva.IVA_4);
                break;
            default:
                r.setIva(Iva.IVA_0);
        }
        return r;
    }

}