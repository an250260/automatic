<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">

<head>

	<title>配信メール管理 | CREW 管理</title>

	<jsp:include page="template/library.jsp" />
	
	<script>
 	function submitViaAjax() {
		var submit = {}
		submit["title"] = 'test title';
		submit["send_target"] = 'test send_target';
		submit["send_time"] = 'test send_time';
		submit["sender_name"] = 'test sender_name';
		submit["sender_address"] = 'test sender_address';
		submit["mail_title"] = 'test mail_title';
		submit["mail_content"] = 'test mail_content';
		submit["mai_note"] = 'test mai_note';

		

		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "${home}search/api/getSearchResult",
			data : JSON.stringify(submit),
			dataType : 'json',
			timeout : 100000,
			success : function(data) {
				console.log("SUCCESS: ", data);
				//alert(data.msg);
				alert(data.msg);
				
				//display(data);
			},
			error : function(e) {
				console.log("ERROR: ", e);
				alert("error");
				//display(e);
			},
			done : function(e) {
				console.log("DONE");
				alert("done");
				//enableSearchButton(true);
			}
		});

	}	 
 	</script>
</head>

<body>
<!-- pagebody start -->
<div class="pagebody">

	<jsp:include page="template/header.jsp" />

	 <button onclick="submitViaAjax()">Click me</button>
<div class="contents wrapper clearfix">
		<div class="crumb"><a href="/manage">アフィリセンター管理トップ</a>&nbsp;&gt;&gt;&nbsp;<a href="/manage/mails">一括メール配信管理</a>&nbsp;&gt;&gt;&nbsp;一括メール配信新規登録</div>
						<!-- side start -->
		<div class="side">
						<div class="side_box margin_b_20">
				<div class="side_box_inner">
					<div class="side_box_body">
						<h3 class="orange">一括メール配信</h3>
						<ul class="side_menu">
							<li class="m_orange"><a href="/manage/mails">一括メール配信管理</a></li>
							<li class="m_orange"><a href="/manage/error_mails">エラーメール管理</a></li>
						</ul>
						
					</div>
				</div>
			</div>		</div>
		<!-- side end -->

		<!-- main start -->
		<div class="main">
			<h2 class="orange margin_b_20">一括メール配信新規登録</h2>

			<form action="/manage/mails/add" novalidate="novalidate" id="ManageMailAddForm" method="post" accept-charset="utf-8"><div style="display:none;"><input type="hidden" name="_method" value="POST"><input type="hidden" name="data[_Token][key]" value="3034b74d3c787bee0f9612701995e9fa4cdad77a" id="Token1281634849"></div>			<input type="hidden" name="data[ManageMail][target]" value="1" id="ManageMailTarget">			<input type="hidden" name="data[ManageMail][target_conditions]" value="N;" id="ManageMailTargetConditions">
			<input type="hidden" name="data[ManageMail][confirm]" value="1" id="ManageMailConfirm">			
				<h4 class="orange margin_b_20">登録情報</h4>
				
				<table>
					<tbody><tr>
						<th width="25%">タイトル(管理用)</th>
						<td>
							<div class="input text required"><input name="data[ManageMail][title]" type="text" id="ManageMailTitle" required="required"></div>							<span class="gray_s">例）20XX年XX月キャンペーン告知</span>
						</td>
					</tr>
					<tr>
						<th>配信対象</th>
						<td>
							<p>アフィリエイター (送信対象:6,706件)</p>
							<p></p>
						</td>
					</tr>
					<tr>
						<th>配信予定日時</th>
						<td>
							<div class="input text required"><input name="data[ManageMail][send_datetime]" type="text" value="2017-09-26 16:13:00" id="ManageMailSendDatetime" required="required"/></div>							<p id="ManageMailSendDatetime_pretty"></p>
							<span class="gray_s">※10分以内の日時を設定した場合は自動的に10分後の日時に設定されます</span>
						</td>
					</tr>
					<tr>
						<th>差出人名</th>
						<td>
							<div class="input text required"><input name="data[ManageMail][from_name]" type="text" id="ManageMailFromName" required="required"></div>							<span class="gray_s">例）○○アフィリエイトセンター</span>
						</td>
					</tr>
					<tr>
						<th>差出人アドレス</th>
						<td>
							<div class="input text required"><input name="data[ManageMail][from_address]" type="text" id="ManageMailFromAddress" required="required"></div>							<span class="gray_s">例）from@exmaple.com</span>
						</td>
					</tr>
					<tr>
						<th>件名</th>
						<td>
							<div class="input text required"><input name="data[ManageMail][subject]" type="text" id="ManageMailSubject" required="required"></div>							<span class="gray_s">例）今月のキャンペーン情報</span>
						</td>
					</tr>
					<tr>
						<th colspan="2">本文</th>
					</tr>
					<tr>
						<td colspan="2">
							[置換タグ]<br>
							<span class="small green button input" id="ManageMailReplaceIdButton">アフィリエイターID</span>
							<span class="small green button input" id="ManageMailReplaceEmailButton">メールアドレス(ログインID)</span>
							<span class="small green button input" id="ManageMailReplaceFamilyNameButton">お名前(姓)</span>
							<span class="small green button input" id="ManageMailReplaceGivenNameButton">お名前(名)</span>
							<!-- <span class="small green button input" id="ManageMailReplaceAffiliTagButton">アフィリタグ(汎用)</span> -->
							<span class="small green button input" id="ManageMailReplaceCenterNameButton">アフィリエイトセンター名</span>
							<span class="small green button input" id="ManageMailReplaceAffiliateLoginUrlButton">アフィリエイターログインURL</span>
							<span class="small green button input" id="ManageMailReplaceAffiliateRemindUrlButton">アフィリエイターリマインダーURL</span>
							<span class="small green button input" id="ManageMailReplaceStopMailUrlButton">メール配信停止URL</span>
							
<%-- 							<input type="hidden" id="ManageMailReplaceIdText" value="<%affiliate_id%>" readonly="readonly">
							<input type="hidden" id="ManageMailReplaceEmailText" value="<%email%>" readonly="readonly">
							<input type="hidden" id="ManageMailReplaceFamilyNameText" value="<%family_name%>" readonly="readonly">
							<input type="hidden" id="ManageMailReplaceGivenNameText" value="<%given_name%>" readonly="readonly">
							<input type="hidden" id="ManageMailReplaceAffiliTagText" value="<%center_url%>/ad/■案件ID■/<%affiliate_id%>/" readonly="readonly">
							<input type="hidden" id="ManageMailReplaceStopMailUrlText" value="<%stop_mail_url%>" readonly="readonly">
							<input type="hidden" id="ManageMailReplaceCenterNameText" value="<%center_name%>" readonly="readonly">
							<input type="hidden" id="ManageMailReplaceAffiliateLoginUrlText" value="<%affiliate_login_url%>" readonly="readonly">
							<input type="hidden" id="ManageMailReplaceAffiliateRemindUrlText" value="<%affiliate_remind_url%>" readonly="readonly">
 --%>							<br>
							
							[アフィリタグ]<br>
							<select name="data[ManageMail][product_group_id]" id="SearchSelectProductGroups">

<option value=""></option><option value="1264">未払報酬移行グループ</option><option value="1265">CREWテスト</option><option value="1275">【秋の特別番組】億万長者スタジアム</option><option value="1307">プロジェクト - Beyond -</option><option value="1548">エンドレスリピートオーナー養成講座</option><option value="1658">インダストリー4.0  AutoRegister</option><option value="1857">年商１億円オーナープロジェクト</option><option value="1862">郡司拓弥個別面談</option><option value="1938">LINE＠スマホBANK</option><option value="2064">鈴木雄一×今野杏南</option><option value="2073">Billion Brain Project</option></select>							<select name="data[ManageMail][product_id]" id="SearchSelectProducts">

<option value=""></option></select>							<select name="data[ManageMail][product_lp_id]" id="SearchSelectProductLps">

<option value="">ランダム表示</option></select>							<span class="small green button input" id="ManageMailInsertAffiliateTagButton">挿入</span>
							<input type="hidden" id="SearchSelectProductLpLabelRandom" value="1">
							<input type="hidden" id="affiliates_tags_affiliate_list" value="{}">
<%-- 							<input type="hidden" id="affiliates_tags_baseurl" value="<%center_url%>/">
	 --%>						
							<div class="input textarea required"><textarea name="data[ManageMail][body]" rows="15" cols="30" id="ManageMailBody" required="required"></textarea></div>							<span class="gray_s">例）今月のキャンペーン情報</span>
						</td>
					</tr>
					<tr>
						<th colspan="2">備考(アフィリセンター運営者のみ閲覧可)</th>
					</tr>
					<tr>
						<td colspan="2"><div class="input textarea"><textarea name="data[ManageMail][manager_note]" cols="30" rows="6" id="ManageMailManagerNote"></textarea></div></td>
					</tr>
				</tbody></table>
				
				<div class="submit_box">
					<button onclick="history.back();return false" onkeypress="history.back();return false" class="white button" type="submit">戻る</button>					&nbsp;&nbsp;&nbsp;&nbsp;
					<input class="large orange button" type="submit" value="内容を確認する">				</div>
						<!-- main start -->	
	</div>





	<!-- footer start -->
	<div class="footer">
		<div class="wrapper">
			<ul class="footer_navi clearfix margin_b_20">
				<li class="s_white"><a href="http://crew.navy/manage">トップページ</a></li>
				<li class="s_white"><a href="http://crew.navy/manage/product_groups">案件管理</a></li>
				<li class="s_white"><a href="http://crew.navy/manage/contracts/free">成約・アフィリエイト報酬管理</a></li>
				<li class="s_white"><a href="http://crew.navy/manage/affiliates">アフィリエイター管理</a></li>
				<li class="s_white"><a href="http://crew.navy/manage/mails">配信メール管理</a></li>
				<li class="s_white"><a href="http://crew.navy/manage/mails#">システム設定</a></li>
			</ul>
			
			<address>Copyright© <a href="http://kuchiko.net/" target="_blank">Ku-Chi-Ko</a> All Rights Reserved</address>		</div>
		
	</div>
	<!-- footer end -->
</div>

<!-- pagebody end -->
