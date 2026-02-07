import com.example.Service.ExportService;
import com.example.exporter.Excelexporter;
import com.example.exporter.Pdfexporter;


public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EXPORTER SERCVICE ");
        System.out.println("----------------------------------------------");

        ExportService exportService = new ExportService(new Excelexporter());
        exportService.getExport();
        System.out.println("<------------------------------------------------>");
        ExportService exportService1 = new ExportService(new Pdfexporter());
        exportService1.getExport();


        }
    }
