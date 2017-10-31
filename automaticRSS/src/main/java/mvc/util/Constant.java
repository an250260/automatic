package mvc.util;

public class Constant {

	public static final String MaillingStatus_1 = "使用者許可";
	public static final String MaillingStatus_2 = "使用者拒否";
	public static final String MaillingStatus_3 = "エラー停止";
	
	public static final String AffiliatesStatus_0 = "無効";
	public static final String AffiliatesStatus_1 = "有効";
	public static final String AffiliatesStatus_2 = "保留";
	public static final String AffiliatesStatus_3 = "ブラック";
	
	public static final String MailSendingStatus_1 = "配信お待ち";
	public static final String MailSendingStatus_0 = "配信済み";
	
	
	public static String setAffiliattesStatusName(int id){
		if(id == 0){
			return  AffiliatesStatus_0;
		}else if(id == 1){
			return  AffiliatesStatus_1;
		}else if(id == 2){
			return  AffiliatesStatus_2;
		}else if(id == 3){
			return  AffiliatesStatus_3;
		}else{
			return "error";
		}
	}
	
	public static String setMaillingStatusName(int id){
		if(id == 1){
			return  MaillingStatus_1;
		}else if(id == 2){
			return  MaillingStatus_2;
		}else if(id == 3){
			return  MaillingStatus_3;
		}else{
			return "error";
		}
	}
	
	public static String setMailScheduletatusName(int id){
		if(id == 1){
			return  MailSendingStatus_1;
		}else if(id == 0){
			return  MailSendingStatus_0;
		}else{
			return "error";
		}
	}
}
