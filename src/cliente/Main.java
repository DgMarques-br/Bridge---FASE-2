package src.cliente;

import src.abstracao.*;
import src.implementacao.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE DE DESACOPLAMENTO (CONSOLE) ===\n");

        // 1. Geração de um Relatório de Vendas em PDF
        System.out.println("--- 1. Relatorio de Vendas (PDF) ---");
        FormatoExportacao exportadorPDF = new ExportadorPDF();
        Relatorio relatorioVendas = new RelatorioVendas(exportadorPDF);
        relatorioVendas.gerarRelatorio();

        // 2. Alteração dinâmica em tempo de execução para Excel
        System.out.println("--- 2. Alteracao em Tempo de Execucao (MUDANDO PARA EXCEL) ---");
        FormatoExportacao exportadorExcel = new ExportadorExcel();
        relatorioVendas.setExportador(exportadorExcel);
        relatorioVendas.gerarRelatorio();

        // 3. Geração de um Relatório de RH em HTML
        System.out.println("--- 3. Novo Relatorio de RH (HTML) ---");
        FormatoExportacao exportadorHTML = new ExportadorHTML();
        Relatorio relatorioRH = new RelatorioRH(exportadorHTML);
        relatorioRH.gerarRelatorio();
    }
}