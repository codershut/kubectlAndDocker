//package com.rapipay.testfordemo.controler;
//
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.json.XML;
//import org.springframework.stereotype.Component;
//
//import com.rapipay.testfordemo.bcEnum.BcEnum;
//
//@Component
//public class BcLogic {
//
//	
//	public static void main(String[] args) {
//		double amount = 50000.00;
//		//data from db
//		JSONObject json = new JSONObject("{\"array\":[{\"cateogryID\":\"CAT1804161735A00006\",\"levelID\":1,\"flatID\":240},{\"cateogryID\":\"CAT1804161735A00005\",\"levelID\":2,\"flatID\":45},{\"cateogryID\":\"CAT1804161735A00004\",\"levelID\":3,\"flatID\":14},{\"cateogryID\":\"CAT1804161735A00002\",\"levelID\":4,\"flatID\":1}]}");
//		// stored in init
//		Map<Object, Object> bank = new LinkedHashMap<>();
//		bank.put("CMS01_10", "{\n"
//				+ "    \"clientId\": \"10\",\n"
//				+ "    \"NA\": 1,\n"
//				+ "    \"clientName\": \"Home Credit\",\n"
//				+ "    \"clientKey\": \"CMS01_10\",\n"
//				+ "    \"CAT1804161735A00002\": \"[{\\\"minAmount\\\":1,\\\"solId\\\":497,\\\"fixedCharges\\\":0,\\\"commORFee\\\":1,\\\"calcType\\\":4,\\\"slabId\\\":1,\\\"taxInclude\\\":\\\"Y\\\",\\\"planId\\\":1000001,\\\"maxAmount\\\":1000000,\\\"serviceId\\\":94,\\\"perchentage\\\":0.347119}]\",\n"
//				+ "    \"CAT1804161735A00004\": \"[{\\\"minAmount\\\":1,\\\"solId\\\":497,\\\"fixedCharges\\\":0,\\\"commORFee\\\":1,\\\"calcType\\\":4,\\\"slabId\\\":1,\\\"taxInclude\\\":\\\"Y\\\",\\\"planId\\\":1000001,\\\"maxAmount\\\":1000000,\\\"serviceId\\\":94,\\\"perchentage\\\":0.347119}]\",\n"
//				+ "    \"planName\": \"CMS01_CLIENT_PLAN20210424\",\n"
//				+ "    \"planID\": \"1000001\",\n"
//				+ "    \"CAT1804161735A00006\": \"[{\\\"minAmount\\\":1,\\\"solId\\\":497,\\\"fixedCharges\\\":0,\\\"commORFee\\\":1,\\\"calcType\\\":4,\\\"slabId\\\":1,\\\"taxInclude\\\":\\\"Y\\\",\\\"planId\\\":1000001,\\\"maxAmount\\\":1000000,\\\"serviceId\\\":94,\\\"perchentage\\\":0.242983}]\",\n"
//				+ "    \"CAT1804161735A00005\": \"[{\\\"minAmount\\\":1,\\\"solId\\\":497,\\\"fixedCharges\\\":0,\\\"commORFee\\\":1,\\\"calcType\\\":4,\\\"slabId\\\":1,\\\"taxInclude\\\":\\\"Y\\\",\\\"planId\\\":1000001,\\\"maxAmount\\\":1000000,\\\"serviceId\\\":94,\\\"perchentage\\\":0.312407}]\"\n"
//				+ "}");
//		JSONObject transactionDoneBy = new JSONObject();
//		transactionDoneBy.putOpt("4", "Crnf");
//		transactionDoneBy.putOpt("3", "Md");
//		transactionDoneBy.putOpt("2", "Distributor");      // CHANGES
//		transactionDoneBy.putOpt("1", "Agent");
//		
//
//		JSONObject calcJson = new JSONObject();
// 		
// 		calcJson.putOpt(BcEnum.TXNCHANNELFLATID.tag,"3");
// 		calcJson.putOpt(BcEnum.TXNCHANNELCAT.tag, "CAT1804161735A00004");
// 		calcJson.putOpt(BcEnum.TOPARRNETARRAY.tag, json.optJSONArray("array"));//convert to json
// 		calcJson.putOpt(BcEnum.CURRENTTDS.tag, "5.0");
// 		calcJson.putOpt(BcEnum.CURRENTGST.tag, "0.0");
// 		calcJson.putOpt(BcEnum.SERVICETYPE.tag,"CMS_SERVICE_01");
// 		calcJson.putOpt(BcEnum.CLIENTKEY.tag,"CMS01_10" );
// 		
// 		BcLogic bcLogicObject = new BcLogic();
//// 		System.out.println(json.optJSONArray("array").toString());
//// 		System.out.println(XML.toString(json.optJSONArray("array"),"abc"));
// 		//********************MAIN LOGIC********************************
// 		JSONObject storedData = new JSONObject();
// 		storedData.putOpt("Agent", new JSONObject());
// 		storedData.putOpt("Distributor", new JSONObject());
// 		storedData.putOpt("Md", new JSONObject());
// 		storedData.putOpt("Crnf", new JSONObject());
// 		bcLogicObject.putData(storedData.optJSONObject("Agent"),"Agent");
// 		bcLogicObject.putData(storedData.optJSONObject("Distributor"),"Distributor");
// 		bcLogicObject.putData(storedData.optJSONObject("Md"),"Md");
// 		bcLogicObject.putData(storedData.optJSONObject("Crnf"),"Crnf");
// 		System.err.println(storedData);
// 		JSONObject bankDatajson = new JSONObject(bank.get(calcJson.optString(BcEnum.CLIENTKEY.tag)).toString());
// 		System.err.println(bankDatajson);
// 		
// 		JSONArray jsonA = calcJson.optJSONArray(BcEnum.TOPARRNETARRAY.tag);
// 		
// 		int length = jsonA.length();
// 		
// 		int i;
// 		int flag = 0;
//		double prevPercentage = 0.00000;
//		JSONArray resArr = new JSONArray();
//		StringBuilder resXMl = new StringBuilder(); // CHANGES DONE
// 		for(i = calcJson.optInt(BcEnum.TXNCHANNELFLATID.tag) -1 ;i < length ;i++ )                // CHANGES DONE
// 		{
// 			JSONObject data;
// 			data = (JSONObject) jsonA.get(i);
// 			String cateogryID = data.optString(BcEnum.CATEGORYID.tag);
// 			JSONArray computeData = new JSONArray(bankDatajson.optString(cateogryID));
//
// 			if(i==0 && data.optInt(BcEnum.LEVELID.tag)==1)
// 			{
// 				prevPercentage = bcLogicObject.calculation(computeData, storedData, amount, transactionDoneBy, resArr, calcJson, data, prevPercentage);
// 				data.putOpt(BcEnum.LEVELID.tag, "2");
// 				data = (JSONObject) jsonA.get(1);
// 				cateogryID = data.optString(BcEnum.CATEGORYID.tag);
// 				computeData = new JSONArray(bankDatajson.optString(cateogryID));
// 				prevPercentage = bcLogicObject.calculation(computeData, storedData, amount, transactionDoneBy, resArr, calcJson, data, prevPercentage);
// 				data.putOpt(BcEnum.LEVELID.tag, "3");
// 				data = (JSONObject) jsonA.get(2);
// 				cateogryID = data.optString(BcEnum.CATEGORYID.tag);
// 				computeData = new JSONArray(bankDatajson.optString(cateogryID));
// 				prevPercentage = bcLogicObject.calculation(computeData, storedData, amount, transactionDoneBy, resArr, calcJson, data, prevPercentage);
// 				data.putOpt(BcEnum.LEVELID.tag, "4");
// 				data = (JSONObject) jsonA.get(3);
// 				cateogryID = data.optString(BcEnum.CATEGORYID.tag);
// 				computeData = new JSONArray(bankDatajson.optString(cateogryID));
// 				bcLogicObject.calculation(computeData, storedData, amount, transactionDoneBy, resArr, calcJson, data, prevPercentage);
// 			    break;
// 			}
// 			if(flag==0 && data.optInt(BcEnum.LEVELID.tag)>1)
// 			{
// 				bcLogicObject.setDefaultData(data.optInt(BcEnum.LEVELID.tag), resXMl, storedData, transactionDoneBy,resArr);
// 				flag++;
// 			}
// 			prevPercentage = bcLogicObject.calculation(computeData, storedData, amount, transactionDoneBy, resArr, calcJson, data, prevPercentage);
// 			System.out.println("->"+prevPercentage);
// 		}
// 		
// 
// 		System.err.println(storedData);
// 		System.out.println(resXMl);
// 		
// 		System.err.println(XML.toString(resArr,"COMM-DATA"));
//   
//	}
//	public void putData(JSONObject j , String str) {
//		j.putOpt(str + BcEnum.RES_ID.tag, 0);
//		j.putOpt(str + BcEnum.RES_PLAN_ID.tag, 0);
//		j.putOpt(str + BcEnum.RES_DEFINED_FIXED.tag,0);
//		j.putOpt(str + BcEnum.RES_DEFINED_PER.tag,0);
//		j.putOpt(str + BcEnum.RES_CALC_TYPE.tag,0);
//		j.putOpt(str + BcEnum.RES_VALUE.tag, 0);
//		j.putOpt(str + BcEnum.RES_IGST.tag, 0.00000);
//		j.putOpt(str + BcEnum.RES_CGST.tag, 0.00000);
//		j.putOpt(str + BcEnum.RES_SGST.tag, 0.00000);
//		j.putOpt(str + BcEnum.RES_TDS.tag, 0);
//		j.putOpt(str + BcEnum.RES_DRCR_AMT.tag,0 );
//
//		
//	}
//	public void setDefaultData(int x , StringBuilder resXMl ,JSONObject storedData,JSONObject transactionDoneBy,JSONArray resArr)
//	{
//		int i;
//		for(i=1 ; i<x ;i++)
//		{
//			resArr.put(storedData.optJSONObject(transactionDoneBy.optString(Integer.toString(i))));
//			resXMl.append(XML.toString(storedData.optJSONObject(transactionDoneBy.optString(Integer.toString(i)))));
//			
//		}
//	}
//	public double calculation(JSONArray computeData,JSONObject storedData,double amount,JSONObject transactionDoneBy,JSONArray resArr,JSONObject calcJson,JSONObject data,double prevPercentage)
//	{
//		double tds;
//		double commCalc;
//		double amountCalc;
//		double valueAmount;
//		String catType;
//		int len = computeData.length();
//		String levelId = data.optString(BcEnum.LEVELID.tag);
//		int j;
//		
//		for(j = 0 ;j < len ;j++ )
//			{
//				JSONObject slabData;
//				slabData =(JSONObject) computeData.get(j);
//				if(amount>=slabData.optDouble(BcEnum.MINAMOUNT.tag) && amount<=slabData.optDouble(BcEnum.MAXAMOUNT.tag))
//				{
//                catType = transactionDoneBy.optString(levelId);
//					commCalc = slabData.optDouble(BcEnum.PERCENTAGE.tag) - prevPercentage;
//					amountCalc =  BigDecimal.valueOf((amount * commCalc)/100).setScale(5, RoundingMode.HALF_UP).doubleValue();
//					
//					// minimum amount from fixed amount and calculated amount 
//					
//					if(slabData.optDouble(BcEnum.FIXEDCHARGES.tag)>0)
//					{
//						amountCalc = Math.min(amountCalc,slabData.optDouble(BcEnum.FIXEDCHARGES.tag));
//					}
//					prevPercentage = slabData.optDouble(BcEnum.PERCENTAGE.tag);
//					System.err.println(amountCalc);
//					tds =  BigDecimal.valueOf((amountCalc*calcJson.optDouble(BcEnum.CURRENTTDS.tag))/100).setScale(5, RoundingMode.HALF_UP).doubleValue();
//					System.err.println(tds);
//					valueAmount = BigDecimal.valueOf(amountCalc - tds).setScale(5, RoundingMode.HALF_UP).doubleValue();
//					System.err.println(valueAmount);
//					storedData.optJSONObject(catType).putOpt(catType + BcEnum.RES_ID.tag, data.optString(BcEnum.FLATID.tag));
//					storedData.optJSONObject(catType).putOpt(catType + BcEnum.RES_PLAN_ID.tag, slabData.optString(BcEnum.PLANID.tag));
//					storedData.optJSONObject(catType).putOpt(catType + BcEnum.RES_DEFINED_FIXED.tag, slabData.optString(BcEnum.FIXEDCHARGES.tag));
//					storedData.optJSONObject(catType).putOpt(catType + BcEnum.RES_DEFINED_PER.tag, slabData.optString(BcEnum.PERCENTAGE.tag));
//					storedData.optJSONObject(catType).putOpt(catType + BcEnum.RES_CALC_TYPE.tag, slabData.optString(BcEnum.CALCTYPE.tag));
//					storedData.optJSONObject(catType).putOpt(catType + BcEnum.RES_VALUE.tag, amountCalc);
//					storedData.optJSONObject(catType).putOpt(catType + BcEnum.RES_TDS.tag, tds);
//					storedData.optJSONObject(catType).putOpt(catType + BcEnum.RES_DRCR_AMT.tag, valueAmount);
//
//					resArr.put(storedData.optJSONObject(catType));
//					break;
//				}
//			}
//		System.out.println("->"+prevPercentage);
//		return prevPercentage;
//	}
//}
//
//
//
//
//
//
//
//
//
////	for(j = 0 ;j < len ;j++ )
////	{
////		JSONObject slabData;
////		slabData =(JSONObject) computeData.get(j);
////		if(amount>=slabData.optDouble("minAmount") && amount<=slabData.optDouble("maxAmount"))
////		{
////        catType = transactionDoneBy.optString(levelId);
////			commCalc = slabData.optDouble("perchentage") - prevPercentage;
////			amountCalc =  BigDecimal.valueOf((amount * commCalc)/100).setScale(5, RoundingMode.HALF_UP).doubleValue();;
////			prevPercentage = slabData.optDouble("perchentage");
////			System.err.println(amountCalc);
////			tds =  BigDecimal.valueOf((amountCalc*calcJson.optDouble("currrentTDS"))/100).setScale(5, RoundingMode.HALF_UP).doubleValue();
////			System.err.println(tds);
////			valueAmount = BigDecimal.valueOf(amountCalc - tds).setScale(5, RoundingMode.HALF_UP).doubleValue();
////			System.err.println(valueAmount);
////			storedData.optJSONObject(catType).putOpt(catType + "_ID", data.optString("flatID"));
////			storedData.optJSONObject(catType).putOpt(catType + "_PLAN_ID", slabData.optString("planId"));
////			storedData.optJSONObject(catType).putOpt(catType + "_DEFINED_FIXED", slabData.optString("fixedCharges"));
////			storedData.optJSONObject(catType).putOpt(catType + "_DEFINED_PER", slabData.optString("perchentage"));
////			storedData.optJSONObject(catType).putOpt(catType + "_CALC_TYPE", slabData.optString("calcType"));
////			storedData.optJSONObject(catType).putOpt(catType + "_VALUE", amountCalc);
////			storedData.optJSONObject(catType).putOpt(catType + "_TDS", tds);
////			storedData.optJSONObject(catType).putOpt(catType + "_DRCR_AMT", valueAmount);
////
////			resArr.put(storedData.optJSONObject(catType));
////			resXMl.append(XML.toString(storedData.optJSONObject(catType)));
////			break;
////		}
////	}