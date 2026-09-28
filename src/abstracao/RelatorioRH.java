package src.abstracao;

import src.implementacao.FormatoExportacao;
import java.util.Arrays;
import java.util.List;

public class RelatorioRH extends Relatorio {

    public RelatorioRH(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        List<String> dadosRH = Arrays.asList(
            "Joao Silva - Desempenho: Excelente", 
            "Maria Souza - Desempenho: Bom"
        );
        
        this.exportador.desenharCabecalho("Relatorio de Desempenho de RH");
        this.exportador.desenharCorpo(dadosRH);
        this.exportador.finalizarArquivo();
    }
}