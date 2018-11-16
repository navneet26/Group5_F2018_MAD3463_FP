package com.final_project.user_details;

public class Administrator extends User {

    private String adminName;
    private String email;

    public Administrator() {
    }

    public Administrator(String adminName, String email) {
        this.adminName = adminName;
        this.email = email;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean updateCatalog(){
        return true;
    }
}
