package stringmethods;

import jdk.swing.interop.SwingInterOpUtils;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlManagerMain {
    public static void main(String[] args) {

         UrlManager um = new UrlManager("https://earthquake.usgs.gov/fdsnws/event/1/query");

        System.out.println(um.getProtocol());
        System.out.println(um.getHost());
        System.out.println(um.getPort());
        System.out.println(um.getPath());
        System.out.println(um.getQuery());
        System.out.println(um.hasProperty("format"));
        System.out.println(um.getProperty("format"));
        System.out.println("--------------Lista----------------");
        for (Property item: um.getPropertyList()) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }



        System.out.println("----------URL CLASS--------------");
        String text = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        try {
            URL url = new URL(text);
            // get the  Query
            String _Query = url.getQuery();
            System.out.println(_Query);
        }
        catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }

    }
}
