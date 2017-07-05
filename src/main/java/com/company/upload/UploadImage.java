package com.company.upload;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class UploadImage {

    private File file=null;


    public void ReadImage()
    {

        try
        {
            file=new File("myimage.jpg");
            ITesseract instance=new Tesseract();
            instance.setDatapath("/usr/share/tesseract-ocr/");
            instance.setLanguage("eng");
            String result =instance.doOCR(file);

            System.out.println(result);

        }catch (Exception e)
        {
            System.out.println(e.getMessage());

        }
    }
}
