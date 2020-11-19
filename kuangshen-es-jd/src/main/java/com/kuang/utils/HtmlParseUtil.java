package com.kuang.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class HtmlParseUtil {
    public static void main(String[] args) throws IOException {
        //爬取数据
        String url = "https://uland.taobao.com/sem/tbsearch?keyword=java";
        Document document= Jsoup.parse(new URL(url),30000);
        Element element= document.getElementById("body1240");
        System.out.println(element.html());
    }
}
