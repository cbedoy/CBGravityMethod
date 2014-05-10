package com.cbedoy.gravitymethod;

/**
 * Created by Carlos on 10/05/2014.
 */
public class MasterController {

    private static MasterController masterController;

    private ICountryDelegate                countryDelegate;
    private ICountryRepresentationDelegate  countryRepresentationDelegate;

    public static MasterController getInstance(){
        if(masterController == null)
            masterController = new MasterController();
        return masterController;
    }


}
