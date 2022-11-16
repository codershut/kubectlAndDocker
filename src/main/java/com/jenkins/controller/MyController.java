package com.jenkins.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.ValidationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.dto.TestDto;
import com.jenkins.modal.Output;
import com.jenkins.model.Test;

@RestController
public class MyController {
//	@GetMapping("/api/{name}")
//	public String gethii(@PathVariable("name") String name) {
//		
//		return "Hello" + name + "!";
//	}
//	
//	@GetMapping("/api2/{name}")
//	public String getName(@PathVariable("name") String name) {
//		return "Hello" + name + "!";
//	}
//	
//	@GetMapping("/api2/{name}")
//	public String get444(@PathVariable("name") String name) {
//		return "Hello" + name + "!";
//	}
//	
	
	@GetMapping("/api11")
	public String  getApi11(){
	
		return main333();
		
	}
	
	@PostMapping("/api")
	public String myFun(@RequestBody @Valid Output output) throws MethodArgumentNotValidException {
		try {
//			 String sql = "INSERT into employeeTesting(first_name,last_name,email) VALUES (?,?,?)";
			
//			   return jdbcTemplate.update(sql, "dd","22", "22");
//			String s=null;
//			s.length();
//			
			return "Hello";
		} catch (NullPointerException e) {
			System.err.println(e);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	
	
//	public static void main5(String[] args) {
//		
////		System.err.println(new SimpleDateFormat("HH:mm:ss").format(new Date())); 
//		
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.putOpt("key", "010272E80");
//		String str=XML.toString(jsonObject);
//		System.err.println(str);
//		System.err.println(XML.toJSONObject(str,true));
//	}
//	
//	public static void main2(String[] args) {
//		
//		String obj="";
//		try {
//			
////			String str="{\\\"eReq\\\":\\\"ZjoUARJjcVqoVSrKJbppUNIT2xKR7du6fX6AoQwuZaNSruU99eiQToG/SudWvS9m3jbMV+2FUQUzDMb+8bbke4eaT3Oz5oen4HLvU90+wqNaRvRcwmg3UjqiYJ3XJ0pXknYFw1sHWsrij8tjE2g7GGrdc6RpIX5ma+aKwJKGHQwSTlgcDBRI4IJLgze0O9Zhz5vJhAs/e4dTswxHRlcSMPf6BK0Lgsqk4ZmkTGqWHd8M16tr0lxHs1SiLBTgdmxvImF1lsTgAbyuDVCCAjSVkafPjGZbmN8/nchq6qEJvqvI3i2p2SUnYP44JX3I+chXOIK4+p86weHLffZCday7gp25f25zD2XXu8Y7KQ9IVwvpifwrevlgCIFqTl7KkKiYznetyTKqMLvNFcfD82bgVxW9zcH/3qzIWg1QKO2e5VpZ7zOzFTycAsM7mwNWbX06VjCHjVM92CMu5Wt6qWjaAuLFM99AV/+rXuE0/DQgtEP7eXseBOT3od3/hlYJ/v/7IyDzg3JC53MsmumltvzWcMk9H9xSaK7s3bVnjfJ+yKb6c4jEDE2G6K8LDgVWRWahaBRVybwwon/NU6nM5+DSBuk99drVsQF4aHHQ3Mm/vp3FXMD92zzOW0xRehPRhGhyXNEPmvuVV7Un5ldO0ehUrPVBRyJSwZhpHlUT9Hg+6WAbGAZxAcVSCizg+AmL6cdD7/ZIFAhZGokuGL6hYOUvA7I0+Zja7TNhm6JAizocCPsep1cbU1BFE0v0CuX3rPGUMO7faWP/tF6Xr4HhNBH4JVigr4Za8Fa2mHdCESLSqC4277iTGtcFg1kDITPK2myDzUCPP/ndqSCoOGYpJtA7AOesKbGpn116JK1CXj8E1ruQ9s4H1EtT+ShCCF+W+WqRCc/5++W4JYszz/M+gRSZ6Hh94MIeKtrA+6E3DxWWqQ28S5KLtYuG33gAmSValutksnMDK0bsq08e/oPoaNvVxZR/7VtUh+yFw3PmS1PxCkk=\\\"}";
////			JSONObject jsonObject = new JSONObject(str);
//			obj = generateAESDecryption("53fbc6b9ab19d7572485926ac0aa7acc","ZjoUARJjcVqoVSrKJbppUNIT2xKR7du6fX6AoQwuZaNSruU99eiQToG/SudWvS9m3jbMV+2FUQUzDMb+8bbke4eaT3Oz5oen4HLvU90+wqNaRvRcwmg3UjqiYJ3XJ0pXknYFw1sHWsrij8tjE2g7GGrdc6RpIX5ma+aKwJKGHQwSTlgcDBRI4IJLgze0O9Zhz5vJhAs/e4dTswxHRlcSMPf6BK0Lgsqk4ZmkTGqWHd8M16tr0lxHs1SiLBTgdmxvImF1lsTgAbyuDVCCAjSVkafPjGZbmN8/nchq6qEJvqvI3i2p2SUnYP44JX3I+chXOIK4+p86weHLffZCday7gp25f25zD2XXu8Y7KQ9IVwvpifwrevlgCIFqTl7KkKiYznetyTKqMLvNFcfD82bgVxW9zcH/3qzIWg1QKO2e5VpZ7zOzFTycAsM7mwNWbX06VjCHjVM92CMu5Wt6qWjaAuLFM99AV/+rXuE0/DQgtEP7eXseBOT3od3/hlYJ/v/7IyDzg3JC53MsmumltvzWcMk9H9xSaK7s3bVnjfJ+yKb6c4jEDE2G6K8LDgVWRWahaBRVybwwon/NU6nM5+DSBuk99drVsQF4aHHQ3Mm/vp3FXMD92zzOW0xRehPRhGhyXNEPmvuVV7Un5ldO0ehUrPVBRyJSwZhpHlUT9Hg+6WAbGAZxAcVSCizg+AmL6cdD7/ZIFAhZGokuGL6hYOUvA7I0+Zja7TNhm6JAizocCPsep1cbU1BFE0v0CuX3rPGUMO7faWP/tF6Xr4HhNBH4JVigr4Za8Fa2mHdCESLSqC4277iTGtcFg1kDITPK2myDzUCPP/ndqSCoOGYpJtA7AOesKbGpn116JK1CXj8E1ruQ9s4H1EtT+ShCCF+W+WqRCc/5++W4JYszz/M+gRSZ6Hh94MIeKtrA+6E3DxWWqQ28S5KLtYuG33gAmSValutksnMDK0bsq08e/oPoaNvVxZR/7VtUh+yFw3PmS1PxCkk="); 
////			obj = generateAESDecryption("53fbc6b9ab19d7572485926ac0aa7acc", "SmhMS1JsGoFvhOHzg/YQdFW86Nb5T1wCSq2+7qXMBARJGsajmsRGe+nO76W56f4uNiD+Y0VuJUFBTtOZSbG9PA==");
//		} catch (IllegalBlockSizeException | BadPaddingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.err.println(obj);
//		
//	}
//	
//	public static String generateAESDecryption(String sercretKey, String message)
//            throws IllegalBlockSizeException, BadPaddingException {
//        String base64EncryptedString = "";
//        MessageDigest md = null;
//        try {
//            md = MessageDigest.getInstance("SHA-256");
//            byte[] digestOfPassword = md.digest(sercretKey.getBytes(StandardCharsets.UTF_8));
//            //System.out.println(" Message Digest Byte[] String : " + digestOfPassword);
//            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
//            byte[] iv = Arrays.copyOf(digestOfPassword, 16);
//            //System.out.println(" keyBytes Byte[] String : " + digestOfPassword);
//            //System.out.println(" iv Byte[] String : " + digestOfPassword);
//            SecretKey key = new SecretKeySpec(keyBytes, "AES");
//            Cipher cipher = null;
//            try {
//                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//                IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
//                try {
//                    cipher.init(Cipher.DECRYPT_MODE, key, ivParameterSpec);
//                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
//                    e.printStackTrace();
//                }
//                return new String(cipher.doFinal(Base64.getDecoder().decode(message)));
//            } catch (NoSuchPaddingException e) {
//                e.printStackTrace();
//            }
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//        return base64EncryptedString;
//    }
//	
//	public static void main20(String[] args) {
////		String  json ="{\r\n  \"fromDate\": \"10-10-2022\",\r\n  \"headerParameterToRequestPojo\": \"string\",\r\n  \"ip\": \"string\",\r\n  \"loginEmail\": \"varun.sharma@rapipay.com\",\r\n  \"loginMobile\": \"9845005048\",\r\n  \"toDate\": \"10-10-2022\"\r\n}";
////		JSONObject jsonObject = new JSONObject(json);
////		System.err.println(XML.toString(jsonObject));
////		String xml ="<fromDate>10-10-2022</fromDate><loginEmail>varun.sharma@rapipay.com</loginEmail><headerParameterToRequestPojo>string</headerParameterToRequestPojo><ip>string</ip><toDate>10-10-2022</toDate><loginMobile>9845005048</loginMobile>";
////		String string = "<FLAT_RESPONSE>"+ xml +"</FLAT_RESPONSE>";
////		
////		System.err.println(XML.toJSONObject(string,true));
//		
//		int a=87;
//		System.err.println(a/50);
//	
//	}
//	
//	public static JSONObject[] getSlice(JSONArray array, int startIndex, int endIndex) {
//		JSONObject[] slicedArray = new JSONObject[endIndex - startIndex];
//		for (int i = 0; i < slicedArray.length; i++) {
//			slicedArray[i] = array.optJSONObject(i);
//		}
//		return slicedArray;
//	}
//	
//	public static void main51(String[] args) throws ParseException {
//		LocalDate date = LocalDate.now().minusDays(1);
//		String xml ="<fromDate>{FROMDATE}</fromDate><loginEmail>varun.sharma@rapipay.com</loginEmail><headerParameterToRequestPojo>string</headerParameterToRequestPojo><ip>string</ip><toDate>{TODATE}</toDate><loginMobile>9845005048</loginMobile>";
//		String finalStr=xml.replace("{FROMDATE}", date.toString()).replace("{TODATE}",date.toString());
//		String string = "<FLAT_RESPONSE>"+ finalStr +"</FLAT_RESPONSE>";
//		System.err.println(string);
//	}
//	
	public String main333(){
		
//		System.err.println(String.valueOf(Double.parseDouble("12.988")));

//		FileReader fr = new FileReader("D:\\test.pdf");
//		BufferedReader br = new BufferedReader(fr);
//		
//	       int i;    
//	          while((i=br.read())!=-1){  
//	          System.out.print((char)i);  
//	          }  
//	          br.close();    
//	          fr.close(); 
		Test test = new Test("1","2","3");
		ModelMapper mapper = new ModelMapper();
		TestDto dto=mapper.map(test, TestDto.class);
		
		System.err.println(dto.toString());
		return null;
	}
	
	@GetMapping("/testapi")
	public String myFunapi() {
//		int i=12/0;

		try {
			String s=null;
			s.length();
			return "Here we go";
		} 
//			catch (NullPointerException e) {
////			System.err.println(e);
////		}
			catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
	
	
}
