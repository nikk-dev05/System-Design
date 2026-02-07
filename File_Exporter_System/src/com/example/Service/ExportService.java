package com.example.Service;

import com.example.exporter.Exporter;

public class ExportService {

    private  final   Exporter exporter;

    public  ExportService(Exporter exporter){
          this.exporter = exporter;
    }
   public  void  getExport(){
         exporter.getexporter("");
    }
}
