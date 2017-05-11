/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.DAL;
import DAL.MYSQLUnit;

import com.mysql.jdbc.StringUtils;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.export.Exporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

/**
 *
 * @author py
 */
public class ReportBUS {
    MYSQLUnit connect;
    
    public ReportBUS(){
        this.connect = DAL.getDAL();
    }
    
    public void ReportHD(String MaHD, String path)
    {
        if(StringUtils.isEmptyOrWhitespaceOnly(MaHD))
            return;
        try {
            
            
            JasperReport jasperReport = JasperCompileManager
                    .compileReport(path + "/Reports/Bill.jrxml");
            
            // Parameters for report
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("id", MaHD);
            
            // DataSource
            // This is simple example, no database.
            // then using empty datasource.
            JRDataSource dataSource = new JREmptyDataSource();
            
            DAL dal = new DAL();
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
                    parameters, dal.getConnection());
            
            
            // Make sure the output directory exists.
            File outDir = new File(path + "/Output");
            outDir.mkdirs();
            
            Exporter exporter = new JRDocxExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            String filePath = path + "/Output/" + MaHD + ".docx";
            File exportReportFile = new File(filePath);

            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(exportReportFile));

            exporter.exportReport();
            
            try {
                Desktop.getDesktop().open(exportReportFile);
            } catch (IOException ex) {
                //Logger.getLogger(frmCTHD.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Done!");
        } catch (JRException ex) {
            ex.printStackTrace();
            //Logger.getLogger(frmNhapHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
