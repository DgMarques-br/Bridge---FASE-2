package src.implementacao;

import java.util.List;

public class ExportadorExcel implements FormatoExportacao {
    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[EXCEL] Criando planilha com titulo: " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[EXCEL] Preenchendo celulas e colunas...");
        for (String linha : dados) {
            System.out.println("  | " + linha + " |");
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[EXCEL] Planilha XLSX salva com sucesso.\n");
    }
}