package com.example.kpopapplication;

public class Kpop {
    // variabel untuk menampung data item
    private String txt_kpop_name, txt_agency, txt_date_debut;
    private Integer profile_image;

    public Kpop(String txt_kpop_name, String txt_agency, String txt_date_debut, Integer profile_image) {
        this.txt_kpop_name = txt_kpop_name;
        this.txt_agency = txt_agency;
        this.txt_date_debut = txt_date_debut;
        this.profile_image = profile_image;
    }

    public String getTxt_kpop_name() {
        return txt_kpop_name;
    }

    public void setTxt_kpop_name(String txt_kpop_name) {
        this.txt_kpop_name = txt_kpop_name;
    }

    public String getTxt_agency() {
        return txt_agency;
    }

    public void setTxt_agency(String txt_agency) {
        this.txt_agency = txt_agency;
    }

    public String getTxt_date_debut() {
        return txt_date_debut;
    }

    public void setTxt_date_debut(String txt_date_debut) {
        this.txt_date_debut = txt_date_debut;
    }

    public Integer getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(Integer profile_image) {
        this.profile_image = profile_image;
    }
}