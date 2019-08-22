package com.zyang25.code.systemdesign;

import java.util.HashMap;

public class L535EncodeandDecodeTinyURL {
    private static String prefix = "http://tinyurl.com/";

    private HashMap<String, String> urls = new HashMap<>();

    public static void main(String[] args) {
        L535EncodeandDecodeTinyURL app = new L535EncodeandDecodeTinyURL();

        System.out.println("encoded " + app.encode("https://leetcode.com/problems/design-tinyurl"));
        
        System.out.println(app.decode(app.encode("https://leetcode.com/problems/design-tinyurl")));
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int h = longUrl.hashCode();

        String sUrl = prefix + h;

        urls.put(sUrl, longUrl);
        
        return sUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urls.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));