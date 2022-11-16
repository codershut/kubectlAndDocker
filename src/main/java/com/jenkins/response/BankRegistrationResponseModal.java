package com.jenkins.response;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class BankRegistrationResponseModal {

	private String apiResponseCode;
	private String apiResponseMessage;
	private BankApiResponseData apiResponseData;
	private String apiResponseTime;
	private String apiResponseFrom;
	
	public BankRegistrationResponseModal() {
		super();
		this.apiResponseCode = "";
		this.apiResponseMessage = "";
		this.apiResponseTime =  new SimpleDateFormat("YYYY-MM-DD").format(new Date()); //ddMMyyyyHHmmss 
		this.apiResponseFrom = "RFPL";
		this.apiResponseData = new BankApiResponseData() ;
	}

	
	public class BankApiResponseData {
		private String responseCode = "";
		private String responseMessage = "";
		private ArrayList<String> serviceCategoryList = new ArrayList<>();
		private String mid = "";
		private String smid = "";
		private String serviceType = "";
		private String urn = "";

		public BankApiResponseData() {
			this.responseCode = "";
			this.responseMessage = "";
			this.serviceCategoryList = new ArrayList<>();
			this.mid = "";
			this.smid = "";
			this.serviceType = "";
			this.urn = "";
		}

		public String getResponseCode() {
			return responseCode;
		}

		public void setResponseCode(String responseCode) {
			this.responseCode = responseCode;
		}

		public String getResponseMessage() {
			return responseMessage;
		}

		public void setResponseMessage(String responseMessage) {
			this.responseMessage = responseMessage;
		}

		public ArrayList<String> getServiceCategoryList() {
			return serviceCategoryList;
		}

		public void setServiceCategoryList(ArrayList<String> serviceCategoryList) {
			this.serviceCategoryList = serviceCategoryList;
		}

		public String getMid() {
			return mid;
		}

		public void setMid(String mid) {
			this.mid = mid;
		}

		public String getSmid() {
			return smid;
		}

		public void setSmid(String smid) {
			this.smid = smid;
		}

		public String getServiceType() {
			return serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getUrn() {
			return urn;
		}

		public void setUrn(String urn) {
			this.urn = urn;
		}

		@Override
		public String toString() {
			return "BankApiResponseData [responseCode=" + responseCode + ", responseMessage=" + responseMessage
					+ ", mid=" + mid + ", smid=" + smid + ", serviceType=" + serviceType + ", urn=" + urn + "]";
		}
	
	}

	public String getApiResponseCode() {
		return apiResponseCode;
	}

	public void setApiResponseCode(String apiResponseCode) {
		this.apiResponseCode = apiResponseCode;
	}

	public String getApiResponseMessage() {
		return apiResponseMessage;
	}

	public void setApiResponseMessage(String apiResponseMessage) {
		this.apiResponseMessage = apiResponseMessage;
	}

	public BankApiResponseData getApiResponseData() {
		return apiResponseData;
	}

	public void setApiResponseData(BankApiResponseData apiResponseData) {
		this.apiResponseData = apiResponseData;
	}

	public String getApiResponseTime() {
		return apiResponseTime;
	}

	public void setApiResponseTime(String apiResponseTime) {
		this.apiResponseTime = apiResponseTime;
	}

	public String getApiResponseFrom() {
		return apiResponseFrom;
	}

	public void setApiResponseFrom(String apiResponseFrom) {
		this.apiResponseFrom = apiResponseFrom;
	}

	@Override
	public String toString() {
		return "BankRegistrationResponseModal [apiResponseCode=" + apiResponseCode + ", apiResponseMessage="
				+ apiResponseMessage + ", apiResponseData=" + apiResponseData + ", apiResponseTime=" + apiResponseTime
				+ ", apiResponseFrom=" + apiResponseFrom + "]";
	}

	
}
