package org.aladin.App;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App.getDocument();
    }
    
    public static Document getDocument() {
    	Document doc = null;
    	try {
			doc = Jsoup.connect("https://www.aladin.co.kr/search/wsearchresult.aspx?SearchTarget=UsedStore&SearchWord=%EC%A7%80%ED%83%B1%ED%95%98%EB%8A%94+%EA%B8%B0%EC%88%A0")
			        .userAgent("Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1667.0 Safari/537.36")
			        .get();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	Elements bo3 = doc.select(".bo3");
    	
    	for(Element ele : bo3) {
    		System.out.println(ele);
    	}
    	
		return doc;
    }
}
