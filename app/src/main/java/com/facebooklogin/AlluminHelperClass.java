package com.facebooklogin;

import android.widget.EditText;

public class AlluminHelperClass {
    String name , email , phone ,alname ,alemail , alphone;

    public AlluminHelperClass(EditText name_val, EditText email_val, EditText phone_val) {
    }

    public AlluminHelperClass(String name, String email, String phone, String alname, String alemail, String alphone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.alname = alname;
        this.alemail = alemail;
        this.alphone = alphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAlname() {
        return alname;
    }

    public void setAlname(String alname) {
        this.alname = alname;
    }

    public String getAlemail() {
        return alemail;
    }

    public void setAlemail(String alemail) {
        this.alemail = alemail;
    }

    public String getAlphone() {
        return alphone;
    }

    public void setAlphone(String alphone) {
        this.alphone = alphone;
    }
}
