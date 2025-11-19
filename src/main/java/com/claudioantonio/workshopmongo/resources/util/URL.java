package com.claudioantonio.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/*
* Decodifica um parâmetro da URL.
* As URLs quando com parâmetros os tem codificados, por isso e necessario um metodo para decodifica-los.
* */
public class URL {
    public static String decodeParam(String text) {
        try {
            return URLDecoder.decode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
}
