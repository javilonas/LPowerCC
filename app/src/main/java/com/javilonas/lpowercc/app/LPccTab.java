package com.javilonas.lpowercc.app;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class LPccTab {
	public String name;
	public List<LPccPane> panes;
	protected Context mContext;
	protected Activity mActivity;
	
	public LPccTab(Context context, Activity activity)
	{
		name = "";
		panes = new ArrayList<LPccPane>();
		mContext = context;
		mActivity = activity;
	}
	
	public View getCustomView(ViewGroup parent)
	{
		return null;
	}
}
