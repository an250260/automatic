package mvc.util;

public class Constant {

	public static final String MaillingStatus_1 = "�g�p�ҋ���";
	public static final String MaillingStatus_2 = "�g�p�ҋ���";
	public static final String MaillingStatus_3 = "�G���[��~";
	
	public static final String AffiliatesStatus_0 = "����";
	public static final String AffiliatesStatus_1 = "�L��";
	public static final String AffiliatesStatus_2 = "�ۗ�";
	public static final String AffiliatesStatus_3 = "�u���b�N";
	
	public static final String MailSendingStatus_1 = "�z�M���҂�";
	public static final String MailSendingStatus_0 = "�z�M�ς�";
	
	
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
