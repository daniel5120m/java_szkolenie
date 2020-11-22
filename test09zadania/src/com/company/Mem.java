package com.company;

import java.util.regex.Pattern;

public class Mem {
    /*
        stworzyć klasę Mem, która przechowuje informację o obrazkach:
        - nazwa
        - url obrazka
        - opis
        - czy jest ulubiony
        url obrazka musi być poprawnym adresem url
        stworzyć przykładową listę memów
        wyświetlić tylko te memy, które są ulubione

        private void validateUrl(String url)
         { String pattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]"; if(!Pattern.matches(pattern, url)) { throw new IllegalArgumentException(); } }
     */
    private String name;
    private String urlPicture;
    private String description;
    private double avgOpinion;

    private Mem() {

    }

    Mem(String name, String urlPicture, String description, double avgOpinion) {
        if(checkStr(name)) { this.name = name; } else { this.name = "error";}
        if(checkUrl(urlPicture)) { this.urlPicture = urlPicture; } else { this.urlPicture = "błędny link url"; }
        this.description = description;
        if(checkAvgOpinion(avgOpinion)) { this.avgOpinion = avgOpinion; } else { this.avgOpinion = 0.0; }

    }

    private boolean checkStr(String str) {
        return str.length() >=6;
    }

    private boolean checkUrl(String str) {
        boolean strTest;
        str = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        if(!Pattern.matches(str, urlPicture)) { strTest = false; } else { strTest = true; }
        return strTest;
    }

    private boolean checkAvgOpinion(double avg) {
        boolean avgBoolean;

        if (avg >= 0 && avg <=10 ) { avgBoolean = true; } else { avgBoolean = false; }
        return avgBoolean;
    }

    public String getName() {
        return name;
    }

    public String getUrlPicture() {
        return urlPicture;
    }

    public String getDescription() {
        return description;
    }

    public double getAvgOpinion() {
        return avgOpinion;
    }
}
