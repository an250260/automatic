<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>

	<title>アフィリエイター登録 | IMKロープレアフィリエイトセンター</title>

	<jsp:include page="../template/library.jsp" />

<script>

function partnerDataValidation(){
		if(fieldBlankSetErrorValidation("#partnerLastName", "入力してください") && fieldBlankSetErrorValidation("#partnerFirstName", "入力してください") 
			&& fieldBlankSetErrorValidation("#partnerLastNameKana", "入力してください") && fieldBlankSetErrorValidation("#partnerFirstNameKana", "入力してください")
			&& fieldBlankSetErrorValidation("#partnerUsername", "入力してください") && fieldBlankSetErrorValidation("#partnerPassword", "入力してください")
			&& fieldBlankSetErrorValidation("#partnerPasswordConfirm", "入力してください") && passwordSetErrorValidation("#partnerPassword", "#partnerPasswordConfirm", "パスワードとパスワード確認が等しくない")
			&& checkPartnerDupMail()  ){

				return true;
			
	} 
		else{
		    return false;
		}

}	

function passwordSetErrorValidation(element1, element2, msg){
    if( $(element1).val() ==  $(element2).val()) {
    	$(element1).parent().removeClass( "error" );
    	//$( ".error-message" ).remove();
    	$(element1).next().remove();
    	
    	$(element2).parent().removeClass( "error" );
    	//$( ".error-message" ).remove();
    	$(element2).next().remove();
    	return true;
    }else{
    	$(element1).after( "<div class='error-message'>" + msg + "</div>" );
    	$(element1).parent().addClass( "error" );
    	$(element1).focus();
    	
    	$(element2).after( "<div class='error-message'>" + msg + "</div>" );
    	$(element2).parent().addClass( "error" );
    	$(element2).focus();
    	
    	return false;
    }
}

function checkPartnerDupMail() {
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "api/affiliates/checkDupMail",
		data : $('#partnerUsername').val(),
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			if(data.code == 0){
				fieldSetErrorValidation(1, "#partnerUsername","メールアドレスはすでに存在しています");
				return false;
			}else{
				fieldSetErrorValidation(2, "#partnerUsername");
				return true;
			}
		},
		error : function(e) {
			return false;
		},
		done : function(e) {
			return true;
		}
	});
}
</script>
</head>
<body class="head_img"
 >
<!-- pagebody start -->
<div class="pagebody">

	<!-- header start -->
		<jsp:include page="../template/partnerHeader.jsp" />
	<!-- header end -->
		<!-- contents start -->
	<div class="contents wrapper clearfix" style="padding-top: 130px;">
								<!-- main_1c Start -->
		<div class="main_1c">
			<h2 class="green margin_b_20">アフィリエイター登録</h2>
			
			<form action="/partner/affiliates/add?auth=137a045c08eeba211fb4d04d103370da" novalidate="novalidate" id="PartnerAffiliateAddForm" method="post" accept-charset="utf-8">		
			<input type="hidden" name="data[PartnerAffiliate][confirm]" value="1" id="PartnerAffiliateConfirm"/>			
			<table>
				<tr>
					<th width="25%">お名前</th>
					<td>
						<div class="namebox">
							<div class="input text required"><label>姓</label><input name="PartnerLastName" required="required" maxlength="45" type="text" id="partnerLastName"/></div>							<span class="gray_s">例）山田</span>
						</div>
						<div class="namebox">
							<div class="input text required"><label>名</label><input name="PartnerFirstName" required="required" maxlength="45" type="text" id="partnerFirstName"/></div>							<span class="gray_s">例）太郎</span>
						</div>
					</td>
				</tr>
				<tr>
					<th>お名前（フリガナ）</th>
					<td>
						<div class="namebox">
							<div class="input text required"><label>姓</label><input name="PartnerLastNameKana" required="required" maxlength="45" type="text" id="partnerLastNameKana"/></div>							<span class="gray_s">例）ヤマダ</span>
						</div>
						<div class="namebox">
							<div class="input text required"><label>名</label><input name="PartnerFirstNameKana" required="required" maxlength="45" type="text" id="partnerFirstNameKana"/></div>							<span class="gray_s">例）タロウ</span>
						</div>
					</td>
				</tr>
				<tr>
					<th>ランキング表示名</th>
					<td>
						<div class="input text"><input name="PartnerNickname" empty="1" maxlength="45" type="text" id="partnerNickname"/></div>						<span class="gray_s">例）アフィリエイター太郎</span><br />
					</td>
				</tr>
				<tr>
					<th>メールアドレス（ログインID）</th>
					<td>
						<div class="input text"><input name="PartnerUsername" empty="1" maxlength="255" type="text" value="" id="partnerUsername"/></div>						<span class="gray_s">例）example@exmaple.com</span>
					</td>
				</tr>
				<tr>
					<th>パスワード</th>
					<td>
						<div class="input password"><input name="PartnerPassword" empty="1" type="password" id="partnerPassword"/></div>						<span class="gray_s">例）examplepass</span><br />
						<span class="gray_s">※半角英数記号8文字以上</span>
					</td>
				</tr>
				<tr>
					<th>パスワード確認</th>
					<td>
						<div class="input password"><input name="PartnerPasswordConfirm" empty="1" type="password" id="partnerPasswordConfirm"/></div>						<span class="gray_s">※上記のパスワードと同じ内容を入力してください</span>
					</td>
				</tr>
																																																																																																					
			</table>
			
			<div class="submit_box">
				<button onClick="history.back();return false" onKeyPress="history.back();return false" class="white button" type="submit">戻る</button>				&nbsp;&nbsp;&nbsp;&nbsp;
				<input  class="large orange button" onclick="partnerDataValidation()" readonly value="内容を確認する"/>			</div>
			</form>			
		</div>
		<!-- main_1c End -->	
	</div>
	<!-- contents end -->
	<!-- footer start -->
		<jsp:include page="../template/partnerFooter.jsp" />
	<!-- footer end -->
</div>
<!-- pagebody end -->
</body>
</html>