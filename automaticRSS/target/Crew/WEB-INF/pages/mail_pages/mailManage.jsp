<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">

<head>

<title>配信メール管理 | CREW 管理</title>

<jsp:include page='../template/library.jsp' />

<script>
	
	function mailDataValidation(){
 		if(fieldBlankSetErrorValidation("#ManageMailTitle", "入力してください") && fieldBlankSetErrorValidation("#ManageMailSendDatetime", "入力してください") 
				&& fieldBlankSetErrorValidation("#ManageMailFromName", "入力してください") && fieldBlankSetErrorValidation("#ManageMailFromAddress", "入力してください")
				&& fieldBlankSetErrorValidation("#ManageMailSubject", "入力してください") && fieldBlankSetErrorValidation("#ManageMailBody", "入力してください")
				&& validateDate($("#ManageMailSendDatetime").val()) ){
			return true;
		} 
		
	    return false;
	}	

	function checkMaillingValid() {
		if(mailDataValidation()){
			
		
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "api/mail/checkMailValid",
			data : $('#maillingList').val(),
			dataType : 'json',
			timeout : 100000,
			success : function(data) {
				$('#validMaillingList').val(data.maillingList);
				ConfirmDialog(data.numberOfValid + "件が正常で配信しますか");

			},
			error : function(e) {
			},
			done : function(e) {
			}
		});
	}
	}
	function ConfirmDialog(message) {
		$('<div></div>')
				.appendTo('body')
				.html(
						"<div style='width: 200px'><h6>" + message
								+ "?</h6></div>")
				.dialog(
						{
							modal : true,
							title : '配信確認',
							zIndex : 10000,
							autoOpen : true,
							width : 'auto',
							resizable : false,
							buttons : {
								はい : function() {
									// $(obj).removeAttr('onclick');                                
									// $(obj).parents('.Parent').remove();

									$(this).dialog("close");
									$('#ManageMailAddForm').submit();
								},
								いいえ : function() {
									$(this).dialog("close");
								}
							},
							close : function(event, ui) {
								$(this).remove();
							}
						});
	};
</script>
</head>

<body>
	<!-- pagebody start -->
	<div class="pagebody">

		<jsp:include page="../template/header.jsp" />

		<div class="contents wrapper clearfix">

			<jsp:include page="../template/navMail.jsp" />

			<!-- main start -->
			<div class="main">
				<h2 class="orange margin_b_20">一括メール配信新規登録</h2>
				<form action="../affiliates/list" method="POST"
					id="ManageMailAddForm" accept-charset="utf-8">
					<input type="hidden" name="MaillingList" value="${maillingList}" id="maillingList" />
					<input type="hidden" name="ValidMaillingList" value="" id="validMaillingList" />
					<input type="hidden" name="MaillingId" value="${MailId}" id="maillingId" /> 
					<table>
						<tbody>
							<tr>
								<th width="25%">タイトル(管理用)</th>
								<td>
									<div class="input text required">
										<input name="MailTitle" value="${MailTitle}" type="text" id="ManageMailTitle"
											required="required" maxlength="35">
									</div> <span class="gray_s">例）20XX年XX月キャンペーン告知</span>
								</td>
							</tr>
							<tr>
								<th>配信対象</th>
								<td>
									<p>アフィリエイター (送信対象: ${numberOfMail} 件) ${MailTarget}</p>
									<p></p>
								</td>
							</tr>
							<tr>
								<th>配信予定日時</th>
								<td>
									<div class="input text required">
										<input name="MailSendDateTime" type="text" value="${MailSendDateTime}"
											id="ManageMailSendDatetime" required="required" maxlength="19"/>
									</div>
									<p id="ManageMailSendDatetime_pretty"></p> <span class="gray_s">※10分以内の日時を設定した場合は自動的に10分後の日時に設定されます</span>
								</td>
							</tr>
							<tr>
								<th>差出人名</th>
								<td>
									<div class="input text required">
										<input name="MailFromName" type="text" id="ManageMailFromName" value="${MailFromName}"
											required="required" maxlength="35">
									</div> <span class="gray_s">例）○○アフィリエイトセンター</span>
								</td>
							</tr>
							<tr>
								<th>差出人アドレス</th>
								<td>
									<div class="input text required">
										<input name="MailFromAddress" type="text" value="${MailFromAddress}"
											id="ManageMailFromAddress" required="required" maxlength="35">
									</div> <span class="gray_s">例）from@exmaple.com</span>
								</td>
							</tr>
							<tr>
								<th>件名</th>
								<td>
									<div class="input text required">
										<input name="MailSubject" type="text" id="ManageMailSubject" value="${MailSubject}"
											required="required" maxlength="35">
									</div> <span class="gray_s">例）今月のキャンペーン情報</span>
								</td>
							</tr>
							<tr>
								<th colspan="2">本文</th>
							</tr>
							<tr>
								<td colspan="2">[置換タグ]<br> <span
									class="small green button input" id="ManageMailReplaceIdButton">アフィリエイターID</span>
									<span class="small green button input"
									id="ManageMailReplaceEmailButton">メールアドレス(ログインID)</span> <span
									class="small green button input"
									id="ManageMailReplaceFamilyNameButton">お名前(姓)</span> <span
									class="small green button input"
									id="ManageMailReplaceGivenNameButton">お名前(名)</span> <span
									class="small green button input"
									id="ManageMailReplaceAffiliTagButton">アフィリタグ(汎用)</span> <span
									class="small green button input"
									id="ManageMailReplaceCenterNameButton">アフィリエイトセンター名</span> <span
									class="small green button input"
									id="ManageMailReplaceAffiliateLoginUrlButton">アフィリエイターログインURL</span>
									<span class="small green button input"
									id="ManageMailReplaceAffiliateRemindUrlButton">アフィリエイターリマインダーURL</span>
									<span class="small green button input"
									id="ManageMailReplaceStopMailUrlButton">メール配信停止URL</span> <input
									type="hidden" id="ManageMailReplaceIdText"
									value="%<affiliate_id>%" readonly="readonly"> <input
									type="hidden" id="ManageMailReplaceEmailText" value="%<email>%"
									readonly="readonly"> <input type="hidden"
									id="ManageMailReplaceFamilyNameText" value="%<family_name>%"
									readonly="readonly"> <input type="hidden"
									id="ManageMailReplaceGivenNameText" value="%<given_name>%"
									readonly="readonly"> <input type="hidden"
									id="ManageMailReplaceAffiliTagText"
									value="%<center_url>%/ad/■案件ID■/%<affiliate_id>%/"
									readonly="readonly"> <input type="hidden"
									id="ManageMailReplaceStopMailUrlText" value="%<stop_mail_url>%"
									readonly="readonly"> <input type="hidden"
									id="ManageMailReplaceCenterNameText" value="%<center_name>%"
									readonly="readonly"> <input type="hidden"
									id="ManageMailReplaceAffiliateLoginUrlText"
									value="%<affiliate_login_url>%" readonly="readonly"> <input
									type="hidden" id="ManageMailReplaceAffiliateRemindUrlText"
									value="%<affiliate_remind_url>%" readonly="readonly"> <br>

									[アフィリタグ]<br> <select
									name="data[ManageMail][product_group_id]"
									id="SearchSelectProductGroups">

										<option value=""></option>
										<option value="1264">未払報酬移行グループ</option>
										<option value="1265">CREWテスト</option>
										<option value="1275">【秋の特別番組】億万長者スタジアム</option>
										<option value="1307">プロジェクト - Beyond -</option>
										<option value="1548">エンドレスリピートオーナー養成講座</option>
										<option value="1658">インダストリー4.0 AutoRegister</option>
										<option value="1857">年商１億円オーナープロジェクト</option>
										<option value="1862">郡司拓弥個別面談</option>
										<option value="1938">LINE＠スマホBANK</option>
										<option value="2064">鈴木雄一×今野杏南</option>
										<option value="2073">Billion Brain Project</option>
								</select> <select name="data[ManageMail][product_id]"
									id="SearchSelectProducts">

										<option value=""></option>
								</select> <select name="data[ManageMail][product_lp_id]"
									id="SearchSelectProductLps">

										<option value="">ランダム表示</option>
								</select> <span class="small green button input"
									id="ManageMailInsertAffiliateTagButton">挿入</span>

									<div class="input textarea required">
										<textarea name="MailBody" rows="15" cols="30" 
											id="ManageMailBody" required="required">${MailBody}</textarea>
									</div> <span class="gray_s">例）今月のキャンペーン情報</span>
								</td>
							</tr>
							<tr>
								<th colspan="2">備考(アフィリセンター運営者のみ閲覧可)</th>
							</tr>
							<tr>
								<td colspan="2"><div class="input textarea">
										<textarea name="MailNote" cols="30" rows="6"
											id="ManageMailManagerNote">${MailNote}</textarea>
									</div></td>
							</tr>
						</tbody>
					</table>

					<div class="submit_box">
						<button onclick="history.back();return false"
							onkeypress="history.back();return false" class="white button"
							type="submit">戻る</button>
						&nbsp;&nbsp;&nbsp;&nbsp; <input id="formMailCreateSubmitButton" class="large orange button" onclick="checkMaillingValid()" value="内容を確認する" />
					</div>
					<!-- main start -->
				</form>
			</div>
		</div>




		<!-- footer start -->
		<jsp:include page="../template/footer.jsp" />
		<!-- footer end -->

	</div>
</body>
<!-- pagebody end -->