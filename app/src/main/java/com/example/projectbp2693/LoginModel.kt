package com.example.projectbp2693

class LoginModel {
    //variabel
    var username =" "
    var password = ""
    //method/func
    fun loginCek() : Boolean{
        if(username.equals("aulia") && password.equals("admin")) {
            return true
        }
        else {
            return false
        }
    }

}