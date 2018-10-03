package com.example.user.qrcode_mysql;

/**
 * Created by user on 2018/5/24.
 */

public class Biodata extends Koneksi {
    String URL = "http://10.122.6.102/server.php";
    String url = "";
    String response = "";

    public String tampilBiodata() {
        try {
            url = URL + "?operasi=view";
            System.out.println("URL Tampil Biodata: " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String inserBiodata(String id,String goods, String company, String material1, String location1, String material2, String location2, String time) {
        try {
            url = URL + "?operasi=insert&id=" + id + "&goods=" + goods + "&company=" + company + "&material1=" + material1 + "&location1=" + location1 + "&material2=" + material2 + "&location2=" + location2+ "&time=" + time;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String getBiodataById(int id) {
        try {
            url = URL + "?operasi=get_biodata_by_id&id=" + id;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String updateBiodata(String id, String goods, String company, String material1, String location1, String material2, String location2, String time) {
        try {
            url = URL + "?operasi=update&id=" + id + "&goods=" + goods + "&company=" + company + "&material1=" + material1 + "&location1=" + location1 + "&material2=" + material2 + "&location2=" + location2+ "&time=" + time;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String deleteBiodata(int id) {
        try {
            url = URL + "?operasi=delete&id=" + id;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

}