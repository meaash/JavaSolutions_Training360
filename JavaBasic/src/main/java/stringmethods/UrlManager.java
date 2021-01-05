package stringmethods;

import java.util.ArrayList;
import java.util.List;

public class UrlManager { //létezik Url osztály URL validátorrral!
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    List<Property> PropertyList = new ArrayList<>();

   public UrlManager(String Url){


        if(isValidUrl(Url)){
            this.protocol = Url.substring(0, Url.indexOf(":")).toLowerCase();
            this.host = myHostAndPort(Url);
            this.port = myPort(Url);
            this.path = myPath(Url).toLowerCase();
            this.query = myQuery(Url).toLowerCase();
            addPropertyFromQuery();
        }
    }

    private String[] splitUrl(String Url){
        if(isValidUrl(Url)){
           return  Url.split("/");}
        throw new IllegalArgumentException("Az Url nem felel meg a szabványnak;");
    }

    private String myHostAndPort(String Url) {

        String[] split = Url.replace("://", "/").split("/");
        if (split[1].contains(":")) {
            String[] hostport = split[1].split(":");
           // port = Integer.parseInt(hostport[1]);
            return hostport[0].toLowerCase();
        }
            return split[1].toLowerCase();

    }
    private Integer myPort(String Url){
        String[] split = Url.replace("://", "/").split("/");
        if (split[1].contains(":")) {
            String[] hostport = split[1].split(":");
            return Integer.parseInt(hostport[1]);}
        return null;
    }

    private String myPath(String Url){
        String url =  Url.replace("://", ":");
        if (splitUrl(Url).length > 1){
        if(url.contains("?")){
            return url.substring(url.indexOf("/"), url.indexOf("?"));  }
        else if(url.contains("/")){
            return url.substring(url.indexOf("/"));
            }
        }
            return "";
        //throw new IllegalArgumentException("Path = Nincs megadva!");

    }
    private String myQuery(String Url){
        if(Url.contains("?")){
            String[] split = Url.replace("?", ";").split(";");
            return split[1];
            }
        return "";
       // throw new IllegalArgumentException("Query = Nincs megadva!");

    }
   private void addPropertyFromQuery(){
        if(!getQuery().isEmpty() && getQuery() !=null ){
        if(query.contains("&")){
        String[] splits =  query.split("&");
            for (String item: splits) {
                String[] items = item.split("=");
                PropertyList.add(new Property(items[0], items[1]));
            }
        }
        else{
            String[] items = query.split("=");
            PropertyList.add(new Property(items[0], items[1]));
        }}

   }

    private boolean isValidUrl (String Url){
       // String[] schemes = {"http","https", "ftp"}; // DEFAULT schemes = "http", "https", "ftp"
       // String regex = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        if(Url.length() > 0 && Url.contains("://")){
            return true;
        }
          throw new IllegalArgumentException("Hibás Url");
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public List<Property> getPropertyList() {
        return PropertyList;
    }

    public boolean hasProperty(String key) { //ezt substringgel egyszerűbb megoldani
        for (Property prop: PropertyList) {
            if(prop.getKey().equals(key)) {
                if (!prop.getValue().isEmpty() && prop.getValue() != null) {
                    return true;
                }
            }
        }
        return false;
    }
    public String getProperty(String key) {
        if (hasProperty(key))
            for (Property prop : PropertyList) {
                if (prop.getKey().equals(key)) {
                    return prop.getValue();
                }
            }

        throw new IllegalArgumentException("A kulcshoz nem tartozik érték");
    }
}
