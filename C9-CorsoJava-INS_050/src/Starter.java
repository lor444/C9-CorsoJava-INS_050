import it.corsojava.scontrino.Riga;

public class Starter {

    public static void main(String[] args) {
        TerminalUI ui = new TerminalUI();
        ScontrinoAgent agent=new ScontrinoAgent(ui);

        Riga r = agent.recuperaRiga();
        ui.writeln("Totale riga: "+r.getPrezzoTotale());
    }

}
