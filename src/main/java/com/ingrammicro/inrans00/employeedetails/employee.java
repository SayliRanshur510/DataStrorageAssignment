package com.ingrammicro.inrans00.employeedetails;

/**
 * Created by INRANS00 on 8/30/2018.
 */

 class employee {

    private String mTitle;
    private String mCompanyName;
    private int mPackage;

    public employee(String Title, String CompanyName, int Package) {
        mTitle = Title;
        mCompanyName = CompanyName;
        mPackage = Package;
    }

    public String getTitle() {
        return mTitle;
    }


    public String getCompanyName() {
        return mCompanyName;
    }


    public int getPackage() {
        return mPackage;
    }

}
