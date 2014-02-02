package com.javilonas.lpowercc.app;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class LPccExtrasTab extends LPccTab implements OnClickListener {
     public LPccExtrasTab(Context context, Activity activity) {
		super(context, activity);
		this.name = "Info";
	}

	@Override
	public View getCustomView(ViewGroup parent)
	{
 		 View v = LayoutInflater.from(mContext).inflate(R.layout.lpcc_extrastab, parent, false);
     	 
    	 final TextView tv = (TextView) v.findViewById(R.id.textViewAppVersion);
 		 try 
 		 {
 	    	final String appVersion = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionName;
			tv.setText("Versión App: " + appVersion);
 		 } 
 		 catch (NameNotFoundException e) 
 		 {
			tv.setText("Versión de Aplicación no encontrada!");
 		 }
  		 
    	 final TextView tv2 = (TextView) v.findViewById(R.id.textViewKernelVersion);
    	 tv2.setText("Kernel version: " + System.getProperty("os.version"));

    	 String s = "";
    	 s += "\n Versión Kernel: " + System.getProperty("os.version");
    	 s += "\n Base ROM: " + android.os.Build.VERSION.INCREMENTAL;
       	 s += "\n Nivel API ROM: " + android.os.Build.VERSION.SDK_INT;
       	 //s += "\n Código ROM: " + android.os.Build.VERSION.CODENAME;
       	 s += "\n Versión Android: " + android.os.Build.VERSION.RELEASE;
         //s += "\n Dispositivo: " + android.os.Build.DEVICE;
         s += "\n Modelo: " + android.os.Build.MODEL;
         //s += "\n Producto: " + android.os.Build.PRODUCT;
         s += "\n Versión Banda Base: " + android.os.Build.getRadioVersion();
         s += "\n Número Serie: " + android.os.Build.SERIAL;
    	 tv2.setText(s);
    	 		 
    	 
 		 return v;
	}

	@Override
	public void onClick(View v) {
	}
}
