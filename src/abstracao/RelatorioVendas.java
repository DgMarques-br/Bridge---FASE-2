package src.abstracao;

import src.implementacao.FormatoExportacao;
import java.util.Arrays;
import java.util.List;

public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        // Fluxo exato do seu Diagrama de Sequência
        List<String> dadosVendas = Arrays.asList(
            "Produto A - 100 unidades - R$ 5.000", 
            "Produto B - 50 unidades - R$ 2.500"
        );
        
        this.exportador.desenharCabecalho("Relatorio de Vendas");
        this.exportador.desenharCorpo(dadosVendas);
        this.exportador.finalizarArquivo();
    }
}