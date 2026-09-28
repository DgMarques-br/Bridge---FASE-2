package src.implementacao;

import java.util.List;

public class ExportadorHTML implements FormatoExportacao {
    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[HTML] Gerando <html><head><title>" + titulo + "</title></head><body>");
        System.out.println("[HTML] <h1>" + titulo + "</h1>");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[HTML] <ul>");
        for (String linha : dados) {
            System.out.println("  <li>" + linha + "</li>");
        }
        System.out.println("[HTML] </ul>");
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[HTML] </body></html> -> Pagina renderizada.\n");
    }
}