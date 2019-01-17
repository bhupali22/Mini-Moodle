package com.example.dell.mini_moodle;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;


/**
 * Created by DELL on 10/6/2017.
 */

public class pdf_dbms extends Chap_dbms {
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.pdf_view);
            String message = getIntent().getStringExtra("Chap");
            pdf_checker(message);
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void pdf_checker(String cname){
        if(cname.equalsIgnoreCase("dbms_chapter1"))
        {
            pdf_view("PDFs/d1.pdf");
        }
        else if(cname.equalsIgnoreCase("dbms_chapter2"))
        {
            pdf_view("PDFs/d2.pdf");
        }
        else if(cname.equalsIgnoreCase("dbms_chapter3"))
        {
            pdf_view("PDFs/d3.pdf");
        }
        else if(cname.equalsIgnoreCase("dbms_chapter4"))
        {
            pdf_view("PDFs/d4.pdf");
        }
        else if(cname.equalsIgnoreCase("dbms_chapter5"))
        {
            pdf_view("PDFs/d5.pdf");
        }
        else
        {
            pdf_view("PDFs/d6.pdf");
        }

    }

    public void pdf_view(String pdf_name)
    {
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset(pdf_name).load();
    }

}






