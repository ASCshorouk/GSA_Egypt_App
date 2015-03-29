package com.gsamena.gsaegypt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

import com.gsa.adapter.ExpandableListAdapter;


public class NearbyGSA extends Activity {

	
	
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.gsamena.gsaegypt.R.layout.activity_main);

		
		// get the listview
		expListView = (ExpandableListView) findViewById(com.gsamena.gsaegypt.R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);

		// Listview Group click listener
		expListView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,
					int groupPosition, long id) {
				// Toast.makeText(getApplicationContext(),
				// "Group Clicked " + listDataHeader.get(groupPosition),
				// Toast.LENGTH_SHORT).show();
				return false;
			}
		});

		// Listview Group expanded listener
		expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

			@Override
			public void onGroupExpand(int groupPosition) {
				//	Toast.makeText(getApplicationContext(),
				//	listDataHeader.get(groupPosition) + " Expanded",
				//	Toast.LENGTH_SHORT).show();
			}
		});

		// Listview Group collasped listener
		expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

			@Override
			public void onGroupCollapse(int groupPosition) {
				//Toast.makeText(getApplicationContext(),
				//	listDataHeader.get(groupPosition) + " Collapsed",
				//	Toast.LENGTH_SHORT).show();

			}
		});

		// Listview on child click listener
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub




				if(groupPosition==0 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"mohamedabdulmonem@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}



				else if(groupPosition==0 && childPosition==2){

					Intent sha = new Intent(NearbyGSA.this,ShoroukMap.class);
					startActivity(sha);
				}
				else if(groupPosition==0 && childPosition==1){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"ghada@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				//cairo university mails
				else if(groupPosition==1 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"sarasherif@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==1 && childPosition==1){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"wessamfathy@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==1 && childPosition==2){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"ahmedessam@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==1 && childPosition==3){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"mohammedkhalid@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==1 && childPosition==4){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"moatazrefaat@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==1 && childPosition==5){

					Intent cairo = new Intent(NearbyGSA.this,Cairomap.class);
					startActivity(cairo);}
				

				//ain shams mails 
				else if(groupPosition==2 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"ahmedhassan@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==2 && childPosition==1){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{" youssedabdelraouf@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==2 && childPosition==2){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{" ahmedmohammed@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==2 && childPosition==3){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{" esraa.abdelkreem@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==2 && childPosition==4){

					Intent shams = new Intent(NearbyGSA.this,Ainshamsmap.class);
					startActivity(shams);}
				
				//alex mails
				else if(groupPosition==3 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{" lamiaaelmorsy@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==3 && childPosition==1){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"mahmoudnabil@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==3 && childPosition==2){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"youssefmohmoud@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==3 && childPosition==3){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"yahiahisham@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==3 && childPosition==4){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"asmaa1@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==3 && childPosition==5){

					Intent alex = new Intent(NearbyGSA.this,Alexmap.class);
					startActivity(alex);}
				
				//mails for auc
				else if(groupPosition==4 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"mennaahmed@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==4 && childPosition==1){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"jaida@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==4 && childPosition==2){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"passant@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==4 && childPosition==3){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"hassanismail@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==4 && childPosition==4){

					Intent auc = new Intent(NearbyGSA.this,Aucmap.class);
					startActivity(auc);}
				
				
				//arab academy mails
				else if(groupPosition==5 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"mohammedahmad@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==5 && childPosition==1){

					Intent arab = new Intent(NearbyGSA.this,Arabacademymap.class);
					startActivity(arab);}
				
				
				
				//assuit mails
				else if(groupPosition==6 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"johnbolous@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==6 && childPosition==1){

					Intent ass = new Intent(NearbyGSA.this,Assuitmap.class);
					startActivity(ass);}
				
				
				//benha mails
				else if(groupPosition==7 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"waliedmuhammed@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==7 && childPosition==1){

					Intent benha = new Intent(NearbyGSA.this,Benhamap.class);
					startActivity(benha);}
				
				
				//british mails 
				else if(groupPosition==8 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"mohammedhassan1@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==8 && childPosition==1){

					Intent bue = new Intent(NearbyGSA.this,Britishmap.class);
					startActivity(bue);}
				
				
				//mails for german
				else if(groupPosition==9 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"ramymageed@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==9 && childPosition==1){

					Intent guc = new Intent(NearbyGSA.this,Germanmap.class);
					startActivity(guc);}
				
				/*map
				 * for german 
				 */
				//mails for helwan
				else if(groupPosition==10 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"yasminemohamed@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==10 && childPosition==1){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"omarsameh@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==10 && childPosition==2){

					Intent helwan = new Intent(NearbyGSA.this,Helwanuniversity.class);
					startActivity(helwan);}
				
				//mails for monofya
				else if(groupPosition==11 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"eslammohamed@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==11 && childPosition==1){

					Intent mono = new Intent(NearbyGSA.this,Monofyamap.class);
					startActivity(mono);}
				/*map
				 * for monofya
				 */
				//mails for misr engineering
				else if(groupPosition==12 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{" fernando@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==12 && childPosition==1){

					Intent fer = new Intent(NearbyGSA.this,Fernandomap.class);
					startActivity(fer);}
				/*map
				 * for misr engineering
				 */
				//mails for modern academy
				else if(groupPosition==13 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"ramimoneam@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==13 && childPosition==1){

					Intent modern = new Intent(NearbyGSA.this,Modernmap.class);
					startActivity(modern);}
				/*
				 * map
				 * for modern academy
				 */

				//mails for nile academy
				else if(groupPosition==14 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"islamfaiez@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==14 && childPosition==1){

					Intent nile = new Intent(NearbyGSA.this,Nilemap.class);
					startActivity(nile);}
				/*
				 * map
				 * for nile academy
				 */
				//mails of 6 october 
				else if(groupPosition==15 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"sarahtaha@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==15 && childPosition==1){

					Intent oct = new Intent(NearbyGSA.this,Octobermap.class);
					startActivity(oct);}
				/*
				 * map 
				 * for 6 october
				 * 
				 */
				//mails for suez canal
				else if(groupPosition==16 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"minasamir@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==16 && childPosition==1){

					Intent suez = new Intent(NearbyGSA.this,Suezmap.class);
					startActivity(suez);}
				/*
				 * map
				 * for
				 * suez canal
				 */
				//mails for tanta 
				else if(groupPosition==17 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"ayasamir@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==17 && childPosition==1){

					Intent tanta = new Intent(NearbyGSA.this,Tantamap.class);
					startActivity(tanta);}

				
				else if(groupPosition==18 && childPosition==0){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"abdelhamidali@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				
				
				else if(groupPosition==18 && childPosition==1){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"minasamir@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}

				else if(groupPosition==18 && childPosition==2){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"ramimoneam@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==18 && childPosition==3){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"diaa@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==18 && childPosition==4){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"moatazrefaat@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==18 && childPosition==5){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"youssefmahmoud@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==18 && childPosition==6){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"ahmedmohammed@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==18 && childPosition==7){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"EslamMohamed@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==18 && childPosition==8){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"yasminemoham@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else if(groupPosition==18 && childPosition==9){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"fernando@gsa-mena.org"});
					i.putExtra(Intent.EXTRA_SUBJECT, "");
					i.putExtra(Intent.EXTRA_TEXT   , "");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(NearbyGSA.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
				else
				{
					Toast.makeText(NearbyGSA.this, "Hello others", Toast.LENGTH_LONG).show();
				}


				return false;
			}
		});





	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding Parent data
		listDataHeader.add("El Shorouk Academy");
		listDataHeader.add("Cairo University");
		listDataHeader.add("Ain Shams University");
		listDataHeader.add("Alexandria University ");
		listDataHeader.add("American University in Cairo");
		listDataHeader.add("Arab Academy for Science and Technology ");
		listDataHeader.add("Assiut University ");
		listDataHeader.add("Benha University ");
		listDataHeader.add("British University in Egypt ");
		listDataHeader.add("German University in Cairo");
		listDataHeader.add("Helwan University ");
		listDataHeader.add("Menofia University");
		listDataHeader.add("Misr Engineering & Technology Academy");
		listDataHeader.add("Modern Academy");
		listDataHeader.add("Nile Academy For Science ");
		listDataHeader.add("October 6 University ");
		listDataHeader.add("Suez Canal University");
		listDataHeader.add("Tanta University ");
		listDataHeader.add("GSA Advisors");



		// Adding child data  1st item
		List<String> elshorouk_academy = new ArrayList<String>();
		elshorouk_academy.add("Mohamed Abdul Monem");
		elshorouk_academy.add("Ghada Ahmed");
		elshorouk_academy.add("Location On Google Maps");
		;

		// Adding child data  2nd item
		List<String> cairo_university = new ArrayList<String>();
		cairo_university.add("Sara Sherif");
		cairo_university.add("Wessam Fathy");
		cairo_university.add("Ahmed Essam");
		cairo_university.add("Mohamed Khalid");
		cairo_university.add("Al Moataz Bellah Refaat");
		cairo_university.add("Location on Google Maps");

		// Adding child data  3rd item
		List<String> AIn_shams = new ArrayList<String>();
		AIn_shams.add("Ahmed Hassan");
		AIn_shams.add("Youssef Abdelraouf");
		AIn_shams.add(" Ahmed Mohamed");
		AIn_shams.add("Esraa Abdelkareem");
		AIn_shams.add("Location On Google Maps");
		//adding chlid data 4th item 
		List<String> Alexandria_University = new ArrayList<String>();
		Alexandria_University.add(" Lamiaa El-morsy");
		Alexandria_University.add("Mahmoud Nabil");
		Alexandria_University.add("Youssef Mahmoud");
		Alexandria_University.add("Yahia Hisham");
		Alexandria_University.add("Asmaa");
		Alexandria_University.add("Location On Google Maps");

		//adding child daata 5th item
		List<String>American_University = new ArrayList<String>();
		American_University.add("Menna Ahmed");
		American_University.add("Jaida Gamal");
		American_University.add("Passant Mamdouh");
		American_University.add("Hassan Ismail");
		American_University.add("Location On Google Maps");
		//adding child daata 6th item

		List<String>Arab_Academy = new ArrayList<String>();
		Arab_Academy.add("Mohammad Ahmad");
		Arab_Academy.add("Location On Google Maps");
		//adding child daata 7th item

		List<String>Assiut_University = new ArrayList<String>();
		Assiut_University.add("John Bolous");
		Assiut_University.add("Location On Google Maps");
		//adding child daata 8th item

		List<String>Benha_University = new ArrayList<String>();
		Benha_University.add("Walid Muhammed");
		Benha_University.add("Location On Google Maps");
		//adding child daata 9th item

		List<String>British_University = new ArrayList<String>();
		British_University.add("Mohamed Hassan");
		British_University.add("Location On Google Maps");
		//adding child daata 10 item

		List<String>German_University = new ArrayList<String>();
		German_University.add("Ramy Abdul Mageed");
		German_University.add("Location On Google Maps");

		//adding child daata 11 item

		List<String>Helwan_University = new ArrayList<String>();
		Helwan_University.add("Yasmine Mohamed");
		Helwan_University.add("Omar Sameh");
		Helwan_University.add("Location On Google Maps");


		//adding child daata 12 item

		List<String>Menofia_University = new ArrayList<String>();
		Menofia_University.add("Eslam Mohamed");
		Menofia_University.add("Location On Google Maps");
		//adding child daata 13 item

		List<String>Misr_Engineering = new ArrayList<String>();
		Misr_Engineering.add("Fernando Romany");
		Misr_Engineering.add("Location On Google Maps");

		//adding child daata 14 item

		List<String>Modern_Academy = new ArrayList<String>();
		Modern_Academy.add("Rami Abd El Moneam");
		Modern_Academy.add("Location On Google Maps");

		//adding child daata 15 item

		List<String>Nile_Academy = new ArrayList<String>();
		Nile_Academy.add("Islam Faiez");
		Nile_Academy.add("Location On Google Maps");

		//adding child daata 16 item

		List<String>October_6 = new ArrayList<String>();
		October_6.add("Sarah Taha");
		October_6.add("Location On Google Maps");

		//adding child daata 17 item

		List<String>Suez_Canal = new ArrayList<String>();
		Suez_Canal.add("Mina Samir");
		Suez_Canal.add("Location On Google Maps");

		//adding child daata 18 item

		List<String>Tanta_University = new ArrayList<String>();
		Tanta_University.add("Aya Samir");
		Tanta_University.add("Location On Google Maps");
       //adding child data 19 item 
		List<String>GSA_advisors = new ArrayList<String>();
		GSA_advisors.add("Abd Alhamid ali");
		GSA_advisors.add("Mina Samir");
		GSA_advisors.add("Rami Abd El Moneam");
		GSA_advisors.add("Dyaa Eldin Moustafa");
		GSA_advisors.add("Moataz Refaat");
		GSA_advisors.add("Youssef Mahmoud");
		GSA_advisors.add("Ahmed Genaidy");
		GSA_advisors.add("Islam Amer");
		GSA_advisors.add("Yasmine Mohamed");
		GSA_advisors.add("Fernando Romany ");









		listDataChild.put(listDataHeader.get(0), elshorouk_academy); // Header, Child data
		listDataChild.put(listDataHeader.get(1), cairo_university);
		listDataChild.put(listDataHeader.get(2), AIn_shams);
		listDataChild.put(listDataHeader.get(3), Alexandria_University);
		listDataChild.put(listDataHeader.get(4), American_University);
		listDataChild.put(listDataHeader.get(5), Arab_Academy);
		listDataChild.put(listDataHeader.get(6), Assiut_University);
		listDataChild.put(listDataHeader.get(7), Benha_University);
		listDataChild.put(listDataHeader.get(8), British_University);
		listDataChild.put(listDataHeader.get(9), German_University);
		listDataChild.put(listDataHeader.get(10), Helwan_University);
		listDataChild.put(listDataHeader.get(11), Menofia_University);
		listDataChild.put(listDataHeader.get(12), Misr_Engineering);
		listDataChild.put(listDataHeader.get(13), Modern_Academy);
		listDataChild.put(listDataHeader.get(14), Nile_Academy);
		listDataChild.put(listDataHeader.get(15), October_6);
		listDataChild.put(listDataHeader.get(16), Suez_Canal);
		listDataChild.put(listDataHeader.get(17), Tanta_University);
		listDataChild.put(listDataHeader.get(18), GSA_advisors);
		


	}
}
