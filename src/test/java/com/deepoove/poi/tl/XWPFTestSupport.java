package com.deepoove.poi.tl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import com.deepoove.poi.XWPFTemplate;

public class XWPFTestSupport {

    public static XWPFTemplate readNewTemplate(XWPFTemplate template) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        template.write(byteArrayOutputStream);
        template.close();
        return XWPFTemplate.compile(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()),
                template.getConfig());
    }

    public static XWPFDocument readNewDocument(XWPFTemplate template) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        template.write(byteArrayOutputStream);
        template.close();
        return new XWPFDocument(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
    }

}
