/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bhaduri.joarbhata;
import java.util.ArrayList;
import java.util.List;
import org.bhaduri.nouka.DTO.ScripData;
import org.bhaduri.jogajog.services.MasterDataService;
import org.bhaduri.nouka.DTO.ListScripData;

/**
 *
 * @author susmita
 */
public class DataPerScrip {
    public static final int NIFTYFIFTYCOUNT=51;
    
    public List<ScripData> getDataPerScripId(ScripData scripid){
                
    }
    
    public ListScripData getScripIdList() {
        ListScripData scripdatalist = new ListScripData();
        List<ScripData> scripidlist = new ArrayList<>();
        
        for (int i = 0; i < NIFTYFIFTYCOUNT; i++) {            
            ScripData scripData = new ScripData();
            scripidlist.add(i, scripData);
        }
        scripdatalist.setScripdatalist(scripidlist);
        MasterDataService masterDataService = new MasterDataService();
        scripdatalist = masterDataService.getScripID();        
        return scripdatalist;
        
    }
//    private ScripData loadScripId() {
//        ScripData scripData = new ScripData();
//        try {
//
//            String sym = scripObj.get("symbol").toString();
//            scripData.setScripId(sym);
//
//            Double openPrice = Double.valueOf(scripObj.get("open").toString());
//            scripData.setOpenPrice(openPrice);
//
//            Double dayHighPrice = Double.valueOf(scripObj.get("dayHigh").toString());
//            scripData.setDayHighPrice(dayHighPrice);
//
//            Double dayLowPrice = Double.valueOf(scripObj.get("dayLow").toString());
//            scripData.setDayLowPrice(dayLowPrice);
//
//            Double dayLastPrice = Double.valueOf(scripObj.get("lastPrice").toString());
//            scripData.setDayLastPrice(dayLastPrice);
//
//            Double prevClosePrice = Double.valueOf(scripObj.get("previousClose").toString());
//            scripData.setPrevClosePrice(prevClosePrice);
//
//            Double totalTradedVolume = Double.valueOf(scripObj.get("totalTradedVolume").toString());
//            scripData.setTotalTradedVolume(totalTradedVolume);
//
////            SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
////            Date lastUpdateTime = inputDateFormat.parse(scripObj.get("lastUpdateTime").toString());
////
////            SimpleDateFormat tempDateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
////            String tempOutput = tempDateFormatter.format(lastUpdateTime);
////            Date finalDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(tempOutput);
//            scripData.setLastUpdateTime(lastUpdateTime);
//
//        } catch (JSONException ex) {
//            System.out.println("JSONException has occurred in loadScripData");
//        } 
//        return scripData;
//
//    }

    
}
