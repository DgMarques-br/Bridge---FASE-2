package src.abstracao;
import src.implementacao.FormatoExportacao;

public abstract class Relatorio {
    // Variável protected de acordo com o seu diagrama
    protected FormatoExportacao exportador;

    public Relatorio(FormatoExportacao exportador) {
        this.exportador = exportador;
    }

    public void setExportador(FormatoExportacao exportador) {
        this.exportador = exportador;
    }

    // Método abstrato conforme o diagrama
    public abstract void gerarRelatorio();
}