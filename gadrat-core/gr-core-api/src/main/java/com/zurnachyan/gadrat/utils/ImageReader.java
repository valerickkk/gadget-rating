package com.zurnachyan.gadrat.utils;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Image reader
 */
public class ImageReader {

    /**
     * Reads image from provided path
     * @param path image file path
     * @return image bytes
     */
    public static byte[] extractBytesFromImage(String path) {
        File imgPath = new File(path);

        try {
            InputStream input = new FileInputStream(imgPath);
            return IOUtils.toByteArray(input);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
