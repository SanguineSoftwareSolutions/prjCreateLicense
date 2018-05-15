/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.License.controller;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author PRASHANT
 */
public class clsGenerateLicense
{

    public static Map<String, clsClientDetails> inputMapClientDtl;

    public void funAddClientCodeAndName()
    {
	try
	{
	    inputMapClientDtl = new TreeMap<String, clsClientDetails>();
	    clsSMSPackDtl objNoSMSPackDtl = new clsSMSPackDtl("", "", "", "NOSMSPACK");

	    inputMapClientDtl.put("000.000", new clsClientDetails("000.000", "Demo ompany", "", "2014-06-19", "2018-10-22", "Enterprise", "100", objNoSMSPackDtl, "1", "comments", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("000.001", new clsClientDetails("001.001", "Monginis - Hadapsar", "", "2014-06-19", "2014-06-19", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    //renamed Red Peppers to LANTERNS
	    inputMapClientDtl.put("002.001", new clsClientDetails("002.001", "LANTERNS", "", "2014-07-14", "2018-10-15", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 07-11-2017 for 1 year //renamed Red Peppers to LANTERNS", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("003.001", new clsClientDetails("003.001", "FOODJOCKEYS LLP", "", "2014-03-02", "2016-03-02", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("004.001", new clsClientDetails("004.001", "CLIMAX OF FLAVORS", "", "2014-03-02", "2016-04-07", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("009.001", new clsClientDetails("009.001", "SANSKAR BAZAAR", "", "2014-05-01", "2016-05-01", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("010.001", new clsClientDetails("010.001", "Junnos Pizza", "", "2014-05-19", "2016-05-07", "Enterprise", "100", objNoSMSPackDtl, "1", "//HO ", "", "", "", "No Bill Deletion"));//
	    inputMapClientDtl.put("010.002", new clsClientDetails("010.002", "JP", "", "2014-06-14", "2018-11-11", "Enterprise", "100", objNoSMSPackDtl, "2", "//rename Junnos Pizza to JP,renewed on 11-11-2017 for 1 year till 11-11-2018", "", "", "", "No Bill Deletion"));// 
	    inputMapClientDtl.put("011.001", new clsClientDetails("011.001", "Soul Cuisine", "", "2014-06-19", "2016-06-22", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    //cancel this license  instead of 024.004 Eden Call Center
	    //hmClientDtl.put("012.001", new clsClientDetails("012.001", "Dales Eden", "","2014-06-25", "2015-01-15", "Enterprise", "100", objNoSMSPackDtl,"","","","No Bill Deletion"));
	    inputMapClientDtl.put("013.001", new clsClientDetails("013.001", "Life Positive Pvt Ltd", "", "2014-06-25", "2050-01-15", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("014.001", new clsClientDetails("014.001", "SONAI RESTAURANT & BAR", "", "2014-06-26", "2015-06-26", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("015.001", new clsClientDetails("015.001", "SWAGAT VEG.", "", "2014-04-26", "2015-06-05", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("016.001", new clsClientDetails("016.001", "BASIL", "", "2014-07-07", "2017-01-07", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("018.001", new clsClientDetails("018.001", "Life Positive Foundation", "", "2014-07-11", "2015-07-11", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("019.001", new clsClientDetails("019.001", "Aisha Fashion Avenue", "", "2014-07-14", "2015-07-14", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("020.001", new clsClientDetails("020.001", "Zeal", "", "2014-08-06", "2016-11-19", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("021.001", new clsClientDetails("021.001", "Mezbaan Carters Blue", "", "2014-08-13", "2014-11-10", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("022.001", new clsClientDetails("022.001", "MR Fried Chicken", "", "2014-09-23", "2018-08-14", "Enterprise", "100", objNoSMSPackDtl, "1", "// renewed on 14-08-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("023.001", new clsClientDetails("023.001", "SID Hospitality", "", "2014-09-23", "2015-10-15", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    //Eden Cake Shop 024.xxx renewed on 05-10-2017 till 31-12-2018
	    inputMapClientDtl.put("024.001", new clsClientDetails("024.001", "Eden Cake Shop", "", "2014-09-23", "2018-12-31", "Enterprise", "100", objNoSMSPackDtl, "1", "// Outlet 1 HO ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("024.002", new clsClientDetails("024.002", "Eden Cake Shop", "", "2015-09-17", "2018-12-31", "Enterprise", "100", objNoSMSPackDtl, "1", "// Outlet 2 Lokhandwala", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("024.003", new clsClientDetails("024.003", "Eden Cake Shop", "", "2016-03-23", "2018-12-31", "Enterprise", "100", objNoSMSPackDtl, "1", "// Outlet 3 Cl.. Road", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("024.004", new clsClientDetails("024.004", "Eden Cake Shop", "", "2016-03-23", "2018-12-31", "Enterprise", "100", objNoSMSPackDtl, "1", "// Outlet 4 Call Center", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("025.001", new clsClientDetails("025.001", "Dravidas Bistro", "", "2014-10-02", "2015-10-15", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("026.001", new clsClientDetails("026.001", "FUNBITEZ", "", "2014-09-23", "2017-05-25", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("026.002", new clsClientDetails("026.002", "CREATIVE FOODS", "", "2015-07-08", "2016-07-08", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("026.003", new clsClientDetails("026.003", "CREATIVE FOODS", "", "2015-07-08", "2016-07-08", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("026.000", new clsClientDetails("026.000", "CREATIVE FOODS", "", "2015-07-08", "2016-07-08", "Enterprise", "100", objNoSMSPackDtl, "1", "//HO Licence", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("027.001", new clsClientDetails("027.001", "Cilantro", "", "2014-10-23", "2095-01-15", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("028.001", new clsClientDetails("028.001", "THE APPETITE MOMOS", "", "2014-11-01", "2018-01-20", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 20-01-2017 by 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("030.001", new clsClientDetails("030.001", "11 SPICES", "", "2014-11-19", "2017-12-19", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("031.001", new clsClientDetails("031.001", "INTERVAL FOODCOURT", "", "2014-11-29", "2016-1-29", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("032.001", new clsClientDetails("032.001", "ROLLING STOVE", "", "2014-11-24", "2015-12-24", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("032.002", new clsClientDetails("032.002", "ROLLING STOVE", "", "2014-11-24", "2015-12-24", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("032.003", new clsClientDetails("032.003", "ROLLING STOVE", "", "2014-11-24", "2015-12-24", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("033.001", new clsClientDetails("033.001", "THE J", "", "2014-12-06", "2016-12-06", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("034.001", new clsClientDetails("034.001", "THE BLUE ROOF CLUB", "", "2014-12-08", "2019-03-07", "Enterprise", "100", objNoSMSPackDtl, "1", "(Lemon Hospitality)//renewed on 13-03-2018 for 1 year till 07-03-2019//renewed on 07-03-2018 for 8 days till 14-03-2018//(Lemon Caters) renewed on 07-03-2017.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("035.001", new clsClientDetails("035.001", "The Local Cafe", "", "2014-12-09", "2017-03-31", "Enterprise", "100", objNoSMSPackDtl, "1", "// old name was \"NE THING FOR CHOCOLATE\" rename on 16-08-2016", "", "", "", "No Bill Deletion"));
	    //hmClientDtl.put("036.001", new clsClientDetails("036.001", "CREATIVE FOODS","2014-12-09","2015-01-09"),"","","","No Bill Deletion"));
	    inputMapClientDtl.put("037.001", new clsClientDetails("037.001", "BAKERS KRAFT", "", "2014-12-19", "2016-02-19", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("037.002", new clsClientDetails("037.002", "BAKERS KRAFT", "", "2014-12-19", "2016-02-19", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));

	    inputMapClientDtl.put("038.001", new clsClientDetails("038.001", "SPICE FUSION", "", "2014-12-19", "2019-04-19", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 19-04-2018 for 1 year //renewed on 19-04-2017 for 1 year", "spicefusion", "2027420063", "spicefusionmulticuisine@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("039.001", new clsClientDetails("039.001", "ABHIRUCHI", "", "2014-12-31", "2015-01-31", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("040.001", new clsClientDetails("040.001", "HAPPINESS DELI", "", "2015-01-03", "2016-01-03", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("041.001", new clsClientDetails("041.001", "THE WHITE LOUNGE", "", "2015-01-09", "2017-01-09", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("042.001", new clsClientDetails("042.001", "Ashoka Pure Veg", "", "2015-01-09", "2018-05-31", "Enterprise", "100", new clsSMSPackDtl("AshokaPureVeg", "2017@AshokaPureVeg@2017", "SANPOS", "Transactional"), "0", "//renewed on 31-05-2017  for year,1000 SMS pack activated on 09-08-2017", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("042.002", new clsClientDetails("042.002", "Ashoka Spice", "", "2015-01-09", "2017-01-09", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("043.001", new clsClientDetails("043.001", "HAKKA EXPRESS", "", "2015-01-14", "2019-01-13", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 08-01-2018 for 1 year till 13-01-2019//renewed on 13-01-2017 for 043.001 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("043.002", new clsClientDetails("043.002", "HAKKA EXPRESS", "", "2015-10-14", "2016-10-14", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));//
	    inputMapClientDtl.put("044.001", new clsClientDetails("044.001", "SWEETS INDIA", "", "2015-09-11", "2015-11-12", "Enterprise", "100", objNoSMSPackDtl, "1", "// HO Licence For OHRIS", "", "", "", "No Bill Deletion"));
	    //hmClientDtl.put("044.002", new clsClientDetails("044.002", "HOTEL KAMAL PVT LTD","2015-09-11","2015-11-12"),"","","","No Bill Deletion"));
	    inputMapClientDtl.put("045.001", new clsClientDetails("045.001", "Mr Beans", "", "2015-02-05", "2016-03-10", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("046.001", new clsClientDetails("046.001", "CHANSON HOSPITALITY PVT. LTD", "", "2015-02-10", "2015-05-11", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("047.001", new clsClientDetails("047.001", "ROYAL CONNAUGHT BOAT CLUB", "", "2015-03-07", "2095-03-07", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("048.001", new clsClientDetails("048.001", "KINGS WHITE CASTLE", "", "2015-03-17", "2019-05-09", "Enterprise", "100", objNoSMSPackDtl, "1", "(MUMBAI)// renew on 10-05-2018 for 1 year till 09-05-2019 ", "Mr.Piyush", "9820759877", "piyush.ja@gmail.com", "No Bill Deletion"));

	    inputMapClientDtl.put("049.001", new clsClientDetails("049.001", "DIVINE BOWL", "", "2015-03-17", "2017-03-17", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("050.001", new clsClientDetails("050.001", "HOTEL OM SAIRAJ", "", "2015-03-17", "2017-05-17", "Enterprise", "100", objNoSMSPackDtl, "1", "//renamed \"SAIRAJ PURE VEG\" as \"HOTEL OM SAIRAJ\" on 23-01-2017", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("051.001", new clsClientDetails("051.001", "BOMBAY CATERING COMPANY", "", "2015-03-23", "2015-06-23", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("052.001", new clsClientDetails("052.001", "CURRY N BITES", "", "2015-04-04", "2016-04-04", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("053.001", new clsClientDetails("053.001", "WHITE DOVE", "", "2015-04-11", "2018-11-20", "Enterprise", "100", objNoSMSPackDtl, "1", "//renew on 21-11-2017 for 1 year till 20-11-2018", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("054.001", new clsClientDetails("054.001", "J HEARSCH COMPANY", "", "2015-04-16", "2018-08-28", "Enterprise", "100", objNoSMSPackDtl, "1", "// renewed on 28-08-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("055.001", new clsClientDetails("055.001", "BOMBAY BURGER", "", "2015-04-16", "2017-05-16", "Enterprise", "100", objNoSMSPackDtl, "1", "//renew on 08-01-2016", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("056.001", new clsClientDetails("056.001", "SYKZ CAFE", "", "2015-05-04", "2017-05-04", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("057.001", new clsClientDetails("057.001", "LALAz mini punjabb", "", "2015-05-11", "2015-06-31", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("058.001", new clsClientDetails("058.001", "Jainsons", "", "2015-05-09", "2015-05-20", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("059.001", new clsClientDetails("059.001", "SHAGUN", "", "2015-05-14", "2015-07-14", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("060.001", new clsClientDetails("060.001", "FLYING SAUCER SKY BAR", "", "2015-06-01", "2018-05-31", "Enterprise", "100", objNoSMSPackDtl, "1", "//renew on 01-12-2017 for 1 month till 31-12-2017//renewed on 02-01-2018 till 31-05-2018", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("061.001", new clsClientDetails("061.001", "THE FOOD PLAZA", "", "2015-06-01", "2017-06-01", "Enterprise", "100", objNoSMSPackDtl, "1", "//rename SHAN E MAROL to THE FOOD PLAZA", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("062.001", new clsClientDetails("062.001", "THE PATIO", "", "2015-06-24", "2017-08-24", "Enterprise", "100", objNoSMSPackDtl, "1", "// extened 7  day from 24-07-2016 now date 17-08-2017", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("063.001", new clsClientDetails("063.001", "NFC", "", "2015-07-01", "2016-07-24", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("064.001", new clsClientDetails("064.001", "Cafe Olivo", "", "2015-07-06", "2017-07-24", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("065.001", new clsClientDetails("065.001", "The Pizza Farm", "", "2015-07-23", "2017-07-23", "Enterprise", "100", objNoSMSPackDtl, "1", "//renew on 08-01-2016", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("066.001", new clsClientDetails("066.001", "A&K HOSPITALITY", "", "2015-08-04", "2017-09-30", "Enterprise", "100", objNoSMSPackDtl, "1", " //changed expriry date from 2016-12-19 to 2017-09-30 on 4th sept 2017 as per sachin sir", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("067.001", new clsClientDetails("067.001", "SHUBHAM GLOBAL FOODS LTD (CURRYMIA)", "", "2015-08-08", "2016-08-08", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("068.001", new clsClientDetails("068.001", "Saloni Retail LLP", "", "2015-08-11", "2016-08-11", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("069.001", new clsClientDetails("069.001", "DAIWONG", "", "2015-08-13", "2018-09-23", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 23-09-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("070.001", new clsClientDetails("070.001", "Bubsterrs", "", "2015-08-20", "2017-09-01", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 01-09-2016", "", "", "", "No Bill Deletion"));
	    //"071.001", "La Bouchee dOr" first License and "162.001,SWEET LAVENDER FOODS LLP" Second Outlet license
	    inputMapClientDtl.put("071.001", new clsClientDetails("071.001", "La Bouchee dOr", "La Bouchee First Outlet", "2015-08-22", "2018-11-23", "Enterprise", "100", objNoSMSPackDtl, "1", " //071.001, La Bouchee dOr first License and 162.001,SWEET LAVENDER FOODS LLP Second Outlet license//renewed on 24-10-2017 for 1 month", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("072.001", new clsClientDetails("072.001", "MOHANLAL S MITHAIWALA", "", "2015-08-25", "2018-09-14", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 14-09-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("073.001", new clsClientDetails("073.001", "I HOSPITALITY", "", "2015-09-01", "2016-03-31", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("074.001", new clsClientDetails("074.001", "THE POONA CLUB LTD", "", "2015-09-02", "2018-05-20", "Enterprise", "100", objNoSMSPackDtl, "1", "comment", "Testing", "Testing", "Testing", "No Bill Deletion"));
	    inputMapClientDtl.put("075.001", new clsClientDetails("075.001", "SWEETS INDIA", "", "2015-01-20", "2016-02-21", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("076.001", new clsClientDetails("076.001", "KLOCK KITCHEN", "", "2015-09-16", "2018-09-07", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewd on 07-10-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("077.001", new clsClientDetails("077.001", "JAINSONS SWEETS", "", "2015-09-16", "2018-10-16", "Enterprise", "100", objNoSMSPackDtl, "1", "// HO  // renewed on 16-10-2017 for 1 year ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("077.002", new clsClientDetails("077.002", "JAINSONS SWEETS", "", "2015-09-16", "2018-10-16", "Enterprise", "100", objNoSMSPackDtl, "1", "// Outlet 1", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("077.003", new clsClientDetails("077.003", "JAINSONS SWEETS", "", "2015-09-16", "2018-10-16", "Enterprise", "100", objNoSMSPackDtl, "1", " // Outlet 2", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("078.001", new clsClientDetails("078.001", "THE NORTHERN FRONTIER", "", "2015-09-18", "2016-10-18", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("079.001", new clsClientDetails("079.001", "Baked & Wired", "", "2015-09-18", "2016-11-02", "Enterprise", "10", objNoSMSPackDtl, "1", "//renewed on 27-10-2016", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("080.001", new clsClientDetails("080.001", "KAREEMS", "", "2015-10-14", "2017-11-15", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 16-11-2016 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("081.001", new clsClientDetails("081.001", "THE APPETITE DESTINATION", "", "2015-10-14", "2016-10-14", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("082.001", new clsClientDetails("082.001", "HONEYGUIDES FOOD PARADISE", "", "2015-10-14", "2016-10-14", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("083.001", new clsClientDetails("083.001", "KIMLING EXPRESS", "", "2015-10-20", "2016-10-20", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("084.001", new clsClientDetails("084.001", "CAFE GOA", "", "2015-10-20", "2016-01-19", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("085.001", new clsClientDetails("085.001", "CHOPS AND HOPS HOSPITALITY SERVICES LLP", "", "2015-10-22", "2017-10-31", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 30-10-2016", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("086.001", new clsClientDetails("086.001", "NAUGHTY ANGEL CAFE", "", "2015-10-23", "2018-12-23", "Enterprise", "100", objNoSMSPackDtl, "1", "//licence extended on 23-11-2017,renewed on 26-12-2017 for 1 year till 23-12-2018", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("087.001", new clsClientDetails("087.001", "MADHUKAR RESTAURANT", "", "2015-11-18", "2018-11-18", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 18-11-2017 for 1 year till 18-11-2018", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("088.001", new clsClientDetails("088.001", "A&K HOSPITALITY", "", "2015-11-24", "2018-03-04", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 06-03-2016 for 1 year", "", "", "", "No Bill Deletion"));
	    //JORUP ENTERPRISE LLP renamed to CAFFA (GUFTOZU)
	    inputMapClientDtl.put("089.001", new clsClientDetails("089.001", "CAFFA", "", "2015-12-17", "2018-10-03", "Enterprise", "100", objNoSMSPackDtl, "1", " //JORUP ENTERPRISE LLP renamed to CAFFA (GUFTOZU)// renewed on 03-10-2017 till 03-10-2018 ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("090.001", new clsClientDetails("090.001", "Mathura a fusion of pure VEG", "", "2015-12-22", "2018-12-22", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 22-12-2016 by 1 year,renewed on 24-12-2017 for 1 year.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("091.001", new clsClientDetails("091.001", "Gourmet Gelato Company Pvt. Ltd.", "", "2015-12-23", "2016-01-23", "Enterprise", "100", objNoSMSPackDtl, "1", "// Payment not received.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("092.001", new clsClientDetails("092.001", "Shree Sound Pvt Ltd", "", "2016-01-08", "2018-12-20", "Enterprise", "100", new clsSMSPackDtl("SanguineERP", "2017@SanguineERP@2017", "SANPOS", "Transactional"), "0", "//HO  Waters  renewed on 19-12-2017 to 1 year till 20-12-2018", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("092.002", new clsClientDetails("092.002", "Shree Sound Pvt Ltd", "", "2016-01-08", "2018-12-20", "Enterprise", "100", new clsSMSPackDtl("SanguineERP", "2017@SanguineERP@2017", "SANPOS", "Transactional"), "0", " //Outlet 1  ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("092.003", new clsClientDetails("092.003", "Shree Sound Pvt Ltd", "", "2016-01-08", "2018-12-20", "Enterprise", "100", new clsSMSPackDtl("SanguineERP", "2017@SanguineERP@2017", "SANPOS", "Transactional"), "0", " //Outlet 2  ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("093.001", new clsClientDetails("093.001", "MAGDALENA", "", "2016-01-12", "2018-09-16", "Enterprise", "100", objNoSMSPackDtl, "1", "//release on 16-09-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("094.001", new clsClientDetails("094.001", "MUCH MORE CAKES", "", "2016-01-12", "2017-01-12", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("095.001", new clsClientDetails("095.001", "PIZZA N U", "", "2016-01-12", "2018-01-27", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 27-01-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("096.001", new clsClientDetails("096.001", "Red Consulting Pvt Ltd", "", "2016-01-16", "2016-04-16", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("096.002", new clsClientDetails("096.002", "Red Consulting Pvt Ltd", "", "2016-01-16", "2016-04-16", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("096.003", new clsClientDetails("096.003", "Red Consulting Pvt Ltd", "", "2016-01-16", "2016-04-16", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("097.001", new clsClientDetails("097.001", "GADGIL HOTELS PVT LTD", "", "2016-01-23", "2016-08-25", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("098.001", new clsClientDetails("098.001", "SAUTEED STORIES", "", "2016-02-01", "2018-02-02", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 02-02-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("099.001", new clsClientDetails("099.001", "HOTEL CITI PRIDE", "", "2016-02-01", "2018-02-01", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 07-02-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("100.001", new clsClientDetails("100.001", "KRISH FOODS HOSPITALITY", "", "2016-02-06", "2019-02-06", "Enterprise", "100", objNoSMSPackDtl, "1", "(Marakesh)//renewed on 03-03-2018 for 1 year till 06-02-2019//renewed on 20-02-2018 for 1 month till 19-03-2018//renewed on 16-02-2018 for 4 days till 19-02-2018//renewed on 06-02-2018 for 8 days till 14-02-2018//renewed on 07-02-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("101.001", new clsClientDetails("101.001", "HUCKLEBERRYS", "", "2016-02-23", "2018-02-22", "Enterprise", "100", objNoSMSPackDtl, "1", "//outlet 1 renewed on 22-02-2017", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("101.002", new clsClientDetails("101.002", "HUCKLEBERRYS", "", "2016-02-23", "2018-02-22", "Enterprise", "100", objNoSMSPackDtl, "1", "//outlet 2 renewed on 22-02-2017", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("102.001", new clsClientDetails("102.001", "RANADE BROTHERS", "", "2016-02-24", "2017-02-24", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("103.001", new clsClientDetails("103.001", "BOMBAY HIGH", "", "2016-03-05", "2018-08-23", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 23-08-2017 till  23-08-2018 ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("104.001", new clsClientDetails("104.001", "Bakers Treat", "", "2016-03-07", "2017-04-07", "Enterprise", "100", objNoSMSPackDtl, "1", "//Bakers Treat// HO Unit", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("104.002", new clsClientDetails("104.002", "Bakers Treat", "", "2016-03-07", "2017-04-07", "Enterprise", "100", objNoSMSPackDtl, "1", "//Bakers Treat// Outlet 1", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("104.003", new clsClientDetails("104.003", "Bakers Treat", "", "2016-03-07", "2017-04-07", "Enterprise", "100", objNoSMSPackDtl, "1", "//Bakers Treat// Outlet 2", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("104.004", new clsClientDetails("104.004", "Bakers Treat", "", "2016-03-07", "2017-04-07", "Enterprise", "100", objNoSMSPackDtl, "1", "//Bakers Treat// Outlet 3", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("104.005", new clsClientDetails("104.005", "Bakers Treat", "", "2016-03-07", "2017-04-07", "Enterprise", "100", objNoSMSPackDtl, "1", "//Bakers Treat// Outlet 4", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("105.001", new clsClientDetails("105.001", "KASHI BHOJNALAY AT KALHER BHIWANDI", "", "2016-03-11", "2017-04-17", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("106.001", new clsClientDetails("106.001", "Independence Brewing Co. Pvt Ltd", "", "2016-03-21", "2017-03-21", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("107.001", new clsClientDetails("107.001", "APT FOODS AND HOSPITALITY", "", "2016-03-23", "2018-03-21", "Enterprise", "100", objNoSMSPackDtl, "1", "//white rose cafe renewed on 21-03-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("108.001", new clsClientDetails("108.001", "221 B Baker Street", "", "2016-03-07", "2017-03-07", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("109.001", new clsClientDetails("109.001", "Chemistry 101", "", "2016-04-11", "2017-04-11", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("110.001", new clsClientDetails("110.001", "CAKE SHOP", "", "2016-01-23", "2016-05-30", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    // MERWANS CONFECTIONERS PVT LTD
	    inputMapClientDtl.put("111.001", new clsClientDetails("111.001", "MERWANS CONFECTIONERS PVT LTD", "", "2016-05-07", "2030-12-30", "Enterprise", "100", objNoSMSPackDtl, "1", "// MERWANS CONFECTIONERS PVT LTD//HO // renewed on 04-01-2017 for demo", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("111.002", new clsClientDetails("111.002", "MERWANS CONFECTIONERS PVT LTD", "", "2016-05-07", "2030-12-30", "Enterprise", "100", objNoSMSPackDtl, "1", "// MERWANS CONFECTIONERS PVT LTD//Outlet 1", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("111.003", new clsClientDetails("111.003", "MERWANS CONFECTIONERS PVT LTD", "", "2016-05-07", "2030-12-30", "Enterprise", "100", objNoSMSPackDtl, "1", "// MERWANS CONFECTIONERS PVT LTD//Outlet 2", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("111.004", new clsClientDetails("111.004", "MERWANS CONFECTIONERS PVT LTD", "", "2016-05-07", "2030-12-30", "Enterprise", "100", objNoSMSPackDtl, "1", "// MERWANS CONFECTIONERS PVT LTD//Outlet 3", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("111.005", new clsClientDetails("111.005", "MERWANS CONFECTIONERS PVT LTD", "", "2016-05-07", "2030-12-30", "Enterprise", "100", objNoSMSPackDtl, "1", "// MERWANS CONFECTIONERS PVT LTD//Outlet 4", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("111.006", new clsClientDetails("111.006", "MERWANS CONFECTIONERS PVT LTD", "", "2016-05-07", "2030-12-30", "Enterprise", "100", objNoSMSPackDtl, "1", "// MERWANS CONFECTIONERS PVT LTD//Outlet 5", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("111.007", new clsClientDetails("111.007", "MERWANS CONFECTIONERS PVT LTD", "", "2016-05-07", "2030-12-30", "Enterprise", "100", objNoSMSPackDtl, "1", "// MERWANS CONFECTIONERS PVT LTD//Outlet 6", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("111.008", new clsClientDetails("111.008", "MERWANS CONFECTIONERS PVT LTD", "", "2016-05-07", "2030-12-30", "Enterprise", "100", objNoSMSPackDtl, "1", "// MERWANS CONFECTIONERS PVT LTD//Outlet 7", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("111.009", new clsClientDetails("111.009", "MERWANS CONFECTIONERS PVT LTD", "", "2016-05-07", "2030-12-30", "Enterprise", "100", objNoSMSPackDtl, "1", "// MERWANS CONFECTIONERS PVT LTD//Outlet 8", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("111.010", new clsClientDetails("111.010", "MERWANS CONFECTIONERS PVT LTD", "", "2016-05-07", "2030-12-30", "Enterprise", "100", objNoSMSPackDtl, "1", "// MERWANS CONFECTIONERS PVT LTD//Outlet 9", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("111.011", new clsClientDetails("111.011", "MERWANS CONFECTIONERS PVT LTD", "", "2016-05-07", "2030-12-30", "Enterprise", "100", objNoSMSPackDtl, "1", "// MERWANS CONFECTIONERS PVT LTD//Outlet 10", "", "", "", "No Bill Deletion"));
	    // GBC MEGA MOTELS(Carnival Group)
	    inputMapClientDtl.put("112.001", new clsClientDetails("112.001", "GBC MEGA MOTELS", "", "2016-05-11", "2017-05-11", "Enterprise", "100", objNoSMSPackDtl, "1", "// GBC MEGA MOTELS(Carnival Group)//HO", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("112.002", new clsClientDetails("112.002", "GBC MEGA MOTELS", "", "2016-05-11", "2017-05-11", "Enterprise", "100", objNoSMSPackDtl, "1", "// GBC MEGA MOTELS(Carnival Group)//outlet 1", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("112.003", new clsClientDetails("112.003", "GBC MEGA MOTELS", "", "2016-05-11", "2017-05-11", "Enterprise", "100", objNoSMSPackDtl, "1", "// GBC MEGA MOTELS(Carnival Group)//outlet 2", "", "", "", "No Bill Deletion"));
	    //WOODFIRE HOSPITALITY BY OLENT
	    inputMapClientDtl.put("113.001", new clsClientDetails("113.001", "WOODFIRE HOSPITALITY BY OLENT", "", "2016-05-14", "2017-05-14", "Enterprise", "100", objNoSMSPackDtl, "1", "//WOODFIRE HOSPITALITY BY OLENT", "", "", "", "No Bill Deletion"));
	    //Dr. Asif Khan Wellness Clinic LLP
	    inputMapClientDtl.put("114.001", new clsClientDetails("114.001", "Dr. Asif Khan Wellness Clinic LLP", "", "2016-05-14", "2017-05-14", "Enterprise", "100", objNoSMSPackDtl, "1", "//Dr. Asif Khan Wellness Clinic LLP//HO", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("114.002", new clsClientDetails("114.002", "Dr. Asif Khan Wellness Clinic LLP", "", "2016-05-14", "2017-05-14", "Enterprise", "100", objNoSMSPackDtl, "1", "//Dr. Asif Khan Wellness Clinic LLP//outlet 1", "", "", "", "No Bill Deletion"));
	    //AHAAN THAI FOOD RESTAURANT
	    inputMapClientDtl.put("115.001", new clsClientDetails("115.001", "AHAAN THAI FOOD RESTAURANT", "", "2016-05-19", "2017-05-19", "Enterprise", "100", objNoSMSPackDtl, "1", " //AHAAN THAI FOOD RESTAURANT", "", "", "", "No Bill Deletion"));
	    //THE WOODSHED INN
	    inputMapClientDtl.put("116.001", new clsClientDetails("116.001", "THE WOODSHED INN", "", "2016-05-31", "2018-05-31", "Enterprise", "100", objNoSMSPackDtl, "1", "//THE WOODSHED INN//renewed on 02-06-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("117.001", new clsClientDetails("117.001", "THE PREM'S HOTEL", "", "2016-06-30", "2018-07-31", "Enterprise", "100", objNoSMSPackDtl, "50", "//renwed on 19-07-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("118.001", new clsClientDetails("118.001", "PICCADILLY RESTAURANT", "", "2016-07-04", "2018-12-05", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 05-12-2017 for 1 year till 05-12-2018", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("119.001", new clsClientDetails("119.001", "MALPANI", "", "2016-08-10", "2017-11-30", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed for DEMO on 01-11-2017", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("120.001", new clsClientDetails("120.001", "Occasions India", "", "2016-08-31", "2017-08-31", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("121.001", new clsClientDetails("121.001", "MEHTA HOSPITALITY", "", "2016-09-21", "2016-10-11", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("122.001", new clsClientDetails("122.001", "FITNESS FUEL", "", "2016-09-29", "2017-09-29", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("123.001", new clsClientDetails("123.001", "SARKAR COLLECTION", "", "2016-10-13", "2016-11-12", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("124.001", new clsClientDetails("124.001", "ATITHYA DINING LLP", "", "2016-10-18", "2018-10-31", "Enterprise", "100", new clsSMSPackDtl("TeddyBoy", "2017@TeddyBoy@2017", "SANPOS", "Transactional"), "10", "//renewed to 10 Tabs, Teddy Boy renewed on 05-12-2017 till 31-10-2018", "", "", "", "No Bill Deletion"));
	    //db old license
	    inputMapClientDtl.put("125.001", new clsClientDetails("125.001", "DARYUSH", "", "2016-10-22", "2018-11-11", "Enterprise", "100", objNoSMSPackDtl, "0", "//db renamed to DARYUSH   renewed on 11-11-2017 for 1 year till 11-11-2018", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("126.001", new clsClientDetails("126.001", "BAKERY", "", "2016-10-22", "2016-11-22", "Enterprise", "100", objNoSMSPackDtl, "1", "", "", "", "", "No Bill Deletion"));
	    //Craft Bar
	    inputMapClientDtl.put("127.001", new clsClientDetails("127.001", "Cumin Food & Beverage Pvt Ltd", "", "2016-10-26", "2018-11-11", "Enterprise", "100", objNoSMSPackDtl, "1", "//Craft Bar//Craft Bar released on 26-10-2016 renewed on 11-11-2017 for 1 year till 11-11-2018", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("128.001", new clsClientDetails("128.001", "Yellow Cup", "", "2016-10-26", "2018-10-26", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 10-11-2017for 1 year till 2018-10-26", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("129.001", new clsClientDetails("129.001", "GRILL 108 STREET", "", "2016-11-01", "2017-10-31", "Enterprise", "100", objNoSMSPackDtl, "1", "//released on 01-11-2016", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("130.001", new clsClientDetails("130.001", "WORLD STREET", "", "2016-11-15", "2017-11-15", "Enterprise", "100", objNoSMSPackDtl, "1", "//released on 15-11-2016", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("131.001", new clsClientDetails("131.001", "KETTLE AND KEG", "", "2016-11-23", "2018-11-23", "Enterprise", "100", objNoSMSPackDtl, "1", "//released on 23-11-2016 renamed on 23-12-2016(KETTLE AND KEG CAFE) ,renewed on 13-11-2017 for 1 year till 23-11-2018", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("132.001", new clsClientDetails("132.001", "JBDD Hospitality LLP", "", "2016-12-05", "2018-03-31", "Enterprise", "100", objNoSMSPackDtl, "5", "//(Delhi Darbar)renewed on  12-09-2017  HO", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("132.002", new clsClientDetails("132.002", "JBDD Hospitality LLP", "", "2016-12-05", "2018-03-31", "Enterprise", "100", objNoSMSPackDtl, "5", "//(Delhi Darbar)renewed on  12-09-2017 Outlet 1", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("132.003", new clsClientDetails("132.003", "JBDD Hospitality LLP", "", "2016-12-05", "2018-03-31", "Enterprise", "100", objNoSMSPackDtl, "6", "//(Delhi Darbar)renewed on  12-09-2017 Outlet 2", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("132.004", new clsClientDetails("132.004", "JBDD Hospitality LLP", "", "2016-12-05", "2018-03-31", "Enterprise", "100", objNoSMSPackDtl, "5", "//(Delhi Darbar)renewed on  12-09-2017 Outlet 3", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("132.005", new clsClientDetails("132.005", "JBDD Hospitality LLP", "", "2016-12-05", "2018-03-31", "Enterprise", "100", objNoSMSPackDtl, "5", "//(Delhi Darbar)renewed on  12-09-2017 Outlet 4", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("133.001", new clsClientDetails("133.001", "CAFE EDESIA", "", "2016-12-10", "2018-12-10", "Enterprise", "100", objNoSMSPackDtl, "1", "//(MUMBAI)released on 10-12-2016 for 1 year,renewed on 14-12-2017 for 1 year till 10-12-2018            ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("134.001", new clsClientDetails("134.001", "Aman Hospitality", "", "2016-12-28", "2018-12-28", "Enterprise", "100", objNoSMSPackDtl, "1", "//released on 19-12-2016 for 1 year till 28-12-2018           ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("135.001", new clsClientDetails("135.001", "QBAA TERRACE", "", "2016-12-29", "2017-01-31", "Enterprise", "100", objNoSMSPackDtl, "1", "//released on 29-12-2016 for 1 month ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("136.001", new clsClientDetails("136.001", "KINKI", "", "2017-01-05", "2019-01-05", "Enterprise", "100", objNoSMSPackDtl, "6", "//renewed on 05-01-2017 for 1 year till 05-01-2019//released on 05-01-2017 for 1 year     ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("137.001", new clsClientDetails("137.001", "The Looney The Lover & The Poet", "", "2017-01-14", "2019-01-15", "Enterprise", "100", objNoSMSPackDtl, "0", "//renewed on 05-02-2018 for 1 year till 15-01-2019//SWEY RESTAURANTS renamed  to The Looney The Lover & The Poet//released on 14-01-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("138.001", new clsClientDetails("138.001", "Arabian Heritage Pvt Ltd", "", "2017-01-14", "2018-01-15", "Enterprise", "100", objNoSMSPackDtl, "0", "//released on 14-01-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("139.001", new clsClientDetails("139.001", "MELTING MORSEL", "", "2017-01-25", "2019-02-26", "Enterprise", "100", objNoSMSPackDtl, "0", "//renewed on 11-02-2018 for 1 year till 26-02-2019//renewed on 25-01-2018 for 1 month till 26-02-2018//released on 25-01-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("140.001", new clsClientDetails("140.001", "THAAL FOOD CONCEPTS PVT LTD", "THAAL FOOD", "2017-01-25", "2019-01-26", "Enterprise", "100", objNoSMSPackDtl, "0", "//renewed on 04-05-2018 for 1 year till 26-01-2019//released on 25-01-2017 for 1 year  ", "Mr. Abi", "961965295", "abdalal@gmail.com", "No Bill Deletion"));
	    //sanguine
	    inputMapClientDtl.put("141.001", new clsClientDetails("141.001", "SANGUINE SOFTWARE SOLUTIONS PVT LTD", "", "2017-01-30", "2099-01-30", "Enterprise", "100", new clsSMSPackDtl("SanguineERP", "2017@SanguineERP@2017", "SANPOS", "Transactional"), "1000", "//sanguine //released on 30-01-2017 for 1 year for sanguine  ,100 SPOS,1K APOS,SanguineERP", "Mr. Sachin Mohite", "9850873037", "sachinm555@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("142.001", new clsClientDetails("142.001", "SHIVSHAKTI SKYDINE", "", "2017-02-04", "2018-02-04", "Enterprise", "100", objNoSMSPackDtl, "0", "//released on 04-02-2017 for 1 year for Shivshakti Skydine ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("143.001", new clsClientDetails("143.001", "THE BIG EGG CAFE", "", "2017-02-04", "2018-02-04", "Enterprise", "100", objNoSMSPackDtl, "0", "//released on 04-02-2017 for 1 year for BIG EGG CAFE", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("144.001", new clsClientDetails("144.001", "DEMO HO", "", "2017-02-07", "2018-03-07", "Enterprise", "100", objNoSMSPackDtl, "0", "//HO released on 07-02-2017 for 1 month for HO            ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("144.002", new clsClientDetails("144.002", "DEMO OUTLET", "", "2017-02-07", "2018-03-07", "Enterprise", "100", objNoSMSPackDtl, "0", "//outlet 1 released on 07-02-2017 for 1 month for Outlet            ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("145.001", new clsClientDetails("145.001", "YASH VENKATESH VENTURES", "", "2017-02-08", "2019-02-08", "Enterprise", "100", objNoSMSPackDtl, "0", "//renewed on 10-02-2018 for 1 year till 08-02-2019///release on 08-02-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("146.001", new clsClientDetails("146.001", "THE DARK ROAST", "", "2017-02-08", "2019-02-08", "Enterprise", "10", objNoSMSPackDtl, "0", "//renewed on 16-02-2018 for 1 year till 08-02-2019//renewed on 09-02-2018 for 8 days till 14-02-2018//release on 08-02-2017 for 1 year          ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("147.001", new clsClientDetails("147.001", "Above and Beyond Hospitality LLP", "", "2017-02-14", "2019-02-14", "Enterprise", "100", objNoSMSPackDtl, "0", "//renewed on 15-02-2018 for 1 year till 14-02-2019//release on 14-02-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("148.001", new clsClientDetails("148.001", "MURPHIES", "", "2017-02-16", "2019-02-15", "Enterprise", "100", objNoSMSPackDtl, "1", "//renewed on 12-04-2018 for bill deletion  //renewed on 17-03-2018 for 1 year till 16-02-2019//renewed on 05-03-2018 for 15 days till 20-03-2018//renewed on 27-02-2018 for 8 days//renewed on 17-02-2018 for 8 days till 19-02-2018//release on 16-02-2017 for 1 year.", "Mr. Aman Talreja", "9823074403", "aman@jenterprises.co.in", "Bill Deletion"));
	    //GREEN BOX 10K SMS pack activated on 30-10-2017
	    inputMapClientDtl.put("149.001", new clsClientDetails("149.001", "GREEN BOX VENTURES PVT LTD", "", "2017-02-17", "2018-02-17", "Enterprise", "10", new clsSMSPackDtl("GREENBOX", "2017@GREENBOX@2017", "SANPOS", "Transactional"), "0", "HO//(GREEN BOX VENTURES LLP RENAMED TO GREEN BOX VENTURES PVT LTD) release on 17-02-2017 for 1 year .", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("149.002", new clsClientDetails("149.002", "GREEN BOX VENTURES PVT LTD", "", "2017-02-17", "2018-02-17", "Enterprise", "10", new clsSMSPackDtl("GREENBOX", "2017@GREENBOX@2017", "SANPOS", "Transactional"), "0", "Outlet 1//release on 17-02-2017 for 1 year ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("149.003", new clsClientDetails("149.003", "GREEN BOX VENTURES PVT LTD", "", "2017-02-17", "2018-02-17", "Enterprise", "10", new clsSMSPackDtl("GREENBOX", "2017@GREENBOX@2017", "SANPOS", "Transactional"), "0", "Outlet 2//release on 17-02-2017 for 1 year ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("149.004", new clsClientDetails("149.004", "GREEN BOX VENTURES PVT LTD", "", "2017-02-17", "2018-02-17", "Enterprise", "10", new clsSMSPackDtl("GREENBOX", "2017@GREENBOX@2017", "SANPOS", "Transactional"), "0", "Outlet 3//release on 17-02-2017 for 1 year ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("149.005", new clsClientDetails("149.005", "GREEN BOX VENTURES PVT LTD", "", "2017-02-17", "2019-02-17", "Enterprise", "5", new clsSMSPackDtl("GREENBOX", "2017@GREENBOX@2017", "SANPOS", "Transactional"), "0", "Outlet 4//renewed on 17-02-2018 for 1 year till 17-02-2019//release on 05-04-2017 for 1 year for Enterprise for 2 machines,renewed 3 more terminal.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("150.001", new clsClientDetails("150.001", "AHB HOSPITALITY LLP", "", "2017-02-18", "2019-02-18", "Enterprise", "100", objNoSMSPackDtl, "0", "//renewed on 17-02-2018 for 1 year till 18-02-2019//  release on 18-02-2017 for 1 year", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("151.001", new clsClientDetails("151.001", "Bottle Street Restaurant & Lounge", "", "2017-02-23", "2019-02-22", "Enterprise", "100", new clsSMSPackDtl("BottleStreet", "2017@BottleStreet@2017", "SANPOS", "Transactional"), "3", "//renewed on 20-03-2018 for 1 year till 22-02-2019//renewed on 02-03-2018 for 20 days till 19-03-2018//renewed on 17-02-2018 for month end till 28-02-2018//renewed on 14-09-2017 for 1 year till 2018-02-23 ,1000 SMS Pack release on 09-08-2017.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("152.001", new clsClientDetails("152.001", "RAJARAJESHWARI", "", "2017-03-04", "2019-03-12", "Enterprise", "100", objNoSMSPackDtl, "0", "//renewed on 09-03-2018 for 1 year till 12-03-2019//renewed on 06-03-2018 for 8 days till 12-03-2018//(Renamed from RAJ RAJESHWARI)  release on 04-03-2017 for 1 year ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("153.001", new clsClientDetails("153.001", "MALGUDI FOODS PVT LTD", "", "2017-04-07", "2019-03-31", "Enterprise", "10", objNoSMSPackDtl, "0", "//(Banana Leaf)Outlet 1  //renewed on 27-03-2018 for 1 year till 31-04-2019//renewed on 03-07-2017  till 31-03-2018", "MR. Biswas", "9819707909", "ravekihospitality@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("153.002", new clsClientDetails("153.002", "MALGUDI FOODS PVT LTD", "", "2017-04-07", "2019-03-31", "Enterprise", "10", objNoSMSPackDtl, "0", "//Outlet 2  //renewed on 27-03-2018 for 1 year till 31-04-2019//renewed on 03-07-2017  till 31-03-2018", "MR. Biswas", "9819707909", "ravekihospitality@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("153.003", new clsClientDetails("153.003", "MALGUDI FOODS PVT LTD", "", "2017-04-07", "2019-03-31", "Enterprise", "10", objNoSMSPackDtl, "0", "//Outlet 3  //renewed on 27-03-2018 for 1 year till 31-04-2019//renewed on 03-07-2017  till 31-03-2018", "MR. Biswas", "9819707909", "ravekihospitality@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("153.004", new clsClientDetails("153.004", "MALGUDI FOODS PVT LTD", "", "2017-04-07", "2019-03-31", "Enterprise", "10", objNoSMSPackDtl, "0", "//Outlet 4  //renewed on 27-03-2018 for 1 year till 31-04-2019//renewed on 03-07-2017  till 31-03-2018", "MR. Biswas", "9819707909", "ravekihospitality@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("153.005", new clsClientDetails("153.005", "MALGUDI FOODS PVT LTD", "", "2017-04-07", "2019-03-31", "Enterprise", "10", objNoSMSPackDtl, "0", "//Outlet 5  //renewed on 27-03-2018 for 1 year till 31-04-2019//renewed on 03-07-2017  till 31-03-2018", "MR. Biswas", "9819707909", "ravekihospitality@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("153.006", new clsClientDetails("153.006", "MALGUDI FOODS PVT LTD", "", "2017-04-07", "2019-03-31", "Enterprise", "10", objNoSMSPackDtl, "0", "//Outlet 6  //renewed on 27-03-2018 for 1 year till 31-04-2019//renewed on 03-07-2017  till 31-03-2018", "MR. Biswas", "9819707909", "ravekihospitality@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("153.007", new clsClientDetails("153.007", "MALGUDI FOODS PVT LTD", "", "2017-04-07", "2019-03-31", "Enterprise", "10", objNoSMSPackDtl, "0", "//Outlet 7  //renewed on 27-03-2018 for 1 year till 31-04-2019//renewed on 03-07-2017  till 31-03-2018", "MR. Biswas", "9819707909", "ravekihospitality@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("153.008", new clsClientDetails("153.008", "MALGUDI FOODS PVT LTD", "", "2017-04-07", "2019-03-31", "Enterprise", "10", objNoSMSPackDtl, "0", "//Outlet 8  //renewed on 27-03-2018 for 1 year till 31-04-2019//renewed on 03-07-2017  till 31-03-2018", "MR. Biswas", "9819707909", "ravekihospitality@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("153.009", new clsClientDetails("153.009", "MALGUDI FOODS PVT LTD", "", "2017-04-07", "2018-03-31", "Enterprise", "10", objNoSMSPackDtl, "0", "//Outlet 9  //renewed on 03-07-2017  till 31-03-2018", "MR. Biswas", "9819707909", "ravekihospitality@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("154.001", new clsClientDetails("154.001", "KP RESTAURANTS", "", "2017-03-11", "2018-05-08", "Enterprise", "10", objNoSMSPackDtl, "2", "//released on 08-05-2017 for 1 year  renewed on 08-05-2017 for 1 year ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("155.001", new clsClientDetails("155.001", "CAVALLI THE LOUNGE", "", "2017-03-24", "2018-03-24", "Enterprise", "5", objNoSMSPackDtl, "7", "//renewed on 07-07-2017 for 1 year  Enterprise for 5 machines ,1 terminal added", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("156.001", new clsClientDetails("156.001", "Raveki Hospitality", "", "2017-03-27", "2019-03-27", "Enterprise", "1", objNoSMSPackDtl, "0", "//Outlet 1 //renewed on 29-03-2018 for 1 year till 27-03-2019//renewed on 27-03-2018 for 1 month till 27-04-2018//released on 27-03-2017 for 1 month  Enterprise for 1 machinesv", "Mr.Ketki", "7021082281", "mubashir@sanguinesoftwares.com", "No Bill Deletion"));
	    inputMapClientDtl.put("156.002", new clsClientDetails("156.002", "Raveki Hospitality", "", "2017-03-27", "2019-03-27", "Enterprise", "1", objNoSMSPackDtl, "0", "//Outlet 2 //renewed on 29-03-2018 for 1 year till 27-03-2019//renewed on 27-03-2018 for 1 month till 27-04-2018//released on 27-03-2017 for 1 month  Enterprise for 1 machines", "Mr.Ketki", "7021082281", "mubashir@sanguinesoftwares.com", "No Bill Deletion"));
	    inputMapClientDtl.put("156.003", new clsClientDetails("156.003", "Raveki Hospitality", "", "2017-03-27", "2019-03-27", "Enterprise", "1", objNoSMSPackDtl, "0", "//Outlet 3 //renewed on 29-03-2018 for 1 year till 27-03-2019//renewed on 27-03-2018 for 1 month till 27-04-2018//released on 27-03-2017 for 1 month  Enterprise for 1 machines", "Mr.Ketki", "7021082281", "mubashir@sanguinesoftwares.com", "No Bill Deletion"));
	    inputMapClientDtl.put("156.004", new clsClientDetails("156.004", "Raveki Hospitality", "", "2018-03-16", "2019-03-15", "Enterprise", "3", objNoSMSPackDtl, "0", "(MUMBAI)//release on 16-03-2018 for 1 year till 15-03-2019 for 3 SPOS ,0 APOS,NO WebStocks,No SMS Pack.", "Mr.Ketki", "7021082281", "mubashir@sanguinesoftwares.com", "No Bill Deletion"));

	    //"SPICE & FLAVOURS RESTAURANT" renamed to "H & S Enterprise", H & S Enterprise renamed to Shah & Sanghvi Hospitality LLP
	    inputMapClientDtl.put("157.001", new clsClientDetails("157.001", "Shah & Sanghvi Hospitality LLP", "", "2017-03-28", "2018-06-30", "Enterprise", "3", objNoSMSPackDtl, "3", "//renewed on 17-03-2018 till 30-06-2018 as per client goes live in 1 july//SPICE & FLAVOURS RESTAURANT renamed to H & S Enterprise, H & S Enterprise renamed to Shah & Sanghvi Hospitality LLP//released on 28-03-2017 for 1 year  Enterprise for 3 machines.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("158.001", new clsClientDetails("158.001", "MALTI FOODS", "", "2017-04-01", "2018-04-01", "Enterprise", "1", objNoSMSPackDtl, "0", "//released on 01-04-2017 for 1 year  Enterprise for 1 machines", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("159.001", new clsClientDetails("159.001", "BIG PLATE CUISINES LLP", "", "2017-04-14", "2019-04-14", "Enterprise", "5", objNoSMSPackDtl, "1", "//release on 15-04-2018 for 1 years til 14-04-2019//released on 14-04-2017 for 1 year  Enterprise for 5 machines", "Mr Aninash", "8097687920", "avinash@divebar.in", "No Bill Deletion"));
	    inputMapClientDtl.put("160.001", new clsClientDetails("160.001", "POTHEADS FOOD PVT. LTD.", "", "2017-04-17", "2018-04-17", "Enterprise", "2", objNoSMSPackDtl, "0", "//released on 17-04-2017 for 1 year  Enterprise for 2 machines", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("161.001", new clsClientDetails("161.001", "HOTEL GRAND CENTRAL", "", "2017-04-18", "2018-01-20", "Enterprise", "6", objNoSMSPackDtl, "6", "//renewed on 19-12-2017 for 1 months till 20-01-2018 Enterprise for 6 machines,6 APOS", "", "", "", "No Bill Deletion"));
	    //"071.001", "La Bouchee dOr" First Outelet and this ia a Second  Outlet license
	    inputMapClientDtl.put("162.001", new clsClientDetails("162.001", "SWEET LAVENDER FOODS LLP", "La Bouchee Second  Outlet", "2017-04-20", "2018-05-12", "Enterprise", "1", objNoSMSPackDtl, "0", "//renewed on 03-05-2018 for 10 days till 12-05-2018//renewed on 21-04-2018 for 10 days till 02-05-2018//(071.001, La Bouchee dOr first licence ) released on 20-04-2017 for 1 year  Enterprise for 1 machines", "Mr. Dhananjay Raut", "8087891693", "dhananjay.raut@laboucheedor.com", "No Bill Deletion"));
	    inputMapClientDtl.put("163.001", new clsClientDetails("163.001", "KADAR KHAN'S SHEESHA", "SHEESHA", "2017-04-22", "2019-04-22", "Enterprise", "100", new clsSMSPackDtl("Sheesha", "2017@Sheesha@2017", "SANPOS", "Transactional"), "8", "//renewed on 03-05-2018 for 1 year till 22-04-2019//renewed on 23-04-2018 for 10 days till 02-05-2018// renewed on 02-11-2017 for 1 year Enterprise for 2 machines, SMS pack for 1K SMS", "Mr. Akash", "9923745566", "it@kapila.co.in", "No Bill Deletion"));
	    inputMapClientDtl.put("164.001", new clsClientDetails("164.001", "GLOBAL FOODS & BEVERAGES PVT. LTD.", "EL TORO", "2017-04-26", "2019-04-26", "Enterprise", "1", objNoSMSPackDtl, "6", "//renewed on 14-05-2018 for 1 year till 26-04-2019// released on 26-04-2017 for 1 year  Enterprise for 1 terminal", "Mr. Omkar", "9820088253", "omkar@globalfoods.co.in", "No Bill Deletion"));
	    //cantos
	    inputMapClientDtl.put("165.001", new clsClientDetails("165.001", "BCMA CANTO", "cantos", "2017-04-26", "2019-04-26", "Enterprise", "7", objNoSMSPackDtl, "1", "//renewed on 26-04-2018 for 1 year till 26-04-2019 //renewed on 24-05-2017 for 1 year from start date  Enterprise for 3 terminals on desktop and 5 terminals on Windows TAB calcel 1 Win Lice n convert it into 1 APOS", "MR. Punkaj", "9892422220/9833008785", "accounts@canto.in", "No Bill Deletion"));
	    inputMapClientDtl.put("166.001", new clsClientDetails("166.001", "SUNNYS WORLD", "", "2017-04-29", "2020-06-29", "Enterprise", "100", objNoSMSPackDtl, "6", "// released on 29-04-2017 for 2 month  Enterprise for 3 terminals on desktop ", "Testing", "Testing", "Testing", "No Bill Deletion"));
	    inputMapClientDtl.put("167.001", new clsClientDetails("167.001", "LAJMI RESTAURANT", "", "2017-05-02", "2018-05-01", "Enterprise", "2", objNoSMSPackDtl, "3", "//renewed on 24-04-2018 for testing purpose// released on 02-05-2017 for 1 Year  Enterprise for 2 terminals on desktop ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("168.001", new clsClientDetails("168.001", "LAJMI RESTAURANT N LOUNGE", "", "2017-05-03", "2018-05-02", "Enterprise", "2", objNoSMSPackDtl, "3", "// released on 03-05-2017 for 1 Year  Enterprise for 2 terminals on desktop ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("169.001", new clsClientDetails("169.001", "A R HOSPITALITY", "", "2017-05-04", "2018-05-02", "Enterprise", "1", objNoSMSPackDtl, "0", "// released on 04-05-2017 for 1 Year  Enterprise for 1 terminals on desktop ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("170.001", new clsClientDetails("170.001", "A1 HEIGHTS N HOSPITALITY PVT LTD", "", "2017-05-04", "2018-05-02", "Enterprise", "2", objNoSMSPackDtl, "6", " // released on 04-05-2017 for 1 Year  Enterprise for 2 terminals on desktop", "MR. JAI", "9987706333", "", "No Bill Deletion"));
	    inputMapClientDtl.put("171.001", new clsClientDetails("171.001", "CHINA GRILL-PIMPRI", "", "2017-05-24", "2018-05-24", "Enterprise", "100", new clsSMSPackDtl("ChinaGrill", "2017@ChinaGrill@2017", "SANPOS", "Transactional"), "2", "// renewed on 17-07-20147 for 1 year  Enterprise for 2 terminals on desktop ...2 days exceeded as per swapnali request and add 1 terminal, 1K SMS Pack activated", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("172.001", new clsClientDetails("172.001", "DIOS HOTEL LLP", "", "2017-05-26", "2018-05-25", "Enterprise", "6", objNoSMSPackDtl, "2", "// renewed on 22-06-2017 for 1 year  Enterprise for 6 terminals on desktop ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("173.001", new clsClientDetails("173.001", "Le Flamington", "", "2017-05-29", "2018-05-29", "Enterprise", "1", objNoSMSPackDtl, "0", "// released on 29-05-2017 for 1 year  Enterprise for 1 terminals on desktop     ", "", "", "", "No Bill Deletion"));
	    //Krimpson
	    inputMapClientDtl.put("174.001", new clsClientDetails("174.001", "KRD Eateries Pvt Ltd", "", "2017-08-02", "2017-11-30", "Enterprise", "100", objNoSMSPackDtl, "0", "//Krimpson// //outlet 1 Wanwari 174.001 Krimpson(KRD Caters)  renewed  on 14-11-2017 for  till 30-11-2017 ,No SMS Pack ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("174.002", new clsClientDetails("174.002", "KRD Eateries Pvt Ltd", "", "2017-08-02", "2017-12-28", "Enterprise", "100", objNoSMSPackDtl, "0", "//Krimpson// //outlet 2 Kharadi 174.002 Krimpson(KRD Caters)  renewed  on 23-12-2017 for  till 28-12-2017 ,No SMS Pack ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("175.001", new clsClientDetails("175.001", "Tjs brew works", "", "2017-06-06", "2018-06-06", "Enterprise", "100", new clsSMSPackDtl("TJsBrew", "2017@TJsBrew@2017", "SANPOS", "Transactional"), "7", " // released on 06-06-2017 for 1 year ,SMS Pack for 1K SMS,  Enterprise for 2 terminals on desktop renewed 2 terminals  to 7", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("176.001", new clsClientDetails("176.001", "FRANCOPHONE EUROPEAN BISTRO & PATISSERIE", "", "2017-06-07", "2018-06-06", "Enterprise", "1", objNoSMSPackDtl, "4", "// released on 07-06-2017 for 1 year  Enterprise for 1 terminals on desktop ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("177.001", new clsClientDetails("177.001", "RAYYAN", "", "2017-06-08", "2018-06-07", "Enterprise", "2", objNoSMSPackDtl, "2", "// renewed on 28-11-2017 for 1 year till 06-07-2018  Enterprise for 2 terminals on desktop ,2 APOS", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("178.001", new clsClientDetails("178.001", "UNWIND", "", "2017-06-08", "2018-06-07", "Enterprise", "100", objNoSMSPackDtl, "20", "renewed 7 APOS// renewed on 06-07-2017 for 1 year  Enterprise for 6 terminals on desktop ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("179.001", new clsClientDetails("179.001", "R & R HOSPITALITY", "", "2017-06-14", "2018-06-14", "Enterprise", "1", objNoSMSPackDtl, "0", "// released on 14-06-2017 renewed on 21-07-2017 for 1 year  Enterprise for 1 terminals on desktop No SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("180.001", new clsClientDetails("180.001", "AVIKA HOTELS PVT LTD", "", "2017-06-15", "2018-07-14", "Enterprise", "3", objNoSMSPackDtl, "1", "// released on 15-06-2017 for 1 year  Enterprise for 3 terminals on desktop No SMS Pack renamed AVIKA GROUP LTD to AVIKA GROUP PVT LTD", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("181.001", new clsClientDetails("181.001", "RMV COMMUNICATION PVT LTD", "", "2017-06-20", "2017-07-20", "Enterprise", "1", objNoSMSPackDtl, "2", "// released on 20-06-2017 for 1 month  Enterprise for 1 terminals on desktop No SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("182.001", new clsClientDetails("182.001", "OOZO", "", "2017-06-21", "2018-06-21", "Enterprise", "6", objNoSMSPackDtl, "10", "//renewed 4 SPOS to 6 SPOS and 12 APOS to 10 APOS//till 21-06-2018// released on 21-06-2017 for 1 month  renewed on 09-08-2017 for 1 year Enterprise for 4 terminals on desktop No SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("183.001", new clsClientDetails("183.001", "VD HOSPITALITY LLP", "", "2017-06-30", "2018-06-30", "Enterprise", "2", objNoSMSPackDtl, "5", "// released on 30-06-2017 for 1 year  Enterprise for 2 terminals on desktop No SMS Packs", "", "", "", "No Bill Deletion"));
	    //"184.001", "BALAJI TRADERS PVT LTD" only MMS License
	    inputMapClientDtl.put("185.001", new clsClientDetails("185.001", "MOHANLAL S MITHAIWALA", "", "2017-07-19", "2018-08-19", "Enterprise", "2", objNoSMSPackDtl, "0", " //(first license 072.001, MOHANLAL S MITHAIWALA) released on 19-07-2017 for 1 month,renewed on 21-08-2017 for 1 year  Enterprise for 2 terminals on desktop No SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("186.001", new clsClientDetails("186.001", "J B Martin", "", "2017-07-19", "2018-07-19", "Enterprise", "1", objNoSMSPackDtl, "2", "//renamed Jordan Hospitality to J B Martin//renewed on 13-01-2018 for 1 year till 19-07-2018// released on 19-07-2017 for 1 month  Enterprise for 1 terminals on desktop and APOS for 2 TABs  No SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("187.001", new clsClientDetails("187.001", "ROSHAN BAKERY", "", "2017-07-19", "2018-07-19", "Enterprise", "2", objNoSMSPackDtl, "0", "// released on 19-07-2017 for 1 month,renewed on 05-10-2017 for 1 year  Enterprise for 2 terminals on desktop No SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("188.001", new clsClientDetails("188.001", "MUMBAI CAFE", "", "2017-07-20", "2018-07-20", "Enterprise", "2", objNoSMSPackDtl, "2", "// released on 20-07-2017 for 1 year  Enterprise for 2 terminals on desktop  and APOA for 2 TAB No SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("189.001", new clsClientDetails("189.001", "CLASSIC BANGLES", "", "2017-07-25", "2018-07-25", "Enterprise", "8", objNoSMSPackDtl, "0", "// released on 25-07-2017 for 1 year,  Enterprise for 8 terminals on desktop , No SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("190.001", new clsClientDetails("190.001", "SQUARE ONE HOSPITALITY LLP", "", "2017-08-03", "2017-10-05", "Enterprise", "2", objNoSMSPackDtl, "1", "// released on 05-09-2017 for 1 month,  Enterprise for 2 terminals on desktop And 1 for APOS, No SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("191.001", new clsClientDetails("191.001", "TOYAM INDUSTRIES LTD", "", "2017-08-05", "2017-09-05", "Enterprise", "3", objNoSMSPackDtl, "3", "// released on 05-08-2017 for 1 month,  Enterprise for 3 terminals on desktop And 4 for APOS, No SMS Pack            ", "", "", "", "No Bill Deletion"));
	    //"192.001" "precision food work" for webStocks
	    inputMapClientDtl.put("193.001", new clsClientDetails("193.001", "NAPLES STAPLES", "", "2017-09-04", "2018-09-04", "Enterprise", "100", objNoSMSPackDtl, "0", "//192.001 precision food work // released on 04-09-2017 for 1 year,  Enterprise for 2 terminals on desktop", "", "", "", "No Bill Deletion"));
	    //Swig 2 Prems Restaurant SWIG 2.0 RENAMED TO SWIG
	    inputMapClientDtl.put("194.001", new clsClientDetails("194.001", "SWIG", "", "2017-09-06", "2018-09-06", "Enterprise", "100", objNoSMSPackDtl, "100", "//renewed on 19-04-2018 for 7 APOS //Swig 2 Prems Restaurant SWIG 2.0 RENAMED TO SWIG// released on 06-09-2017 for 1 month renewed on 06-10-2017 for 1 year,  Enterprise for 2 terminals on desktop ,SWIG 2.0 RENAMED TO SWIG", "Mr. Avishek", "8956270007", "avishek@iceburghospitality.com", "No Bill Deletion"));
	    //"COO COUNTRY OF ORIGIN" for 3 locations renamed to "DESIGNSCAPE & COUNTRY OF ORIGIN" renamed to "COUNTRY OF ORIGIN"
	    inputMapClientDtl.put("195.001", new clsClientDetails("195.001", "COUNTRY OF ORIGIN", "", "2017-09-07", "2018-09-06", "Enterprise", "5", objNoSMSPackDtl, "0", "//COO COUNTRY OF ORIGIN for 3 locations renamed to DESIGNSCAPE & COUNTRY OF ORIGIN renamed to COUNTRY OF ORIGIN //(Mumbai) released on 07-09-2017 for 1 year,  Enterprise for 5 terminals added later on desktop and 0 APOS cancel later,NO SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("195.002", new clsClientDetails("195.002", "COUNTRY OF ORIGIN", "", "2017-09-07", "2018-09-06", "Enterprise", "2", objNoSMSPackDtl, "0", "//COO COUNTRY OF ORIGIN for 3 locations renamed to DESIGNSCAPE & COUNTRY OF ORIGIN renamed to COUNTRY OF ORIGIN//(Mumbai) released on 07-09-2017 for 1 year,  Enterprise for 2 terminals on desktop and 0 APOS,NO SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("195.003", new clsClientDetails("195.003", "COUNTRY OF ORIGIN", "", "2017-09-07", "2018-09-06", "Enterprise", "2", objNoSMSPackDtl, "0", "//COO COUNTRY OF ORIGIN for 3 locations renamed to DESIGNSCAPE & COUNTRY OF ORIGIN renamed to COUNTRY OF ORIGIN//(Mumbai) released on 07-09-2017 for 1 year,  Enterprise for 2 terminals on desktop and 0 APOS,NO SMS Pack", "", "", "", "No Bill Deletion"));
	    //CAFECHEATDAY renamed to "CHEATDAY CAFE"
	    inputMapClientDtl.put("196.001", new clsClientDetails("196.001", "CHEATDAY CAFE", "", "2017-09-15", "2017-12-31", "Enterprise", "100", objNoSMSPackDtl, "0", "//CAFECHEATDAY renamed to CHEATDAY CAFE //(PUNE NIBM) released on 15-09-2017 for 1 month renewed on 20-12-2017 till 31-12-2017,  Enterprise for x terminals on desktop and 0 APOS,NO SMS Pack", "", "", "", "No Bill Deletion"));
	    //renamed "REZBERRY RHINOCERES" to JUHU HOTEL PVT LTD.,  renamed "REZBERRY RHINOCERES" to "Juhu Hotel Pvt Ltd" 
	    inputMapClientDtl.put("197.001", new clsClientDetails("197.001", "Juhu Hotel Pvt Ltd", "", "2017-09-20", "2018-09-20", "Enterprise", "8", objNoSMSPackDtl, "3", "//renamed REZBERRY RHINOCERES to Juhu Hotel Pvt Ltd //(MUMBAI)JUHU HOTEL PVT LTD. renewed on 22-11-2017 for 1 year till 20-09-2018 ,  Enterprise for 1 server ,7 clients terminals added later on desktop and 3 APOS 2 cancel ,1 Webstocks,NO SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("198.001", new clsClientDetails("198.001", "FILL & CHILL", "", "2017-09-20", "2018-09-20", "Enterprise", "1", objNoSMSPackDtl, "0", "//(MUMBAI) released on 20-09-2017 for 1 month,renewed on 05-10-2017 for 1 year,  Enterprise for 1  terminals on desktop and 0 APOS,0 Webstocks,NO SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("199.001", new clsClientDetails("199.001", "STAR EVENT & RESTAURANT", "", "2017-09-28", "2018-09-28", "Enterprise", "1", objNoSMSPackDtl, "0", "//(MUMBAI)Location 1 released on 28-09-2017 for 1 year,  Enterprise for 1  terminals on desktop and 0 APOS,0 Webstocks,NO SMS Pack", "", "", "", "No Bill Deletion"));
	    //payment not received
	    //hmClientDtl.put("199.002", new clsClientDetails("199.002", "STAR EVENT & RESTAURANT", "","2017-09-28", "2018-09-28", "Enterprise","1", objNoSMSPackDtl,"","","","","No Bill Deletion")); //(MUMBAI)Location 2 released on 28-09-2017 for 1 year,  Enterprise for 1  terminals on desktop and 0 APOS,0 Webstocks,NO SMS Pack            
	    inputMapClientDtl.put("200.001", new clsClientDetails("200.001", "AGASTYA HOSPITALITY PVT LTD", "", "2017-09-28", "2018-09-28", "Enterprise", "1", objNoSMSPackDtl, "0", "//(MUMBAI) released on 28-09-2017 for 1 year,  Enterprise for 1  terminals on desktop and 0 APOS,0 Webstocks,NO SMS Pack", "MR. Bhushan", "9967996527", "", "No Bill Deletion"));
	    inputMapClientDtl.put("201.001", new clsClientDetails("201.001", "KINTA FOODS LLP", "", "2017-09-28", "2018-09-28", "Enterprise", "1", objNoSMSPackDtl, "0", "//(MUMBAI) released on 28-09-2017 for 1 year,  Enterprise for 1  terminals on desktop and 0 APOS,0 Webstocks,NO SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("202.001", new clsClientDetails("202.001", "FLYHIGH HOSPITALITY PVT LTD", "", "2017-09-29", "2018-09-30", "Enterprise", "3", objNoSMSPackDtl, "0", "//(MUMBAI) released on 29-09-2017 for 1 year,  Enterprise for 3  terminals on desktop and 1 APOS for reporting,0 Webstocks,NO SMS Pack", "", "", "", "No Bill Deletion"));
	    //"SF ENTERPRISES" renamed to PINK SUGAR
	    inputMapClientDtl.put("203.001", new clsClientDetails("203.001", "PINK SUGAR", "", "2017-09-29", "2018-09-29", "Enterprise", "2", objNoSMSPackDtl, "1", "//SF ENTERPRISES renamed to PINK SUGAR (MUMBAI)// released on 29-09-2017 renewed on 28-10-2017 for 1 year  Enterprise for 1  terminals on desktop 1 for static IP and 1 APOS for reporting,0 Webstocks,NO SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("204.001", new clsClientDetails("204.001", "MING YANG", "", "2017-10-18", "2019-03-18", "Enterprise", "6", objNoSMSPackDtl, "2", "//renewed on 17-03-2018 for 1 year till 18-03-2019//renewed on 17-02-2018 for 1 month till 18-03-2018//renewed on 17-01-2018 for 1 month till 18-02-2018//renewed on 18-12-2017 for 1 month till 18-01-2018,  Enterprise for 6  terminals on desktop and 2 APOS ,0 Webstocks,NO SMS Pack", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("205.001", new clsClientDetails("205.001", "THE SPOONFUEL BISTRO LLP", "", "2017-10-20", "2018-10-20", "Enterprise", "1", objNoSMSPackDtl, "2", "//added 2 APOS on 31-01-2018//renewed on 07-11-2017 for 1 year till 20-10-2018,  Enterprise for 1  terminal on desktop, 2 APOS", "", "", "", "No Bill Deletion"));
	    //Raju Ki Chai("Gaurika Enterprises Pvt. Ltd.")
	    inputMapClientDtl.put("206.001", new clsClientDetails("206.001", "Gaurika Enterprises Pvt. Ltd.", "", "2017-11-03", "2018-11-03", "Enterprise", "1", objNoSMSPackDtl, "0", "//Raju Ki Chai(Gaurika Enterprises Pvt. Ltd.) //released on 03-11-2017 ,renewed on 05-12-2017 for 1 year till 03-11-2018,  Enterprise for 1 SPOS,0 APOS,No SMS Pack", "", "", "", "No Bill Deletion"));
	    //"THIKANA"
	    inputMapClientDtl.put("207.001", new clsClientDetails("207.001", "AURA DINING", "", "2017-11-10", "2018-01-07", "Enterprise", "100", objNoSMSPackDtl, "10", "//THIKANA(PUNE) released on 10-11-2017 for 1 month,renewed on 10-12-2017 till 31-12-2017  Enterprise for 4  terminal on desktop and 10 APOS//renewed on 30-12-2017 for 8 days till 07-01-2018", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("208.001", new clsClientDetails("208.001", "GOVINDA HOSPITALITY", "", "2017-11-11", "2018-11-11", "Enterprise", "4", objNoSMSPackDtl, "6", "//rename Govind HOSPITALITY to GOVINDA HOSPITALITY released on 11-11-2017 for 1 year till 11-11-2018,  Enterprise for 4  terminal on desktop and 6 APOS", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("209.001", new clsClientDetails("209.001", "MODAKAM PURE VEG", "", "2017-11-13", "2018-11-12", "Enterprise", "7", objNoSMSPackDtl, "2", "//renewed 1 SPOS terminal total 7 SPOS//release on 13-11-2017 renewed on 29-11-2017 for 1 year for 7 SPOS and 2 APOS ", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("210.001", new clsClientDetails("210.001", "MAYUR TEXT TRADING LLP", "", "2017-11-29", "2018-11-28", "Enterprise", "2", objNoSMSPackDtl, "0", " //release on 29-11-2017 for 1 year till 2018-11-28 for 2 SPOS,updated 1 more terminal on 23-12-2017 and 0 APOS ", "", "", "", "No Bill Deletion"));
	    //"211.001", "CHEFS CORNER" MMS license
	    inputMapClientDtl.put("212.001", new clsClientDetails("212.001", "Blue Sky", "", "2017-11-30", "2018-11-30", "Enterprise", "4", objNoSMSPackDtl, "1", "//release on 30-11-2017 for 1 month till 2017-12-30,renewed on 28-12-2017 for 1 year tlll 30-11-2018,for 4 SPOS and 1 APOS ,No SMS Pack", "", "", "", "No Bill Deletion"));
	    //Saloon(Salon) Vimannagar 
	    inputMapClientDtl.put("213.001", new clsClientDetails("213.001", "GMH UNISEX SALON", "", "2017-12-07", "2017-12-15", "Enterprise", "1", objNoSMSPackDtl, "0", " //Saloon(Salon) Vimannagar //release on 07-12-2017 for 15 days till 2017-12-15 for 1 SPOS and 0 APOS ,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("214.001", new clsClientDetails("214.001", "MOSHES FINE FOODS PVT LTD", "", "2017-12-08", "2018-12-07", "Enterprise", "2", objNoSMSPackDtl, "0", "//(MUMBAI)release on 08-12-2017 for 1 year till 2018-12-07 for 2 SPOS and 0 APOS ,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("215.001", new clsClientDetails("215.001", "VIVVED EDUTAINMENT PVT LTD", "", "2017-12-08", "2018-12-07", "Enterprise", "4", new clsSMSPackDtl("VIVVEDEDUTAINMENT", "2017@VIVVEDEDUTAINMENT@2017", "PLAYSC", "Transactional"), "0", " //(MUMBAI)release on 08-12-2017 for 1 year till 2018-12-07 for 4 SPOS and 0 APOS ,5K SMS Pack activated on 19-12-2017.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("216.001", new clsClientDetails("216.001", "WOK MASTERS", "", "2017-12-12", "2018-12-11", "Enterprise", "1", objNoSMSPackDtl, "3", "//(PUNE)release on 12-12-2017 for 1 year till 2018-12-11 for 1 SPOS and 3 APOS ,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("217.001", new clsClientDetails("217.001", "BURNT CRUST HOSPITALITY PVT LTD", "", "2017-12-14", "2018-01-13", "Enterprise", "6", objNoSMSPackDtl, "16", "//(MUMBAI)release on 14-12-2017 for 1 month till 2018-01-13 for 6 SPOS and 13 APOS,updated to 16 APOS,1 WebSttocks ,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("218.001", new clsClientDetails("218.001", "THE LIQUID WISDOM CO.PVT LTD", "", "2017-12-14", "2018-12-13", "Enterprise", "3", objNoSMSPackDtl, "6", "//(MUMBAI)//renewed on 04-01-2018 for 1 year till 13-12-2018//release on 14-12-2017 for 1 month till 2018-01-13 for 3 SPOS and 6 APOS,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("219.001", new clsClientDetails("219.001", "C J HOSPITALITIES LLP", "", "2017-12-14", "2018-01-13", "Enterprise", "2", objNoSMSPackDtl, "1", "//(MUMBAI)release on 14-12-2017 for 1 month till 2018-01-13 for 2 SPOS and 1 APOS,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("220.001", new clsClientDetails("220.001", "70 DEGREE EAST", "", "2017-12-18", "2018-05-17", "Enterprise", "3", objNoSMSPackDtl, "10", "//(MUMBAI)//renewed on 17-04-2018 for 1 month till 17-05-2018//release on 18-12-2017 for 1 month till 17-01-2018 for 3 SPOS and 10 APOS,No WebStocks,No SMS Pack.", "MR.Manish", "8169117471", "manishpal.19@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("221.001", new clsClientDetails("221.001", "NIKHIL CORPORATION", "", "2018-01-04", "2019-01-04", "Enterprise", "3", objNoSMSPackDtl, "1", "(MUMBAI)//renewed on 29-01-2018 for 1 year till 04-01-2019//release on 04-01-2018 for 1 month till 31-01-2018 for 3 SPOS and 1 APOS,No WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    //"222.001", "PURANCHAND & SONS" MMS License
	    inputMapClientDtl.put("223.001", new clsClientDetails("223.001", "BANYAN TREE HOSPITALITY LLP", "BANYAN TREE", "2018-01-17", "2019-01-17", "Enterprise", "2", objNoSMSPackDtl, "3", "(MUMBAI)//renewed on 25-04-2018 for 1 year till 17-01-2019//renewed on 18-04-2018 for 1 month till 16-05-2018//renewed on 13-03-2018 for 1 month till 16-04-2018//renewed on 16-02-2018 for 1 month till 16-03-2018//release on 17-01-2018 for 1 month till 16-02-2018 for 2 SPOS and 3 APOS,1 WebStocks,No SMS Pack.", "MR.KAUSHIK", "7738621032", "kaushikchheda@banyantreehospitality.com", "No Bill Deletion"));
	    inputMapClientDtl.put("224.001", new clsClientDetails("224.001", "XO ZERO LOUNGE", "", "2018-01-18", "2019-01-18", "Enterprise", "3", objNoSMSPackDtl, "10", "(PUNE)//renewed on 16-02-2018 for 1 month till 18-03-2018//release on 18-01-2018 for 1 month till 18-02-2018 //renewed on 27-2-2018 for 1 year till 18-1-2019 for 3 SPOS and 10 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("225.001", new clsClientDetails("225.001", "SHEESHA SKY LOUNGE HOSPITALITY AND SERVICES PVT LTD", "", "2018-01-22", "2018-02-21", "Enterprise", "6", objNoSMSPackDtl, "8", "//(MUMBAI)release on 22-01-2018 for 1 month till 21-02-2018 for 6 SPOS and 8 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("226.001", new clsClientDetails("226.001", "AHLING CHINESE CORNER RESTAURANT", "", "2018-01-29", "2019-01-28", "Enterprise", "1", objNoSMSPackDtl, "0", "(PUNE)//renewed on 10-02-2018 for 1 year till 28-01-2019//renamed AHLING CHINESE RESTAURANT to AHLING CHINESE CORNER RESTAURANT//release on 29-01-2018 for 1 month till 28-02-2018 for 1 SPOS,0 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("227.001", new clsClientDetails("227.001", "HOR KIDDA FOODS", "", "2018-02-13", "2019-02-12", "Enterprise", "2", objNoSMSPackDtl, "1", "(MUMBAI)//renewed on 21-03-2018 for 1 year till 12-02-2019//release on 13-02-2018 for 1 month//renew for 1 month on 09-03-2018 till 12-04-2018 for 2 SPOS,1 APOS,NO WebStocks,No SMS Pack.", "MISS.Drishya Goyel", "9820133356", "deegee09@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("228.001", new clsClientDetails("228.001", "Moti Mahal-MYK Foods and Beverage", "", "2018-02-21", "2018-05-21", "Enterprise", "10", objNoSMSPackDtl, "1", "(PUNE)//Outlet 1 Amanora//release on 21-02-2018 for 3 months till 21-05-2018 for 1 HO SPOS,0 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("228.002", new clsClientDetails("228.002", "Moti Mahal-MYK Foods and Beverage", "", "2018-02-21", "2018-05-21", "Enterprise", "1", objNoSMSPackDtl, "1", "(PUNE)//Outlet 2 Phoenix//release on 21-02-2018 for 3 months till 21-05-2018 for 1 SPOS,0 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("228.003", new clsClientDetails("228.003", "Moti Mahal-MYK Foods and Beverage", "", "2018-02-21", "2018-05-21", "Enterprise", "1", objNoSMSPackDtl, "1", "(PUNE)//HO Call Center//release on 21-02-2018 for 3 months till 21-05-2018 for 1 SPOS,0 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("229.001", new clsClientDetails("229.001", "ALTA A CREATIVE HIGH", "", "2018-02-23", "2019-02-22", "Enterprise", "6", objNoSMSPackDtl, "2", "(MUMBAI)//renewed on 21-03-2018 for 1 year till 22-02-2019//release on 23-02-2018 for 1 months till 23-03-2018 for 6 SPOS ,2 APOS,NO WebStocks,No SMS Pack.", "Mr.Shritejj", "9769048111", "Shritejj2@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("230.001", new clsClientDetails("230.001", "AL MAKAN CAFE", "", "2018-02-23", "2019-02-23", "Enterprise", "6", objNoSMSPackDtl, "0", "(UMAN)//Location 1//release on 23-02-2018 for 1 year till 23-02-2019 for 6 SPOS ,0 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("230.002", new clsClientDetails("230.002", "AL MAKAN CAFE", "", "2018-02-23", "2019-02-23", "Enterprise", "6", objNoSMSPackDtl, "0", "(UMAN)//Location 2//release on 23-02-2018 for 1 year till 23-02-2019 for 6 SPOS ,0 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("230.003", new clsClientDetails("230.003", "AL MAKAN CAFE", "", "2018-02-23", "2019-02-23", "Enterprise", "6", objNoSMSPackDtl, "0", "(UMAN)//Location 3//release on 23-02-2018 for 1 year till 23-02-2019 for 6 SPOS ,0 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("231.001", new clsClientDetails("231.001", "LE MAKAN CAFE", "", "2018-02-23", "2019-02-23", "Enterprise", "6", objNoSMSPackDtl, "0", "(UMAN)//Location 1//release on 23-02-2018 for 1 year till 23-02-2019 for 6 SPOS ,0 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("232.001", new clsClientDetails("232.001", "PLAYBOY CLUB MUMBAI", "", "2018-02-26", "2018-03-25", "Enterprise", "8", objNoSMSPackDtl, "2", "(MUMBAI)//release on 26-02-2018 for 1 months till 26-03-2018 for 8 SPOS ,2 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("233.001", new clsClientDetails("233.001", "PLAYBOY INDIA", "PLAYBOY", "2018-04-27", "2018-06-27", "Enterprise", "9", objNoSMSPackDtl, "5", "(MUMBAI)//Renew for 2 month on 10-05-2017 till 27-06-2018 and live on 27-04-2018//renewed on 27-04-2018 for 1 month till 27-05-2018//release on 13-03-2018 for 1 months till 12-04-2018  for 9 SPOS ,5 APOS,1 WebStocks,No SMS Pack.", "Mr.Santosh", "9987326701", "Santosh_ply23@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("234.001", new clsClientDetails("234.001", "POSANA KITCHEN PVT LTD", "", "2018-03-13", "2019-03-12", "Enterprise", "2", objNoSMSPackDtl, "1", "(MUMBAI)//release on 13-03-2018 for 1 year till 12-03-2019 for 2 SPOS ,1 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("235.001", new clsClientDetails("235.001", "CAFE HYDRO", "", "2018-03-16", "2019-03-15", "Enterprise", "3", objNoSMSPackDtl, "0", "(MUMBAI)//release on 16-03-2018 for 1 year till 15-03-2019 for 3 SPOS ,0 APOS,NO WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("236.001", new clsClientDetails("236.001", "JAMUN HOSPITALITY CONSULTANCY LLP", "", "2018-03-16", "2019-03-15", "Enterprise", "5", objNoSMSPackDtl, "2", "(MUMBAI)//release on 16-03-2018 for 1 year till 15-03-2019 for 5 SPOS ,2 APOS,1 WebStocks,No SMS Pack.", "", "", "", "No Bill Deletion"));
	    inputMapClientDtl.put("237.001", new clsClientDetails("237.001", "ADM HOSPITALITY PVT LTD", "", "2018-03-21", "2019-03-20", "Enterprise", "2", objNoSMSPackDtl, "6", "(MUMBAI)//release on 21-03-2018 for 1 year till 20-03-2019 for 2 SPOS ,6 APOS,NO WebStocks,No SMS Pack.", "Mr.Abhishek Soparkar", "9987225500", "Abhisheksoparkar_073@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("238.001", new clsClientDetails("238.001", "HAUTE ARTISAN CREATIONS", "HO", "2018-03-21", "2018-05-20", "Enterprise", "2", objNoSMSPackDtl, "0", "(MUMBAI)//renewed on 19-04-2018 for 1 month till 20-05-2018//rename on 19-04-2018 SOLLERTIA PRODUCTIONS to HAUTE ARTISAN CREATIONS//release on 21-03-2018 for 1 month till 20-04-2018 for 2 SPOS ,0 APOS,NO WebStocks,No SMS Pack.", "Mr.Bhargav", "9619928491", "bhargav.iyer@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("238.002", new clsClientDetails("238.002", "HAUTE ARTISAN CREATIONS", "Chembur Outlet 1", "2018-03-21", "2018-05-20", "Enterprise", "2", objNoSMSPackDtl, "0", "(MUMBAI)//renewed on 19-04-2018 for 1 month till 20-05-2018//rename on 19-04-2018 SOLLERTIA PRODUCTIONS to HAUTE ARTISAN CREATIONS//release on 21-03-2018 for 1 month till 20-04-2018 for 2 SPOS ,0 APOS,NO WebStocks,No SMS Pack.", "Mr.Bhargav", "9619928491", "bhargav.iyer@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("238.003", new clsClientDetails("238.003", "HAUTE ARTISAN CREATIONS", "Mulund Outlet 2", "2018-03-21", "2018-05-20", "Enterprise", "2", objNoSMSPackDtl, "0", "(MUMBAI)//renewed on 19-04-2018 for 1 month till 20-05-2018//rename on 19-04-2018 SOLLERTIA PRODUCTIONS to HAUTE ARTISAN CREATIONS//release on 21-03-2018 for 1 month till 20-04-2018 for 2 SPOS ,0 APOS,NO WebStocks,No SMS Pack.", "Mr.Bhargav", "9619928491", "bhargav.iyer@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("238.004", new clsClientDetails("238.004", "HAUTE ARTISAN CREATIONS", "Goa Outlet 3", "2018-03-21", "2018-06-20", "Enterprise", "2", objNoSMSPackDtl, "0", "(MUMBAI)//renewed on 19-04-2018 for 1 month till 20-06-2018//rename on 19-04-2018 SOLLERTIA PRODUCTIONS to HAUTE ARTISAN CREATIONS//release on 21-03-2018 for 2 month till 20-05-2018 for 2 SPOS ,0 APOS,NO WebStocks,No SMS Pack.", "Mr.Bhargav", "9619928491", "bhargav.iyer@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("239.001", new clsClientDetails("239.001", "KARMA HOSPITALITY", "URBO", "2018-03-22", "2018-05-22", "Enterprise", "4", objNoSMSPackDtl, "8", "(PUNE Urbo)//renewed on 21-04-2018 for 1 month till 22-05-2018//release on 22-03-2018 for 1 month till 22-04-2018 for 4 SPOS ,8 APOS,NO WebStocks,No SMS Pack.", "Mr. Nitesh Kyada", "9764656565", "niteshkyada@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("240.001", new clsClientDetails("240.001", "THOUSAND OAKS", "1000 OAKS", "2018-03-27", "2018-06-11", "Enterprise", "5", objNoSMSPackDtl, "10", "(PUNE)//renewed for 1 month on 12-05-2018//renewed on 25-04-2018 for 15 days till 11-05-2018//release on 27-03-2018 for 1 month till 26-04-2018 for 5 SPOS ,10 APOS,NO WebStocks,No SMS Pack.", "Mr. Shripad Tole", "8308318356", "info@1000oaksindia.com", "Bill Deletion"));
	    inputMapClientDtl.put("241.001", new clsClientDetails("241.001", "LALITHA HOSPITALITY PVT LTD", "", "2018-04-06", "2018-06-08", "Enterprise", "4", objNoSMSPackDtl, "6", "(MUMBAI)//release on 06-04-2018 for 1 month till 06-05-2018//renew on 08-05-2018 for 1 month till 08-06-2018 for 4 SPOS ,6 APOS,1 WebStocks,No SMS Pack.", "Mr.Santosh Shetty", "+919769214553", "Santoshshetty_0173@gmail.com", "No Bill Deletion"));
	    //242.001, "SRINATHJIS CUISINES PVT LTD" MMS License
	    inputMapClientDtl.put("243.001", new clsClientDetails("243.001", "SURANIMO RETAIL PRIVATE LIMITED", "", "2018-04-11", "2018-06-11", "Enterprise", "6", objNoSMSPackDtl, "2", "(MUMBAI)//renewd on 11-5-18 for 1 month//release on 11-04-2018 for 1 month till 11-05-2018 for 6 SPOS ,2 APOS,NO WebStocks,No SMS Pack.", "Mr.Arya", "9617894217", "Aryapatil231@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("244.001", new clsClientDetails("244.001", "VIVIDH HOSPITALITY", "VIVIDH NX", "2018-04-17", "2019-04-17", "Enterprise", "5", objNoSMSPackDtl, "2", "(MUMBAI)//renewed on 26-04-2018 for 1 year till 17-04-2019//release on 17-04-2018 for 1 month till 16-05-2018 for 5 SPOS ,2 APOS,1 WebStocks,No SMS Pack.", "Mr.Sanjay", "8082084322", "Sanjay_2304@hotmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("245.001", new clsClientDetails("245.001", "LSD NO LIMITS LLP (C/O)", "RAJURESHWAR HOSPITALITY PVT LTD", "2018-04-19", "2018-05-19", "Enterprise", "5", objNoSMSPackDtl, "7", "(MUMBAI)//renamed LSD NO LIMITS LLP & (C/O) to LSD NO LIMITS LLP (C/O)//release on 19-04-2018 for 1 month till 19-05-2018 for 5 SPOS ,7 APOS,1 WebStocks,No SMS Pack.", "Mr.Raj", "9912260717", "rajluv.lsd@gmail.com", "No Bill Deletion"));
	    inputMapClientDtl.put("246.001", new clsClientDetails("246.001", "FUNKY MONKEYS PLAY CENTERS PVT LTD", "Funky Monkeys", "2018-05-03", "2018-06-03", "Enterprise", "4", objNoSMSPackDtl, "2", "(AHMEDABAD)//Rename on 11-05-2018 //release on 03-05-2018 for 1 month till 03-06-2018 for 4 SPOS ,2 APOS,NO WebStocks,No SMS Pack,No Bill Deletion.", "Mr.Naresh", "09821795551", "admin@funkymonkeys.in", "No Bill Deletion"));
	    inputMapClientDtl.put("247.001", new clsClientDetails("247.001", "EMPYREAL LINEAGE PRIVATE LIMITED", "BHAGAT TARACHAND", "2018-05-10", "2018-06-10", "Enterprise", "5", objNoSMSPackDtl, "2", "(MUMBAI)//release on 10-05-2018 for 1 month till 10-06-2018 for 5 SPOS ,2 APOS,NO WebStocks,No SMS Pack,No Bill Deletion.", "Mr.Mayank", "9819848398", "mayankshetty.bh@gmail.com", "No Bill Deletion"));
	}
	catch (Exception e)
	{
	    e.printStackTrace();
	}
    }

    //id, clientName, installDate, expiryDate, posVersion, intMAXTerminal, smsPackDtl, intMAXAPOSTerminals, comments
    private List<String> funGetEncryptedLicenseList(String clientCode, String clientName, String installDate, String expiryDate, String posVersion, String intMAXTerminal, String intMAXAPOSTerminals, String comments, clsSMSPackDtl objSMSPackDtl, String contsctPerson, String contsctNo, String contactEmailId, String billDeletion, String outletName)
    {
	List<String> arrList = new ArrayList<String>();
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(clientCode));//0
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(clientName));//1
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(installDate));//2
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(expiryDate));//3
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(posVersion));//4
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(intMAXTerminal));//5
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(intMAXAPOSTerminals));//6        
	//addind SMS dtl
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(objSMSPackDtl.getStrUserId()));//7
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(objSMSPackDtl.getStrPassword()));//8
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(objSMSPackDtl.getStrSenderId()));//9
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(objSMSPackDtl.getStrSMSPack()));//10      
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(comments));//11

	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(contsctPerson));//12
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(contsctNo));//13
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(contactEmailId));//14
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(billDeletion));//15
	arrList.add(clsEncryptDecryptClientCode.funEncryptClientCode(outletName));//16

	return arrList;
    }

    private List<String> funGetDecryptedLicenseList(String clientCode, String clientName, String installDate, String expiryDate, String posVersion, String intMAXTerminal, String intMAXAPOSTerminals, String comments, String userId, String password, String senderId, String smsPack, String contactPerson, String contactNo, String contactEmailId, String billDeletion, String outletName)
    {
	List<String> arrList = new ArrayList<String>();
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(clientCode));//0
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(clientName));//1
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(installDate));//2
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(expiryDate));//3
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(posVersion));//4
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(intMAXTerminal));//5
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(intMAXAPOSTerminals));//6
	//getting SMS dtl
	if (userId.trim().length() > 0)
	{
	    arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(userId));//7
	    arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(password));//8
	    arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(senderId));//9
	    arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(smsPack));//10    
	}
	else
	{
	    arrList.add(userId);//7
	    arrList.add(password);//8
	    arrList.add(senderId);//9
	    arrList.add(smsPack);//10    
	}
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(comments));//11
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(contactPerson));//12
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(contactNo));//13
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(contactEmailId));//14
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(billDeletion));//15
	arrList.add(clsEncryptDecryptClientCode.funDecryptClientCode(outletName));//16

	return arrList;
    }

    public static void main(String[] args)
    {
	try
	{

	    clsGenerateLicense objGenerateLicense = new clsGenerateLicense();
	    objGenerateLicense.funAddClientCodeAndName();

	    for (Map.Entry<String, clsClientDetails> entryOfLicense : inputMapClientDtl.entrySet())
	    {
		String clientCode = entryOfLicense.getKey();
		clsClientDetails objValue = entryOfLicense.getValue();

		System.out.println(clientCode + "!" + objValue.getStrClientName() + "!" + objValue.getStrOutletName() + "!" + objValue.getDteInstallationDate() + "!" + objValue.getDteExpiryDate() + "!" + objValue.getStrPOSVersion() + "!" + objValue.getIntMAXSPOSTerminal() + "!" + objValue.getIntMAXAPOSTerminals() + "!" + objValue.getObjSMSPackDtl().getStrSMSPack() + "!" + objValue.getStrComments() + "!" + objValue.getStrContactPerson() + "!" + objValue.getStrContactNo() + "!" + objValue.getStrEmailId() + "!" + objValue.getStrBillRegeneration());
	    }

	    File fileClientDtl = new File("ClientDetails.txt");
	    FileWriter fileWriter = new FileWriter(fileClientDtl);

	    for (Map.Entry<String, clsClientDetails> entryOfLicense : inputMapClientDtl.entrySet())
	    {
		String clientCode = entryOfLicense.getKey();
		clsClientDetails objClientDtl = entryOfLicense.getValue();

		String strClientName = objClientDtl.getStrClientName();

		String dteInstallationDate = objClientDtl.getDteInstallationDate();
		String dteExpiryDate = objClientDtl.getDteExpiryDate();
		String strPOSVersion = objClientDtl.getStrPOSVersion();
		String intMAXSPOSTerminal = objClientDtl.getIntMAXSPOSTerminal();
		String intMAXAPOSTerminals = objClientDtl.getIntMAXAPOSTerminals();
		clsSMSPackDtl objSMSPackDtl = objClientDtl.getObjSMSPackDtl();
		String strComments = objClientDtl.getStrComments();

		String strContactPerson = objClientDtl.getStrContactPerson();
		String strContactNo = objClientDtl.getStrContactNo();
		String strEmailId = objClientDtl.getStrEmailId();
		String strBillDeletion = objClientDtl.getStrBillRegeneration();

		String outletName = objClientDtl.getStrOutletName();

		if (strContactPerson.trim().isEmpty() || strContactNo.trim().isEmpty() || strEmailId.trim().isEmpty())
		{
		    System.out.println("\"" + clientCode + "\",\"" + strClientName + " \" Please provide client details(Contact person,contact no.,email id) to generate the license");

		    fileWriter.append(" " + clientCode + " Please provide client details(Contact person,contact no.,email id) to generate the license");
		    fileWriter.append("\n");
		}
		else
		{
		    List<String> arrEncryptedClientList = new clsGenerateLicense().funGetEncryptedLicenseList(clientCode, strClientName, dteInstallationDate, dteExpiryDate, strPOSVersion, intMAXSPOSTerminal, intMAXAPOSTerminals, strComments, objSMSPackDtl, strContactPerson, strContactNo, strEmailId, strBillDeletion, outletName);
		    System.out.println(arrEncryptedClientList);

		    List<String> arrDecryptedClientList = new clsGenerateLicense().funGetDecryptedLicenseList(arrEncryptedClientList.get(0), arrEncryptedClientList.get(1), arrEncryptedClientList.get(2), arrEncryptedClientList.get(3), arrEncryptedClientList.get(4), arrEncryptedClientList.get(5), arrEncryptedClientList.get(6), arrEncryptedClientList.get(7), arrEncryptedClientList.get(8), arrEncryptedClientList.get(9), arrEncryptedClientList.get(10), arrEncryptedClientList.get(11), arrEncryptedClientList.get(12), arrEncryptedClientList.get(13), arrEncryptedClientList.get(14), arrEncryptedClientList.get(15), arrEncryptedClientList.get(16));
		    System.out.println(arrDecryptedClientList);

		    System.out.println();

		    fileWriter.append("/*" + clientCode + "*/" + "hmClientDtl.put(\"" + arrEncryptedClientList.get(0) + "\", createClientDetails(\"" + arrEncryptedClientList.get(0) + "\", \"" + arrEncryptedClientList.get(1) + "\",\"" + arrEncryptedClientList.get(16) + "\" "
			    + ",\"" + arrEncryptedClientList.get(2) + "\", \"" + arrEncryptedClientList.get(3) + "\", \"" + arrEncryptedClientList.get(4) + "\", \"" + arrEncryptedClientList.get(5) + "\", \"" + arrEncryptedClientList.get(6) + "\", "
			    + "new clsSMSPackDtl(\"" + arrEncryptedClientList.get(7) + "\", \"" + arrEncryptedClientList.get(8) + "\", \"" + arrEncryptedClientList.get(9) + "\", \"" + arrEncryptedClientList.get(10) + "\"), "
			    + "\"" + arrEncryptedClientList.get(11) + "\", \"" + arrEncryptedClientList.get(12) + "\", \"" + arrEncryptedClientList.get(13) + "\", \"" + arrEncryptedClientList.get(14) + "\", \"" + arrEncryptedClientList.get(15) + "\"));");

		    fileWriter.append("\n");
		}
	    }
	    fileWriter.close();

	}
	catch (Exception e)
	{
	    e.printStackTrace();
	}
    }

}
