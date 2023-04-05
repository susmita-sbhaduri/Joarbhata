/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bhaduri.joarbhata;

import java.util.ArrayList;
import java.util.List;
import org.bhaduri.nouka.DTO.ListScripData;
import org.bhaduri.nouka.DTO.ScripData;

/**
 *
 * @author susmita
 */
public class CreateJoarBhata {
    public void deviseJoarBhata(){
        DataPerScrip dataPerScrip = new DataPerScrip();
        ListScripData scripData = dataPerScrip.getScripIdList();
        List<ScripData> scripidlDatas;
        scripidlDatas = scripData.getScripdatalist();
        for (int i = 0; i < scripidlDatas.size(); i++) {
            ScripData scripId = new ScripData();
            scripId.setScripId(scripidlDatas.get(i).getScripId());
            ListScripData minDataPerScrip = dataPerScrip.getDataPerScripId(scripId);
            List<ScripData> minDataList;
            minDataList = minDataPerScrip.getScripdatalist();
            for (int ii = 0; ii < minDataList.size(); i++) {
                System.out.println("Script ID"+scripId.getScripId());
                System.out.println("Last update price"+minDataList.get(ii).getDayLastPrice());                
            }
            
        }
    }
    
}
