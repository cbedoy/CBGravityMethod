package com.cbedoy.gravitymethod;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

/**
 * Created by Carlos on 10/05/2014.
 */
public class CountryService extends AsyncTask<String, Integer, String> {

    private Context context;
    private ProgressDialog progressDialog;

    public CountryService(Context context){
        this.context = context;
    }



    @Override
    protected String doInBackground(String... strings) {
        CBRESTClient rest = new CBRESTClient("http://api.openweathermap.org/data/2.5/weather");

        //rest.AddParam("q", param);
        Log.i("Fix", "Do");
        return runSerive(rest);
    }

    @Override
    protected void onPreExecute(){
        this.progressDialog = ProgressDialog.show(context, "", "Cargando...");
        Log.i("Fix", "Pre");
    }

    public String runSerive(CBRESTClient request) {


        try {
            request.Execute(CBRESTClient.RequestMethod.GET);
            Log.i("Fix", "Run");
        } catch (Exception e) {
            e.printStackTrace();
            Log.i("Fix", "Valio pito");

        }

        return request.getResponse();

    }

    //http://api.openweathermap.org/data/2.5/weather?q=Aguascalientes


    protected void onPostExecute(String result){
        this.progressDialog.dismiss();
        Log.i("Fix", "Post");
/*
        try{
            JSONObject jsonObject = new JSONObject(result);

            ItemLocationParser parser = new ItemLocationParser();
            ArrayList<IModel> models = parser.getDataParsed(jsonObject);
            MainActivity.mthis.placeholderFragment.reloadData(models);

        }catch (Exception e){
            e.printStackTrace();
            Log.i("Fix", e.getMessage());
        }
*/
    }

}
