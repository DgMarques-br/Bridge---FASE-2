package src.implementacao;

import java.util.List;

public class ExportadorPDF implements FormatoExportacao {
    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[PDF] Desenhando cabecalho: " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[PDF] Escrevendo corpo do relatorio...");
        for (String linha : dados) {
            System.out.println("  -> " + linha);
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[PDF] Arquivo PDF gerado e salvo com sucesso.\n");
    }
}